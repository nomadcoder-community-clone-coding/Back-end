package com.nomad.demo.controller;

import com.nomad.demo.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class CategoryController {
	private final CategoryService categoryService;

	@GetMapping("/category")
	public ResponseEntity<Object> getCategories() {
		return ResponseEntity.ok(categoryService.getCategories());
	}

}
