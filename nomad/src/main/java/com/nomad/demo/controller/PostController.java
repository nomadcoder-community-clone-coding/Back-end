package com.nomad.demo.controller;

import com.nomad.demo.domain.post.Post;
import com.nomad.demo.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
@AllArgsConstructor
public class PostController {
	private final PostService postService;

	@GetMapping("/post/{id}")
	public ResponseEntity<Object> getPostDetail(@PathVariable Long id) {
		Optional<Post> post = postService.getPost(id);
		return post.<ResponseEntity<Object>>
			map(value -> ResponseEntity.ok(postService.getPostDetail(value)))
			.orElseGet(() -> ResponseEntity.badRequest().body(HttpStatus.BAD_REQUEST.value()));
	}
}
