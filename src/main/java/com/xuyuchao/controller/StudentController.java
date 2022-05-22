package com.xuyuchao.controller;

import com.xuyuchao.mapper.StudentMapper;
import com.xuyuchao.pojo.Student;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: xuyuchao
 * @Date: 2022-05-20-22:01
 * @Description:
 */
@RestController
public class StudentController {

    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    @Autowired
    StudentMapper studentMapper;

    @GetMapping("/students")
    public List<Student> getAllStudent() {
        List<Student> students = studentMapper.getAllStudent();
        students.forEach(System.out::println);
        return students;
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable("id")String id) {
        StudentMapper mapper = sqlSessionTemplate.getMapper(StudentMapper.class);
        Student student = mapper.getStudentById(id);
        return student;
    }

    @RequestMapping("/addStudent")
    public String addStudent() {
        studentMapper.addStudent(new Student("09","test","test","test"));
        return "success";
    }
}
