package com.example.samplespringtransaction.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class TestTransactionDaoImpl implements TestTransactionDao {


    @Override
    @Transactional
    public void processStudent() {

    }
}
