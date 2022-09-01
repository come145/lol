package com.lol.repository;


import com.lol.model.MemberVO;

public interface MemberDao {
     String login(MemberVO vo)throws Exception;
}
