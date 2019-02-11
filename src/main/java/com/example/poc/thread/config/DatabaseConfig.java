package com.example.poc.thread.config;

import org.h2.jdbcx.JdbcDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories("com.example.poc.persistance")
public class DatabaseConfig {

    @Bean
    public DataSource createMainDataSource() {

        JdbcDataSource ds = new JdbcDataSource();
        ds.setURL("jdbc:h2:"+System.getProperty("java.io.tmpdir")+"/testdata");
        return ds;
    }
}