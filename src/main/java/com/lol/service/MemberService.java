package com.lol.service;


import com.lol.model.MemberVO;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface MemberService {

    String loginCheck(MemberVO vo, HttpSession session);
    void logout(HttpSession session);

    void memberInsert(MemberVO vo);

    List<MemberVO> memberList();

}
