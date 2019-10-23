package com.xiongxin.sample.controller;


import com.xiongxin.sample.domain.DO.Exam;
import com.xiongxin.sample.domain.DTO.ExamUpdateDTO;
import com.xiongxin.sample.util.DTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lihaodong
 * @since 2019-10-22
 */
@RestController
@RequestMapping("/exams")
public class ExamController {


    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void editExam(@DTO(ExamUpdateDTO.class) Exam exam) {
        System.out.println(exam);
    }
}

