package com.sparta.spring_project_week02.controller;

import com.sparta.spring_project_week02.domain.Post;
import com.sparta.spring_project_week02.domain.PostRepository;
import com.sparta.spring_project_week02.domain.PostRequestDto;
import com.sparta.spring_project_week02.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
public class PostController {
    private final PostRepository postRepository;
    private final PostService postService;

    //전체 조회
    @GetMapping("/api/post")
    public List<Post> getPost() {
        return postRepository.findAll();
    }

    //개별 조회
    @GetMapping("/api/post/{id}")
    private Optional<Post> findById(@PathVariable Long id) {
        return postRepository.findById(id);
    }

    //게시글 작성
    @PostMapping("/api/post")
    public Post createPost(@RequestBody PostRequestDto requestDto) {
        Post post = new Post(requestDto);
        return postRepository.save(post);
    }

    @PostMapping("/api/post/{id}")
    public String checkPassword(@PathVariable Long id,@RequestBody String password){
        return postService.checkPassword(id, password);
    }

    //게시글 수정
    @PutMapping("/api/post/{id}")
    public Long updatePost(@PathVariable Long id, @RequestBody PostRequestDto requestDto) {
        return postService.update(id, requestDto);
    }

    //게시글 삭제
    @DeleteMapping("/api/post/{id}")
    public Long deletePost(@PathVariable Long id) {
        postRepository.deleteById(id);
        return id;
    }
}
