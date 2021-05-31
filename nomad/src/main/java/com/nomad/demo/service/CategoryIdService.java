package com.nomad.demo.service;

import com.nomad.demo.domain.category.Category;
import com.nomad.demo.domain.post.DetailResponseDto;
import com.nomad.demo.domain.post.Post;
import com.nomad.demo.repository.CategoryRepository;
import com.nomad.demo.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@AllArgsConstructor

public class CategoryIdService {
    private final PostRepository postRepository;
    private final CategoryRepository categoryRepository;

    public Optional<Post> getPostList(Long categoryId){
        return postRepository.findById(categoryId);
    }

    @Transactional
    public DetailResponseDto getPost(Post post) {
        return post.toDetailResponseDto(getCategory(post));
    }

    public Category getCategory(Post post) {
//		Optional<Category> category = categoryRepository.findById(post.getCategoryId());
//		if (category.isPresent())
//			return category.get();


        return categoryRepository.findById(post.getCategoryId()).get();

    }



}
