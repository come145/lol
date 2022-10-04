package com.lol.controller;


import com.lol.model.MemberVO;
import com.lol.service.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/auth")
@AllArgsConstructor //모든 필드 값을 파라미터로 받는 생성자를 만들어줍니다
public class AuthController {

    private final MemberService memberService;


    // produces는 Response의 Content-Type을 제어할 수 있다
    // consumes는 반대로 request를 해당 타입만 받겠다고 설정함

   /*
    @RequestMapping("/loginCheck")
    public String loginCheck(HttpSession session, MemberVO vo) {


        String name = memberService.loginCheck(vo,session);

        name = "심해";

        return name;
    }

    */
    /*
    @GetMapping("/memberList")
    public MemberVO memberList(@RequestParam("lolId") String lolId, @RequestParam("lolPw")  String lolPw, @RequestParam("lolName") String lolName) {

        return new MemberVO(lolId,lolName,lolPw);
    }
    */

    @GetMapping("/loginCheck")
    public List<MemberVO> memberList() {

        List<MemberVO> list = memberService.memberList();

        return list;

    }




    @RequestMapping("/logout")
    public void logout(HttpSession session) {

        memberService.logout(session);
    }

    @PostMapping("/memberInsert")
    public void memberInsert(MemberVO vo) {

        memberService.memberInsert(vo);
    }




}
