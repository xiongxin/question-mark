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
@TableName("alternative")
public class Alternative implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Long questionId;

    private Long alternativeOrder;

    private String description;

    private Boolean correct;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public Long getAlternativeOrder() {
        return alternativeOrder;
    }

    public void setAlternativeOrder(Long alternativeOrder) {
        this.alternativeOrder = alternativeOrder;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getCorrect() {
        return correct;
    }

    public void setCorrect(Boolean correct) {
        this.correct = correct;
    }

    @Override
    public String toString() {
        return "Alternative{" +
                "id=" + id +
                ", questionId=" + questionId +
                ", alternativeOrder=" + alternativeOrder +
                ", description=" + description +
                ", correct=" + correct +
                "}" ;
    }
}
