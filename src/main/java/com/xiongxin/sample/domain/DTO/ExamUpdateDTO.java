package com.xiongxin.sample.domain.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.xiongxin.sample.util.Id;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Setter
@Getter
public class ExamUpdateDTO {

    @Id
    @NotNull
    private Long id;

    @NotNull
    private String title;

    @NotNull
    private String description;

    @JsonIgnore
    private final LocalDateTime editedAt = LocalDateTime.now();
}
