package com.guest.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.guest.model.GuestVO;

public interface GuestMapper {
	//추가
	@Insert("insert into guest(name, content, grade, created, ipaddr) "
			+ " values(#{name},#{content},#{grade},now(),#{ipaddr})")
	public void insert(GuestVO guest);
	
	
	//전체보기
	@Select("select * from guest")
	public List<GuestVO> list(HashMap<String, String>hm);
	
	//개수
	@Select("select count(*)  from guest")
	public int count(HashMap<String, String> hm);
	//상세보기
	@Select("select * from guest where num=#{num}")
	public GuestVO findByNum(int num);
	//삭제
	public void delete(int num);
	
	

}
