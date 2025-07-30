package org.scoula.board.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import lombok.RequiredArgsConstructor;
import org.scoula.board.dto.BoardDTO;
import org.springframework.stereotype.Service;
import org.scoula.board.domain.BoardVO;
import org.scoula.board.mapper.BoardMapper;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@RequiredArgsConstructor // final 멤버를 인자로 가지는 생성자 추가
public class BoardServiceImpl implements BoardService {
    final private BoardMapper mapper; // 생성자가 1개인 경우 생성자 주입으로 초기화

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

    @Override
    public void create(BoardDTO board) {
        log.info("create() 실행..........board: " + board);
        BoardVO vo = board.toVo();
        mapper.create(vo);
        board.setNo(vo.getNo());
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
}
