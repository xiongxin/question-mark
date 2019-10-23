package com.xiongxin.sample.domain.DO;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author lihaodong
 * @since 2019-10-22
 */
@TableName("question")
public class Question implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Long examId;

    private Long questionOrder;

    private String description;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getExamId() {
        return examId;
    }

    public void setExamId(Long examId) {
        this.examId = examId;
    }

    public Long getQuestionOrder() {
        return questionOrder;
    }

    public void setQuestionOrder(Long questionOrder) {
        this.questionOrder = questionOrder;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", examId=" + examId +
                ", questionOrder=" + questionOrder +
                ", description=" + description +
                "}" ;
    }
}
