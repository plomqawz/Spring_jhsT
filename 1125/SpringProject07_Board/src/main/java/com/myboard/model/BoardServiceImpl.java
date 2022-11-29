package com.myboard.model;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myboard.dto.BoardDTO;

@Service
public class BoardServiceImpl  implements BoardService{
  @Autowired
  private BoardRepository brepository;
	@Override
	public void insert(BoardDTO board) {
		brepository.dao_insert(board);
		
	}

	@Override
	public List<BoardDTO> findAll(HashMap<String, Object> hm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardDTO findByNum(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(BoardDTO board) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getCount(HashMap<String, Object> hm) {
		// TODO Auto-generated method stub
		return 0;
	}

}
