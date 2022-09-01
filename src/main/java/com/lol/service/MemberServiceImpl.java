package com.lol.service;

import com.lol.model.MemberVO;
import com.lol.repository.MemberDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberDao dao;

    @Override
    public String login(MemberVO vo) throws Exception {

        String id = "come145";
        String password = "123123";

        MemberVO test = new MemberVO();

        test.setLolId(id);
        test.setLolPw(password);

        return dao.login(test);
    }
}
