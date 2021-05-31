package com.nomad.demo.domain.category;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false)
	private String name;

	public CategoryResponseDto toCategoryResponseDto(Long postNum) {
		return CategoryResponseDto.builder()
			.id(id)
			.name(name)
			.postNum(postNum)
			.build();
	}
}
