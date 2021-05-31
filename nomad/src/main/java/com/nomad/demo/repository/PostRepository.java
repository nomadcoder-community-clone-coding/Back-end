package com.nomad.demo.repository;

import com.nomad.demo.domain.post.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
	Long countByCategoryId(Long categoryId);
}
