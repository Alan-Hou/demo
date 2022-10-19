package com.example.demo.model;

import com.example.demo.enums.BizTypeEnums;
import lombok.Data;

import java.util.Map;

@Data
public class DecisionContext {

    private BizTypeEnums bizTypeEnums;

    private Map<String, Object> payload;
}
