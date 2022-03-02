package com.spring.springoopcontainerbean.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;


@Getter
@RequiredArgsConstructor
public class Member {
    private Long id;
    private String name;
    private Grade grade;


    @Builder
    public Member(Long id,String name, Grade grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
}
