package com.example.demo.service.impl.executor;

import com.example.demo.enums.BizTypeEnums;
import com.example.demo.service.DecisionExecutor;
import org.springframework.stereotype.Service;

@Service
public class ADecisionExecutorImpl implements DecisionExecutor {

    @Override
    public void execute() {
        System.out.println("execute A");
    }

    @Override
    public BizTypeEnums support() {
        return BizTypeEnums.A;
    }
}
