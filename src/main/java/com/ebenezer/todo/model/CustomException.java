package com.ebenezer.todo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class CustomException  {

    private String errorMessage;
    private String errorDescription;
    private LocalDateTime localDateTime;

}
