package com.example.demo.facade.impl;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import com.example.demo.core.DecisionCoreEngine;
import com.example.demo.enums.BizTypeEnums;
import com.example.demo.facade.DecisionFacade;
import com.example.demo.model.DecisionContext;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@SofaService(uniqueId = "decision", bindings = @SofaServiceBinding(bindingType = "bolt"))
@Component
public class DecisionFacadeImpl implements DecisionFacade {

    private final DecisionCoreEngine decisionCoreEngine;

    public DecisionFacadeImpl(DecisionCoreEngine decisionCoreEngine) {
        this.decisionCoreEngine = decisionCoreEngine;
    }

    @Override
    public boolean decision(String type) {
        DecisionContext decisionContext = new DecisionContext();
        decisionContext.setBizTypeEnums(BizTypeEnums.valueOf(type));

        Map<String, Object> payLoad = new HashMap<>();
        payLoad.put("kunple", "666");

        decisionContext.setPayload(payLoad);
        decisionCoreEngine.execute(decisionContext);

        return true;
    }
}
