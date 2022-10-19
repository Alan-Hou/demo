package com.example.demo.core;

import com.example.demo.DecisionRegistry;
import com.example.demo.model.DecisionContext;
import com.example.demo.service.DecisionExecutor;
import com.example.demo.service.DecisionPostProcessor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DecisionCoreEngine {

    private final DecisionRegistry decisionRegistry;

    public DecisionCoreEngine(DecisionRegistry decisionRegistry) {
        this.decisionRegistry = decisionRegistry;
    }

    public void execute(DecisionContext decisionContext){


        List<DecisionExecutor> decisionExecutorList = decisionRegistry.getDecisionExecutors(decisionContext.getBizTypeEnums());

        List<DecisionPostProcessor> decisionPostProcessorList = decisionRegistry.getDecisionPostProcessors(decisionContext.getBizTypeEnums());

        decisionExecutorList.parallelStream().forEach(DecisionExecutor::execute);
        decisionPostProcessorList.parallelStream().forEach(DecisionPostProcessor::process);
    }
}
