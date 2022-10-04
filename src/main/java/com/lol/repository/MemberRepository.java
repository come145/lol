package com.lol.repository;


import com.lol.model.MemberVO;

import java.util.List;

public interface MemberRepository {

    String loginCheck(MemberVO vo);

    void memberInsert(MemberVO vo);

    List<MemberVO> memberList();

}
