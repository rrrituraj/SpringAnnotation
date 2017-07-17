package com.college.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * Created by RITURAJ on 17-06-2017.
 */
@Configuration
@ComponentScan(basePackages = "com.college")
public class collegeConfig {

    /*@Bean
    public DataSource Data(){
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
        ds.setUsername("Rituraj");
        ds.setPassword("12345");
        return ds;
    }*/

    @Bean
    public DataSource Data(){
        DriverManagerDataSource managerDataSource=new DriverManagerDataSource();
        managerDataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        managerDataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
        managerDataSource.setUsername("Rituraj");
        managerDataSource.setPassword("12345");
        return managerDataSource;
    }
    /*@Bean
    public JdbcTemplate jdbcTemplate(){
        JdbcTemplate jdbc=new JdbcTemplate(Data());
        return jdbc;
    }*/




}
