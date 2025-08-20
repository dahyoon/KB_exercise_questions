package org.scoula.board.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.scoula.board.domain.BoardAttachmentVO;
import org.scoula.board.domain.BoardVO;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BoardDTO {
    private Long no;
    private String title;
    private String content;
    private String writer;
    private Date regDate;
    private Date updateDate;

    // 첨부파일 필드
    private List<BoardAttachmentVO> attachmentList; // 검색 시 첨부파일 목록
    private List<MultipartFile> files = new ArrayList<>(); // 업로드된 파일 목록

    // VO -> DTO 변환
    public static BoardDTO of(BoardVO vo) {
        return vo == null ? null : BoardDTO.builder()
                .no(vo.getNo())
                .title(vo.getTitle())
                .content(vo.getContent())
                .writer(vo.getWriter())
                .attachmentList(vo.getAttachmentList())
                .regDate(vo.getRegDate())
                .updateDate(vo.getUpdateDate())
                .build();
    }

    // DTO -> VO 변환
    public BoardVO toVo() {
        return BoardVO.builder()
                .no(no)
                .title(title)
                .content(content)
                .writer(writer)
                .attachmentList(attachmentList)
                .regDate(regDate)
                .updateDate(updateDate)
                .build();
    }
}
