package com.icss.springbootsecurityjwt.model;

import lombok.Data;

import javax.persistence.Transient;

@Data
public class BaseModel {

    @Transient
    private Integer pageNum = 1;//初始页
    @Transient
    private Integer pageSize = 10;//默认分页大小
}
