package com.harunsefainan.studentserver.repositories;

import com.harunsefainan.studentserver.entities.StudentServerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentServerRepository extends JpaRepository<StudentServerEntity,String> {

    IStudentServerRepository getByOid(String oid);
}
