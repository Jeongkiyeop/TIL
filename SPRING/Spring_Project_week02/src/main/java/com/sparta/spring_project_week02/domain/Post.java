package com.sparta.spring_project_week02.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Post extends Timestamped{
    //title , username, timestamped, password,
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    @JsonIgnore
    private String password;

    public Post(PostRequestDto requestDto) {
        this.author = requestDto.getAuthor();
        this.title = requestDto.getTitle();
        this.content = requestDto.getContent();
        this.password = requestDto.getPassword();
    }

    public void update(PostRequestDto requestDto) {
        this.author = requestDto.getAuthor();
        this.title = requestDto.getTitle();
        this.content = requestDto.getContent();
        this.password= requestDto.getPassword();
    }

    public void checkPassword(PostRequestDto requestDto){
        if (this.password.equals(requestDto.getPassword())){
            this.password = requestDto.getPassword();
        }else {
            System.out.println("비밀번호가 일치하지 않습니다.");
        }
    }
}
