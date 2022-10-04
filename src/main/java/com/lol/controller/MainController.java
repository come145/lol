package com.lol.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// 로그인 했을시만
@RestController
public class MainController {

    /*
    @GetMapping("/api/login")
    public String test(MemberVO vo) throws Exception {

        return service.login(vo);
    }
    */

    @GetMapping("/auth/callback/kakao")
    public void tokenKakao(HttpServletResponse response, HttpServletRequest request) throws  Exception {
    }




}
