package com.nomad.demo.controller;

import com.nomad.demo.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@AllArgsConstructor
public class CategoryController {
	private final CategoryService categoryService;

	@GetMapping("/category")
	public ResponseEntity<Object> getCategoryList() {
		return ResponseEntity.ok(categoryService.getCategoryList());
	}

	@GetMapping("/category/{categoryId}")
	public ResponseEntity<Object> getPostDetail(@PathVariable Long categoryId) {
		return ResponseEntity.ok().body(categoryService.getPostListByCategoryId(categoryId));
	}
}
