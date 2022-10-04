package com.lol.service;

import com.lol.model.MemberVO;
import com.lol.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepository repository;


    @Override
    public String loginCheck(MemberVO vo, HttpSession session) {
        String name = repository.loginCheck(vo);
        if (name != null) {
            session.setAttribute("lolId", vo.getLolId());
            session.setAttribute("lolName", name);
        }
        return name;
    }

    @Override
    public void logout(HttpSession session) {
        session.invalidate();
    }

    @Override
    public void memberInsert(MemberVO vo) {
        repository.memberInsert(vo);
    }

    @Override
    public List<MemberVO> memberList() {
        return repository.memberList();
    }
}
