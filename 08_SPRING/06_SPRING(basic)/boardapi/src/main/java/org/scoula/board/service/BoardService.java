package org.scoula.board.service;

import org.scoula.board.dto.BoardDTO;

import java.util.List;

public interface BoardService {
    public List<BoardDTO> getList();
    public BoardDTO get(Long no);
    public BoardDTO create(BoardDTO board);
    public BoardDTO update(BoardDTO board);
    public BoardDTO delete(Long no);
}