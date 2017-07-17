package com.college;

import com.college.Service.SubjectServices;
import com.college.controller.Subject;
import com.college.controller.collegeConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Created by RITURAJ on 17-06-2017.
 */
public class CollegeMain {

    public static void main(String[] args) {
        AbstractApplicationContext context=new AnnotationConfigApplicationContext(collegeConfig.class);
       /* JdbcStudentDao std=(JdbcStudentDao)context.getBean("jdbcstudentdao");
        std.insert(createStudent());*/

        /*TeacherServices tcr=(TeacherServices) context.getBean("teacher");
        tcr.insert(createTeacher());*/

        SubjectServices sb=(SubjectServices) context.getBean("subject");
        //sb.insert(createSubject());
        sb.findSubject(2);
        System.out.println("calling getAllSubject()\n");
        sb.getAllSubject();
        context.close();
    }


   /* public static Student createStudent(){
        Student student = new Student();
        student.setClassTeacher(2);
        student.setCollege("Newgen");
        student.setName("Mark");
        student.setStudentId(3);
        return student;
    }
    public static Teacher createTeacher(){
        Teacher tr=new Teacher();
        tr.setName("ramakant");
        tr.setTeacherId(1);
        tr.setSubjectId(1);
        tr.setCollege("BIET");
        return tr;
    }*/

   /* public static Subject createSubject(){
        Subject sub=new Subject();
        sub.setName("Atharveda");
        sub.setSubjectId(3);
        return sub;
    }*/
}
