package com.example.demo.service.impl.postprocessor;

import com.example.demo.enums.BizTypeEnums;
import com.example.demo.service.DecisionPostProcessor;
import org.springframework.stereotype.Service;

@Service
public class ADecisionPostProcessor implements DecisionPostProcessor {
    @Override
    public void process() {
        System.out.println("post process A");
    }

    @Override
    public BizTypeEnums support() {
        return BizTypeEnums.A;
    }
}
