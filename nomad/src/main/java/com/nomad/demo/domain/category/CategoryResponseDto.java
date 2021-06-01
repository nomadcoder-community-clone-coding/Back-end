package com.nomad.demo.domain.category;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class CategoryResponseDto {
	private final long id;
	private final String name;
	private final Long postNum;
}
