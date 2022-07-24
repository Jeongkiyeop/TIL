package com.sparta.week01.controller;

import com.sparta.week01.prac.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController     // 이 클래스는 JSON 형태로 응답하는 자동응답기야
public class CourseController {
    @GetMapping("/courses")     //courses라고 get 방식으로 브라우저에서 요청을 하면 아래대로 응답해줄거야
    public Course getCourses() {
        Course course = new Course();
        course.setTitle("웹개발의 봄 스프링");
        course.setDays(35);
        course.setTutor("남병관");
        return course;
    }
}