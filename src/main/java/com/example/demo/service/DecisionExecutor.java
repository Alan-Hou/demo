package com.example.demo.service;

import com.example.demo.enums.BizTypeEnums;

public interface DecisionExecutor {

    void execute();

    BizTypeEnums support();
}
