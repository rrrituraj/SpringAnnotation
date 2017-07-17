package com.college.Service;

import com.college.Repository.StudentDao;
import com.college.controller.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.college.controller.collegeConfig;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Service("jdbcstudentdao")
public class JdbcStudentDao implements StudentDao{


    @Autowired
    private DataSource dataSource;

    public void insert(Student student) {
        String sql = "INSERT INTO STUDENT (name, studentId, classteacher, college) VALUES (?,?,?,?)";
        Connection conn = null;

        try {
            conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, student.getName());
            ps.setInt(2, student.getStudentId());
            ps.setInt(3, student.getClassTeacher());
            ps.setString(4, student.getCollege());


            ps.executeQuery();
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {}
            }
        }

    }
}
