package com.example.demo;

import com.example.demo.enums.BizTypeEnums;
import com.example.demo.service.DecisionExecutor;
import com.example.demo.service.DecisionPostProcessor;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;


@Component
public class DecisionRegistry {

    public DecisionRegistry(List<DecisionExecutor> decisionExecutorList, List<DecisionPostProcessor> decisionPostProcessorList) {

        decisionExecutorMap = decisionExecutorList.stream().collect(Collectors.groupingBy(DecisionExecutor::support));
        decisionPostProcessorMap = decisionPostProcessorList.stream().collect(Collectors.groupingBy(DecisionPostProcessor::support));
    }

    private final Map<BizTypeEnums, List<DecisionExecutor>> decisionExecutorMap;

    private final Map<BizTypeEnums, List<DecisionPostProcessor>> decisionPostProcessorMap;

    public void register(DecisionExecutor decisionExecutor) {

        if(decisionExecutorMap.containsKey(decisionExecutor.support())) {
            decisionExecutorMap.get(decisionExecutor.support()).add(decisionExecutor);
        } else {
            decisionExecutorMap.put(decisionExecutor.support(), Collections.singletonList(decisionExecutor));
        }

    }

    public void register(DecisionPostProcessor decisionPostProcessor) {
        if(decisionPostProcessorMap.containsKey(decisionPostProcessor.support())) {
            decisionPostProcessorMap.get(decisionPostProcessor.support()).add(decisionPostProcessor);
        } else {
            decisionPostProcessorMap.put(decisionPostProcessor.support(), Collections.singletonList(decisionPostProcessor));
        }
    }

    public List<DecisionExecutor> getDecisionExecutors(BizTypeEnums bizTypeEnums) {
        return decisionExecutorMap.get(bizTypeEnums);
    }

    public List<DecisionPostProcessor> getDecisionPostProcessors(BizTypeEnums bizTypeEnums) {
        return  decisionPostProcessorMap.get(bizTypeEnums);
    }

}
