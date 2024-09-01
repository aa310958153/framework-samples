package com.example.sampletransactionmessagetest.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestServiceImpl implements TestService {
    @Override
    @Transactional
    public void save(Integer id) {
        int i = 1;
    }
}
