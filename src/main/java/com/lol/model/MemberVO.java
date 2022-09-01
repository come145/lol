package com.lol.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class MemberVO {

    private String lolId;
    private String lolName;
    private String lolPw;


    @Override
    public String toString() {
        return "MemberVO{" +
                "lolId='" + lolId + '\'' +
                ", lolName='" + lolName + '\'' +
                ", lolPw='" + lolPw + '\'' +
                '}';
    }
}
    
