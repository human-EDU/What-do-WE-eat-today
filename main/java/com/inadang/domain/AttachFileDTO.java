package com.inadang.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class AttachFileDTO {
	private Long ano;
	private String uuid;
	private String origin;
	private String path;
	private String regDate;
}
