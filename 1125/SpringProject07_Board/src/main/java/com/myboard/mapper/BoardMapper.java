package com.myboard.mapper;

import org.apache.ibatis.annotations.Insert;

import com.myboard.dto.BoardDTO;

public interface BoardMapper {
	//Ãß°¡
	@Insert("insert into board(title, writer, content) values(#{title}, #{writer},#{content})")
	public void insert(BoardDTO board);

}
