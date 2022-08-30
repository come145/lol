package com.lol.service;

import com.lol.repository.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao dao;

    @Override
    public int test() throws Exception {
        return dao.test();
    }
}
