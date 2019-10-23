package com.xiongxin.sample.domain.DO;

import com.baomidou.mybatisplus.annotation.TableName;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author lihaodong
 * @since 2019-10-22
 */
@TableName("attempt")
public class Attempt implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String userId;

    private Long alternativeId;

    private Boolean correct;

    private LocalDateTime date;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getAlternativeId() {
        return alternativeId;
    }

    public void setAlternativeId(Long alternativeId) {
        this.alternativeId = alternativeId;
    }

    public Boolean getCorrect() {
        return correct;
    }

    public void setCorrect(Boolean correct) {
        this.correct = correct;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Attempt{" +
                "id=" + id +
                ", userId=" + userId +
                ", alternativeId=" + alternativeId +
                ", correct=" + correct +
                ", date=" + date +
                "}" ;
    }
}
