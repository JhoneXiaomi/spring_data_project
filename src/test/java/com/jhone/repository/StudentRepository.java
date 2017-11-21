package com.jhone.repository;

import com.imooc.domain.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @Author jhone
 * @Description: 这个接口继承了Spring_Data的CrudRepository方法,并且定义了类型的属性Student,Id 的类型Long
 * @Date 8:39 2017/11/21
 * Modified_by:
 */
public interface StudentRepository extends CrudRepository<Student,Long>{

    Student findByFirstName(String firstName);
    List<Student> findByLastName(String lastName);
}
