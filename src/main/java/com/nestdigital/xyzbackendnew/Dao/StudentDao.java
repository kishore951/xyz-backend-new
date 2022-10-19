package com.nestdigital.xyzbackendnew.Dao;

import com.nestdigital.xyzbackendnew.Model.StudentModel;
import org.springframework.data.repository.CrudRepository;

public interface StudentDao extends CrudRepository<StudentModel,Integer> {
}
