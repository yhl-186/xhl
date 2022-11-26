package com.example.xhl.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.xhl.pojo.LoginForm;
import com.example.xhl.pojo.Teacher;

public interface TeacherService extends IService<Teacher> {


    Teacher login(LoginForm loginForm);


    Teacher getByTeacherById(Long userId);

    IPage<Teacher> getTeachersByOpr(Page<Teacher> paraParam, Teacher teacher);
}
