package com.example.object_relational_mapping.PO;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: object_relational_mapping
 * @description
 * @author: 苏敏
 * @create: 2022-05-11 09:57
 **/
public interface StudentDao extends JpaRepository<Student,String> {
}
