package com.ebenezer.todo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@ToString
@Component
@Document(collection = "todo")
public class Todo {

    @Id
    private String id;

    private String title;
    private boolean status;
    private String comments;
    private String createdBy;
    private LocalDateTime createdDate;


}
