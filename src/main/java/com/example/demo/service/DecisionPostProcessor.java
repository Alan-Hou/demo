package com.example.demo.service;

import com.example.demo.enums.BizTypeEnums;

public interface DecisionPostProcessor {

    void process();

    BizTypeEnums support();
}
