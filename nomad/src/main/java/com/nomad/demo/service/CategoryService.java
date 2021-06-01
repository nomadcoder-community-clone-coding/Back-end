package com.nomad.demo.service;

import com.nomad.demo.domain.category.Category;
import com.nomad.demo.domain.category.CategoryResponseDto;
import com.nomad.demo.domain.post.Post;
import com.nomad.demo.domain.post.PostResponseDto;
import com.nomad.demo.repository.CategoryRepository;
import com.nomad.demo.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CategoryService {
	private final PostRepository postRepository;
	private final CategoryRepository categoryRepository;

	public List<CategoryResponseDto> getCategoryList() {
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

	public List<PostResponseDto> getPostListByCategoryId(Long categoryId) {
		List<Post> postList = postRepository.findAllByCategoryId
			(Sort.by(Sort.Direction.DESC, "id"), categoryId);
		List<PostResponseDto> result = new ArrayList<>();
		for (Post post : postList)
			result.add(post.toPostResponseDto(getCategory(post)));
		return result;
	}

	public Category getCategory(Post post) {
		Optional<Category> category = categoryRepository.findById(post.getCategoryId());
		return category.orElseGet(Category::new);
	}
}
