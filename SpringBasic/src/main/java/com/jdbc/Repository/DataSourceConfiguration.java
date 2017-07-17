package com.jdbc.Repository;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "com.jdbc")
public class DataSourceConfiguration {

    @Bean
    public DataSource Data(){
        //return new EmbeddedDatabaseBuilder();
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
        ds.setUsername("Rituraj");
        ds.setPassword("12345");
        return ds;
    }

}
