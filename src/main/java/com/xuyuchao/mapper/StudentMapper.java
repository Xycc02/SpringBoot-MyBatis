package com.xuyuchao.mapper;

import com.xuyuchao.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: xuyuchao
 * @Date: 2022-05-20-21:53
 * @Description:
 */
// @Mapper
@Repository
public interface StudentMapper {
    //获取所有学生
    List<Student> getAllStudent();
    //根据id查找学生
    Student getStudentById(@Param("id")String id);
    //添加学生
    void addStudent(Student student);
    //修改学生
    void updateStudent(Student student);
    //根据id删除学生
    void deleteStudent(String id);
}
