package com.lol.controller;


import com.lol.model.MemberVO;
import com.lol.repository.TestDao;
import com.lol.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class MainController {

    @Autowired
    private TestDao dao;

    @GetMapping("api/hello")
    public String test(Model model) throws Exception {

        int count = dao.test();
        String countTest = String.valueOf(count);

        return "테스트임123123";
    }

}
