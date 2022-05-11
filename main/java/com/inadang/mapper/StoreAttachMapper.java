package com.inadang.mapper;

import org.apache.ibatis.annotations.Insert;

import com.inadang.domain.StoreAttach;

public interface StoreAttachMapper {
	@Insert("INSERT INTO TBL_STORE_ATTACH VALUES( #{sno}, #{ano}, #{uuid}, #{path}, #{origin}, #{image})")
	void insert(StoreAttach storeAttach);
	
//	@Delete("DELETE TBL_BOARD_ATTACH WHERE UUID = #{uuid}")
//	void delete(String uuid);
//	
//	@Delete("DELETE TBL_BOARD_ATTACH WHERE bno = #{bno}")
//	void deleteALL(Long bno);
//	
//	@Select("SELECT * FROM TBL_BOARD_ATTACH WHERE BNO = #{bno}")
//	List<BoardAttachVO> findBy(Long bno);
//	
//	@Select("SELECT * FROM TBL_BOARD_ATTACH WHERE PATH = TO_CHAR(SYSDATE - 2, 'YYYY/MM/DD')")
//	List<BoardAttachVO> getOldFiles();
}
