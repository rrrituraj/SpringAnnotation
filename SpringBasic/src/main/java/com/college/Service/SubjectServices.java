package com.college.Service;

import com.college.Repository.SubjectDao;
import com.college.controller.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;
import javax.sql.DataSource;
import java.util.List;

@Service("subject")
public class SubjectServices extends NamedParameterJdbcDaoSupport implements SubjectDao{

   /* @Autowired
    private DataSource dataSource;*/

    /* @Autowired
    private JdbcTemplate jdbcTemplate;*/

   /* @Autowired
    public SubjectServices(JdbcTemplate temp) {
        setJdbcTemplate(temp);
    }*/
    @Autowired
    public SubjectServices(DataSource dataSource) {
        setDataSource(dataSource);
    }


    public void insert(Subject subject) {
        String sql="INSERT INTO SUBJECT (NAME, SUBJECTID) VALUES (?,?)";
       // Connection conn=null;
        /*try {
            conn=dataSource.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1,subject.getName());
            ps.setInt(2,subject.getSubjectId());
            ps.executeQuery();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }*/

      /* int upd= jdbcTemplate.update(sql, new Object[]{subject.getName(),subject.getSubjectId()});
        if (upd>0){
            System.out.println("Subject Created");
        }*/

    }

    public void findSubject(int i){
        String sql="SELECT * FROM SUBJECT where SUBJECTID=?";

        /*Subject sub = (Subject) jdbcTemplate.queryForObject(sql, new CustomRowMapper(), i);
        System.out.println(sub.getName()+"\t"+sub.getSubjectId());*/

        /*Subject sub=(Subject)jdbcTemplate.query(sql, new CustomRowMapper(), i);
        System.out.println(sub.getName()+"\t"+sub.getSubjectId());*/

       /* ArrayList list= (ArrayList) jdbcTemplate.query(sql,new Object[]{Name},new CustomRowMapper());
        System.out.println(list.isEmpty());*/

       Subject sub=(Subject)getJdbcTemplate().queryForObject(sql,new Object[]{i},new CustomRowMapper());
        System.out.println(sub.getName()+"\t"+sub.getSubjectId());
    }

    public void getAllSubject(){
        String sql="SELECT * FROM SUBJECT";
        List<Subject> ls= getJdbcTemplate().query(sql,new CustomRowMapper());
        for (Subject subject:ls
             ) {
            System.out.println(subject.getName()+"  "+subject.getSubjectId());
        }
    }
}
