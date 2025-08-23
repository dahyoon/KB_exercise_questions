package org.scoula.board.service;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import lombok.RequiredArgsConstructor;
import org.scoula.board.domain.BoardAttachmentVO;
import org.scoula.board.dto.BoardDTO;
import org.scoula.common.util.UploadFiles;
import org.springframework.stereotype.Service;
import org.scoula.board.domain.BoardVO;
import org.scoula.board.mapper.BoardMapper;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

@Log4j2
@Service
@RequiredArgsConstructor // final 멤버를 인자로 가지는 생성자 추가
public class BoardServiceImpl implements BoardService {
    final private BoardMapper mapper; // 생성자가 1개인 경우 생성자 주입으로 초기화
    private final static String BASE_DIR = "c:/upload/board";

    @Override
    public List<BoardDTO> getList() {
        log.info("getList() 실행..........");
        return mapper.getList().stream() // BoardVO의 stream
                .map(BoardDTO::of)       // BoardDTO의 stream
                .toList();              // List<BoardDTO> 변환
    }

    @Override
    public BoardDTO read(Long no) {
        log.info("read() 실행..........no: " + no);
        BoardDTO board = BoardDTO.of(mapper.read(no));
        return Optional.ofNullable(board)
                .orElseThrow(NoSuchElementException::new);
    }

    @Transactional // 트랜잭션 처리: 2개 이상의 insert문 실행 가능
    @Override
    public void create(BoardDTO board) {
        log.info("create() 실행..........board: " + board);
        BoardVO vo = board.toVo();
        mapper.createSelectKey(vo);
        board.setNo(vo.getNo());

        // 파일 업로드 처리
        List<MultipartFile> files = board.getFiles();
        if (files != null && !files.isEmpty()) {
            upload(vo.getNo(), files);
        }
    }

    private void upload(Long bno, List<MultipartFile> files) {
        for (MultipartFile part : files) {
            if (part.isEmpty()) continue;
            try {
                String uploadPath = UploadFiles.upload(BASE_DIR, part);
                BoardAttachmentVO attach = BoardAttachmentVO.of(part, bno, uploadPath);
                mapper.createAttachment(attach);
            } catch (IOException e) {
                throw new RuntimeException(e); // @Transactional에서 갑지, 자동 rollback
            }
        }
    }

    @Override
    public boolean update(BoardDTO board) {
        log.info("update() 실행..........board: " + board);
        return mapper.update(board.toVo()) == 1;
    }

    @Override
    public boolean delete(Long no) {
        log.info("delete() 실행..........no: " + no);
        return mapper.delete(no) == 1;
    }

    @Override
    public BoardAttachmentVO getAttachment(Long no) {
        return mapper.getAttachment(no);
    }

    @Override
    public boolean deleteAttachment(Long no) {
        return mapper.deleteAttachment(no) == 1;
    }
}
