package com.nomad.demo.controller;

import com.nomad.demo.domain.post.Post;
import com.nomad.demo.domain.post.PostResponseDto;
import com.nomad.demo.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Controller
@AllArgsConstructor
public class CategoryController {
    private final PostService postService;
    private final CategoryService categoryService;
  
    @GetMapping("/category")
    public ResponseEntity<Object> getCategories() {
      return ResponseEntity.ok(categoryService.getCategories());
    }

    @GetMapping("/category/{categoryId}")
    public ResponseEntity<Object> getPostDetail(@PathVariable Long categoryId) {
        List<PostResponseDto> postList = postService.getPostList(categoryId);
            return ResponseEntity.ok().body(postList);
    }
}
