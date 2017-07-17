package com.college.Service;

import com.college.Repository.TeacherDao;
import com.college.controller.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Service("teacher")
public class TeacherServices implements TeacherDao{

    @Autowired
    private DataSource dataSource;

    public void insert(Teacher teacher) {
        String sql="insert into TEACHER (NAME, TEACHERID, SUBJECTSK, COLLEGE) VALUES (?,?,?,?)";
        Connection conn=null;
        try{
            conn=dataSource.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, teacher.getName());
            ps.setInt(2, teacher.getSubjectId());
            ps.setInt(3,teacher.getTeacherId());
            ps.setString(4,teacher.getCollege());
            ps.executeQuery();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
