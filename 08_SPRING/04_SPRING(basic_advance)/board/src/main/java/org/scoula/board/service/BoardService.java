package org.scoula.board.service;

import org.scoula.board.dto.BoardDTO;
import java.util.List;
import java.util.Optional;

public interface BoardService {
    public List<BoardDTO> getList();

    public BoardDTO read(Long no);

    public void create(BoardDTO boardDTO);

    public boolean update(BoardDTO boardDTO);

    public boolean delete(Long no);
}
