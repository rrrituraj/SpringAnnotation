package com.college.Service;


import com.college.controller.Subject;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomRowMapper implements RowMapper<Subject> {
    public Subject mapRow(ResultSet resultSet, int i) throws SQLException {
        Subject sub=new Subject();
        sub.setName(resultSet.getString("name"));
        sub.setSubjectId(resultSet.getInt("SubjectId"));
        return sub;
    }
}
