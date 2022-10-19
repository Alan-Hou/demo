package com.example.demo.service.impl;

import com.example.demo.service.HelloSyncService;


public class HelloSyncServiceImpl implements HelloSyncService {

    @Override
    public String saySync(String string) {
        return string;
    }
}