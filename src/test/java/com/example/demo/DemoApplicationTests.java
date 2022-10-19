package com.example.demo;

import com.example.demo.core.DecisionCoreEngine;
import com.example.demo.enums.BizTypeEnums;
import com.example.demo.model.DecisionContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DemoApplicationTests {

    @Autowired
    private DecisionCoreEngine decisionCoreEngine;

    @Test
    public void decisionTest() {
        DecisionContext decisionContext = new DecisionContext();
        decisionContext.setBizTypeEnums(BizTypeEnums.A);
        decisionCoreEngine.execute(decisionContext);
    }

}
