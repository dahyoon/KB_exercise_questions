package org.scoula.board.mapper;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.scoula.board.domain.BoardVO;
import org.scoula.config.RootConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes={RootConfig.class})
class BoardMapperTest {
    @Autowired
    private BoardMapper mapper;

    @Test
    @DisplayName("BoardMapper의 목록 불러오기")
    void getList() {
        for (BoardVO board: mapper.getList()) {
            log.info(board);
        }
    }

    @Test
    @DisplayName("BoardMapper의 게시글 읽기")
    public void read() {
        // 존재하는 게시물 번호로 test 진행
        BoardVO board = mapper.read(1L);
        log.info(board);
    }

    @Test
    @DisplayName("BoardMapper의 새 글 작성")
    public void create() {
        BoardVO board = new BoardVO();
        board.setTitle("새로 작성하는 글 제목");
        board.setContent("새로 작성하는 내용");
        board.setWriter("user01");
        mapper.create(board);
        log.info(board);
    }

    @Test
    @DisplayName("BoardMapper의 selectKey 사용 새 글 작성")
    public void createSelectKey() {
        BoardVO board = new BoardVO();
        board.setTitle("새로 작성하는 글 제목");
        board.setContent("새로 작성하는 내용");
        board.setWriter("user01");
        mapper.createSelectKey(board);
        log.info(board);
    }

    @Test
    @DisplayName("BoardMapper의 글 수정")
    public void update() {
        BoardVO board = new BoardVO();
        board.setNo(5L);
        board.setTitle("수정된 제목");
        board.setContent("수정된 내용");
        board.setWriter("user00");
        int count = mapper.update(board);
        log.info("UPDATE COUNT: " + count);
    }

    @Test
    @DisplayName("BoardMapper의 글 삭제")
    public void delete() {
        log.info("DELETE COUNT: " + mapper.delete(3L));
    }
}