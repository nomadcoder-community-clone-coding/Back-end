package com.nomad.demo.domain.post;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.sql.Timestamp;
@Getter
@AllArgsConstructor
@Builder
public class PostResponseDto {
    private final long id;
    private final String title;
    private final String category;
    private final String writer;
    private final String writerPhoto;
    private final String createdDate;
    private final int commentNum;
    private final long likes;
}
