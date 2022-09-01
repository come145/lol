package com.lol.controller;


import com.lol.model.MemberVO;
import com.lol.repository.MemberDao;
import com.lol.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private MemberService service;

    @GetMapping("/api/login")
    public String test(MemberVO vo) throws Exception {



        return service.login(vo);
    }

}
