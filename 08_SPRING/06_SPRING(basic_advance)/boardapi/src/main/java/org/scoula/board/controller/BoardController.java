package org.scoula.board.controller;

import io.swagger.annotations.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.scoula.board.dto.BoardDTO;
import org.scoula.board.service.BoardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/board")
@RequiredArgsConstructor
@Log4j2
@Api(tags="게시글 관리") // API 타이틀 설정
public class BoardController {
    private final BoardService boardService;

    /**
     * 전체 게시글 조회
     * - 엔드포인트: GET /api/board
     */
    @GetMapping("")
    @ApiOperation(value = "게시글 목록", notes = "게시글 목록을 얻는 API")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "성공적으로 요청이 처리되었습니다.", response = BoardDTO.class),
            @ApiResponse(code = 400, message = "잘못된 요청입니다."),
            @ApiResponse(code = 500, message = "서버에서 오류가 발생했습니다.")
    })
    public ResponseEntity<List<BoardDTO>> getList() {
        return ResponseEntity.ok(boardService.getList());
    }

    /**
     * 단일 게시글 조회
     * - 엔드포인트: GET /api/board/{no}
     */
    @GetMapping("/{no}")
    @ApiOperation(value = "게시글 상세 정보 얻기", notes = "게시글 상세 정보를 얻는 API")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "성공적으로 요청이 처리되었습니다.", response = BoardDTO.class),
            @ApiResponse(code = 400, message = "잘못된 요청입니다."),
            @ApiResponse(code = 500, message = "서버에서 오류가 발생했습니다.")
    })
    public ResponseEntity<BoardDTO> get(
            @ApiParam(value = "게시글 ID", required = true, example = "2")
            @PathVariable Long no) {
        return ResponseEntity.ok(boardService.read(no));
    }

    /**
     * 게시글 생성
     * - 엔드포인트: POST /api/board
     * - 요청 Body: JSON 형태의 Board 데이터
     */
    @PostMapping("")
    @ApiOperation(value = "게시글 생성", notes = "게시글 생성 API")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "성공적으로 요청이 처리되었습니다.", response = BoardDTO.class),
            @ApiResponse(code = 400, message = "잘못된 요청입니다."),
            @ApiResponse(code = 500, message = "서버에서 오류가 발생했습니다.")
    })
    public ResponseEntity<BoardDTO> create(
            @ApiParam(value = "게시글 객체", required = true)
            @RequestBody BoardDTO boardDTO) {
        return ResponseEntity.ok(boardService.create(boardDTO));
    }
    /**
     * 게시글 수정
     * - 엔드포인트: PUT /api/board/{no}
     * - 요청 Body:  JSON 형태의 Board 데이터
     */
    @PutMapping("/{no}")
    @ApiOperation(value = "게시글 수정", notes = "게시글 수정 API")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "성공적으로 요청이 처리되었습니다.", response = BoardDTO.class),
            @ApiResponse(code = 400, message = "잘못된 요청입니다."),
            @ApiResponse(code = 500, message = "서버에서 오류가 발생했습니다.")
    })
    public ResponseEntity<BoardDTO> update(
            @ApiParam(value = "게시글 ID", required = true, example = "1")
            @PathVariable Long no,
            @ApiParam(value = "게시글 객체", required = true)
            @RequestBody BoardDTO boardDTO) {
        return ResponseEntity.ok(boardService.update(boardDTO));
    }

    /**
     * 게시글 삭제
     * - 엔드포인트: DELETE /api/board/{no}
     */
    @DeleteMapping("/{no}")
    @ApiOperation(value = "게시글 삭제", notes = "게시글 삭제 API")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "성공적으로 요청이 처리되었습니다."),
            @ApiResponse(code = 400, message = "잘못된 요청입니다."),
            @ApiResponse(code = 500, message = "서버에서 오류가 발생했습니다.")
    })
    public ResponseEntity<BoardDTO> delete(
            @ApiParam(value = "게시글 ID", required = true, example = "1")
            @PathVariable Long no) {
        return ResponseEntity.ok(boardService.delete(no));
    }
}
