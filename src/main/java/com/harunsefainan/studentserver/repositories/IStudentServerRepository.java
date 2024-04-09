package com.harunsefainan.studentserver.repositories;

import com.harunsefainan.studentserver.entities.StudentServerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentServerRepository extends JpaRepository<StudentServerEntity, String> {

    StudentServerEntity getByOid(String oid);
    StudentServerEntity findByTcNo(String tcNo);

    StudentServerEntity findByOptime(String optime);
}
