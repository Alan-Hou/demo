package com.example.demo.service.impl.postprocessor;

import com.example.demo.enums.BizTypeEnums;
import com.example.demo.service.DecisionPostProcessor;
import org.springframework.stereotype.Service;

@Service
public class BDecisionPostProcessor implements DecisionPostProcessor {
    @Override
    public void process() {
        System.out.println("post process B");
    }

    @Override
    public BizTypeEnums support() {
        return BizTypeEnums.B;
    }
}
