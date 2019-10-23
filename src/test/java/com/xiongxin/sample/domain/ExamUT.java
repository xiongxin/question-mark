package com.xiongxin.sample.domain;

import com.xiongxin.sample.domain.DO.Exam;
import com.xiongxin.sample.domain.DTO.ExamCreatingDTO;
import com.xiongxin.sample.domain.DTO.ExamUpdateDTO;
import org.junit.Test;
import org.modelmapper.ModelMapper;


import static org.junit.Assert.*;


public class ExamUT {

    private static final ModelMapper modelMapper = new ModelMapper();


    @Test
    public void checkExamMapping() {
        ExamCreatingDTO creatingDTO = new ExamCreatingDTO();
        creatingDTO.setTitle("Testing title");
        creatingDTO.setDescription("Testing description");

        Exam exam = modelMapper.map(creatingDTO, Exam.class);

        assertEquals(creatingDTO.getTitle(), exam.getTitle());
        assertEquals(creatingDTO.getDescription(), exam.getDescription());
        assertEquals(creatingDTO.getCreatedAt(), exam.getCreatedAt());
        assertEquals(creatingDTO.getEditedAt(), exam.getEditedAt());

        ExamUpdateDTO updateDTO = new ExamUpdateDTO();
        updateDTO.setTitle("New title");
        updateDTO.setDescription("new Description");

        modelMapper.map(updateDTO, exam);

        assertEquals(updateDTO.getTitle(), exam.getTitle());
        assertEquals(updateDTO.getDescription(), exam.getDescription());
        assertEquals(creatingDTO.getCreatedAt(), exam.getCreatedAt());
        assertEquals(updateDTO.getEditedAt(), exam.getEditedAt());
    }
}
