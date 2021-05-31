package com.nomad.demo.repository;

import com.nomad.demo.domain.post.Post;
import net.bytebuddy.TypeCache;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
	Long countByCategoryId(Long categoryId);
	List<Post> findAllByCategoryId(Sort sort, Long categoryId);
}
