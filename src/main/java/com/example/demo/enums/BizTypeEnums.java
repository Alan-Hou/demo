package com.example.demo.enums;

public enum BizTypeEnums {

    A ("业务类型A", 1),
    B ("业务类型A", 2);

    private String desc;
    private int code;

     BizTypeEnums(String desc, int code) {
        this.desc = desc;
        this.code = code;
    }
}
