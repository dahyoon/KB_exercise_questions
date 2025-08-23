package org.scoula.board.service;

import org.scoula.board.domain.BoardAttachmentVO;
import org.scoula.board.dto.BoardDTO;
import java.util.List;
import java.util.Optional;

public interface BoardService {
    public List<BoardDTO> getList();

    public BoardDTO read(Long no);

    public BoardDTO create(BoardDTO boardDTO);

    public BoardDTO update(BoardDTO boardDTO);

    public BoardDTO delete(Long no);

    public BoardAttachmentVO getAttachment(Long no);

    public boolean deleteAttachment(Long no);
}
