package com.inadang.domain;

import java.util.List;
import java.util.function.Function;

import lombok.Data;
/**  
 * @author 
 */
@Data 
public class OptGroup {
	private Long gno ; 
	private String name ;
	
	private List<Option> opts ;
	
	private Long sno;
	private Long mno;

}
