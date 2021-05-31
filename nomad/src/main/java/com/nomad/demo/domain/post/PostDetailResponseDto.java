package com.nomad.demo.domain.post;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.sql.Timestamp;

@Getter
@AllArgsConstructor
@Builder
public class PostDetailResponseDto {
	private final long id;
	private final String title;
	private final String content;
	private final String category;
	private final String writerPhoto;
	private final Timestamp createdDate;
	private final String writer;
	private final int commentNum;
	private final long categoryId; // 이상함
	private final long likes;
}
