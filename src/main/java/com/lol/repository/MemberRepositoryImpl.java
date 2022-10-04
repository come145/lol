package com.lol.repository;

import com.lol.model.MemberVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Mapper

public class MemberRepositoryImpl implements  MemberRepository{

        @Autowired
        private SqlSession session;

        @Override
        public String loginCheck(MemberVO vo) {
            return session.selectOne("loginCheck", vo);
        }

    @Override
    public void memberInsert(MemberVO vo) {
        session.insert("memberInsert", vo );
    }

    @Override
    public List<MemberVO> memberList() {
        return session.selectList("memberList");
    }


}
