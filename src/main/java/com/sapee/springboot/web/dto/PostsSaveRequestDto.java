package com.sapee.springboot.web.dto;


import com.sapee.springboot.domain.post.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String title;
    private String content;
    private String author;

    @Builder
    public PostsSaveRequestDto(String title, String content, String author){
        this.author = author;
        this.content = content;
        this. title = title;

    }

    public Posts toEntity(){
        return Posts.builder()
                .title(title)
                .author(author)
                .content(content)
                .build();
    }
}
