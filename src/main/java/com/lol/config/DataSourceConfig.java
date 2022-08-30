package com.lol.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/* DataSource 설정파일
   DataSource : 커넥션 풀의 커넥션을 관리하기 위한 객체
   커넥션 풀 : 기존 JDBC는 클라이언트부터 요청이 있을때마다 DB 서버에 연결하기 위해 Connection 객체를 얻었음(성능에 좋지 않음)
             기존의 불편함을 해소하기위해 Connection 객체를 요청때마다 생성하는 것이 아니라 웹 어플리케이션이 서비스 되기 전에
             서버에 미리 생성하여 준비한 다음 필요할 때마다 가져다 쓰면된다
*/
@Configuration
public class DataSourceConfig {

    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }
}
