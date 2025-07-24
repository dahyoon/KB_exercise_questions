package org.scoula.board.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Select;
import org.scoula.board.domain.BoardVO;

public interface BoardMapper {
    // @Select("select * from tbl_board order by no desc")
    public List<BoardVO> getList();

    public BoardVO read(Long no); // SELECT

    public void create(BoardVO board); // INSERT

    public void createSelectKey(BoardVO board); // INSERT with selectKey

    public int update(BoardVO board); // UPDATE

    public int delete(Long no); // DELETE
}
