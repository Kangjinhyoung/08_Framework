package edu.kh.project.board.service;

import java.util.List;
import java.util.Map;

import edu.kh.project.board.dto.Board;

public interface BoardService {

	/** 게시글 목록 조회
	 * @param boardCode
	 * @param cp
	 * @return map
	 */
	Map<String, Object> selectBoardList(int boardCode, int cp);

	/** 게시글 상세 조회
	 * @param map
	 * @return board
	 */
	Board selectDetail(Map<String, Integer> map);

	
	/** 조회 수 1 증가
	 * @param boardNo
	 * @return result
	 */
	int updateReadCount(int boardNo);

	
	/** 게시글 좋아요
	 * @param boardNo
	 * @param memberNo
	 * @return map
	 */
	Map<String, Object> boardLike(int boardNo, int memberNo);

	/** DB에서 모든 게시판 종류를 조회
	 * @return 
	 */
	List<Map<String, String>> selectBoardTypeList();

}