package com.sparta.spring_project_week02.domain;

import org.springframework.data.jpa.repository.JpaRepository;



public interface PostRepository extends JpaRepository<Post, Long> {
}
