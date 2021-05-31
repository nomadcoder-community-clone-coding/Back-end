package com.nomad.demo.domain.post;

import com.nomad.demo.domain.category.Category;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter
@NoArgsConstructor
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false)
	private String title;
	@Column(updatable = false)
	@CreatedDate
	private Timestamp createdDate;
	private String writer;
	@Column
	private String writerImage;
	@Column(nullable = false)
	private String content;
	@Column
	private int commentNum;
	@Column
	private long categoryId;

	public DetailResponseDto toDetailResponseDto(Category category) {
		return DetailResponseDto.builder()
			.id(id)
			.writer(writer)
			.title(title)
			.content(content)
			.commentNum(commentNum)
			.createdDate(createdDate)
			.category(category.getName())
			.build();
	}
}
