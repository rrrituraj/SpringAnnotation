package com.jdbc.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service("rel_bckp")
public class REl_BKP {
    @Autowired
    private DataSource dataSource;
    public void getValue(){
        Connection conn=null;
        String sql="SELECT OPEN, CLOSE FROM REL_BKP";

        try {
            conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.print(rs.getInt(1)+" ");
                System.out.println(rs.getInt(2));
            }
            rs.close();
            ps.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);

        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {}
            }
        }
    }
}
