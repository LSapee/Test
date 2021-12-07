package com.sapee.springboot.service.posts;


import com.sapee.springboot.domain.post.Posts;
import com.sapee.springboot.domain.post.PostsRepository;
import com.sapee.springboot.domain.post.PostsSaveRequestDto;
import com.sapee.springboot.web.dto.PostsResponseDto;
import com.sapee.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto){
        return postsRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, PostsUpdateRequestDto requestDto){
        Posts posts = postsRepository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("해당 게시글이 없습니다. id=" + id)
                );
        posts.update(requestDto.getTitle(), requestDto.getContent());

        return id;
    }

    public PostsResponseDto findById(Long id){
        Posts entity = postsRepository.findById(id).orElseThrow(()->
                new IllegalArgumentException("해당 게시글은 없습니다. id =" + id));

        return  new PostsResponseDto(entity);
    }

}
