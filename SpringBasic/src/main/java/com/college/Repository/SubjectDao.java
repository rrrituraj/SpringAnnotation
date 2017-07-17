package com.college.Repository;

import com.college.controller.Subject;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by RITURAJ on 17-06-2017.
 */
public interface SubjectDao {
    public void insert(Subject subject);
}
