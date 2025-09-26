package com.example.xss.XSS.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity

public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter

    private Long id;
    private String author;
    @Lob
    private String content;
}
