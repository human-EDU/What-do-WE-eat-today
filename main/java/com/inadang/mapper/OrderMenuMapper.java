package com.inadang.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.inadang.domain.OrderMenu;

public interface OrderMenuMapper {
	
//	@Select("SELECT * FROM tbl_ordermenu WHERE omno IS NOT NULL")
	public List<OrderMenu> getList();
	
//	@Insert("INSERT INTO tbl_orderMenu VALUES (#{ono}, #{count}, #{price}, SEQ_ORDERMENU.NEXTVAL, #{mno})")
	public int insert(OrderMenu om); 
	
//	@Select("SELECT M.NAME, M.PRICE, N.COUNT FROM TBL_MENU M JOIN TBL_ORDERMENU N USING(mno) WHERE ono = #{ono}")
//	@Select("SELECT * FROM tbl_ordermenu WHERE ono = #{ono}")
	List<OrderMenu> findBy(String ono);
	
//	@Delete("DELETE tbl_ordermenu WHERE mno = #{mno}")
	public int delete(Long mno);
	
//	@Delete("DELETE tbl_ordermenu  WHERE ono = #{ono}")
	public List<OrderMenu> deleteAll(String ono);
}
