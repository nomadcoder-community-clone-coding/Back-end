package com.nomad.demo.service;

import com.nomad.demo.domain.category.Category;
import com.nomad.demo.domain.post.DetailResponseDto;
import com.nomad.demo.domain.post.Post;
import com.nomad.demo.domain.post.PostResponseDto;
import com.nomad.demo.repository.CategoryRepository;
import com.nomad.demo.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PostService {
	private final PostRepository postRepository;
	private final CategoryRepository categoryRepository;

	public Optional<Post> getPost(Long id) {
		return postRepository.findById(id);
	}

	@Transactional
	public DetailResponseDto getPostDetail(Post post) {
		return post.toDetailResponseDto(getCategory(post));
	}

	public Category getCategory(Post post) {
		Optional<Category> category = categoryRepository.findById(post.getCategoryId());
		return category.orElseGet(Category::new);
	}
}

