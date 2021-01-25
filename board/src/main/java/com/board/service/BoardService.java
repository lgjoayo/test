package com.board.service;

import java.util.List;

import com.board.domain.BoardVO;

public interface BoardService {
	public List list() throws Exception; 
	
	//게시물 작성
	public void write(BoardVO vo) throws Exception;	
}
