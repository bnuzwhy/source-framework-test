package com.why.start.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private int id;
    private String name;
    private String pwd;
}
