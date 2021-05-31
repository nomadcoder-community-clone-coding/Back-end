package com.nomad.demo.service;

import com.nomad.demo.domain.category.Category;
import com.nomad.demo.domain.category.CategoryResponseDto;
import com.nomad.demo.repository.CategoryRepository;
import com.nomad.demo.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class CategoryService {
	private final PostRepository postRepository;
	private final CategoryRepository categoryRepository;

	public List<CategoryResponseDto> getCategories() {
		List<Category> categories = categoryRepository.findAll(Sort.by("id"));

		List<CategoryResponseDto> resultList = new ArrayList<>();
		for (Category category: categories) {
			Long postNum = getPostNum(category);
			resultList.add(
				category.toCategoryResponseDto(
					Objects.requireNonNullElse(postNum, 0L)));
		}
		return resultList;
	}

	public Long getPostNum(Category category) {
		return postRepository.countByCategoryId(category.getId());
	}
}
