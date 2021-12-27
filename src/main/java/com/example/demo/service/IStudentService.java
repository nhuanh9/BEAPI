package com.example.demo.service;

import com.example.demo.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IStudentService extends IService <Student> {
    Page<Student> findAllByScoreGreaterThan8(Pageable pageable, Double score);

}