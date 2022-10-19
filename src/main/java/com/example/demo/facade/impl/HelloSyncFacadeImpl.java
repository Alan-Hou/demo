package com.example.demo.facade.impl;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import com.example.demo.facade.HelloSyncFacade;
import org.springframework.stereotype.Component;


@SofaService(uniqueId = "sync", bindings = @SofaServiceBinding(bindingType = "bolt"))
@Component
public class HelloSyncFacadeImpl implements HelloSyncFacade {
    @Override
    public String sync() {
        return "hello";
    }
}
