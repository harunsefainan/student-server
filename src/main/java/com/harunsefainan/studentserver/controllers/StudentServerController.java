package com.harunsefainan.studentserver.controllers;


import com.harunsefainan.studentserver.entities.StudentServerEntity;
import com.harunsefainan.studentserver.models.StudentServerModel;
import com.harunsefainan.studentserver.repositories.IStudentServerRepository;
import com.harunsefainan.studentserver.services.LogService;
import com.harunsefainan.studentserver.utils.ResultMessages;
import com.harunsefainan.studentserver.utils.StudentServerUtil;
import com.harunsefainan.studentserver.utils.results.*;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;


@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/api/students")
public class StudentServerController {

    private final IStudentServerRepository iStudentServerRepository;
    private final LogService logService;
    private final StudentServerUtil util;

    @GetMapping("/getAll")
    public DataResult<Iterable<StudentServerEntity>> GetAll(HttpServletRequest request) {

        Iterable<StudentServerEntity> result = iStudentServerRepository.findAll();

        if (result != null) {

            Boolean logResult = logService.generateLog(
                    UUID.randomUUID().toString(),
                    "GetAll",
                    true,
                    ResultMessages.LISTING_SUCCESS_MULTI
            );
            if (logResult)
                return new SuccessDataResult<>(result, ResultMessages.LISTING_SUCCESS_MULTI + ResultMessages.LOGGER_SUCCESS);
            return new SuccessDataResult<>(result, ResultMessages.LISTING_SUCCESS_MULTI + ResultMessages.LOGGER_FAILED);

        } else {
            Boolean logResult = logService.generateLog(
                    UUID.randomUUID().toString(),
                    "GetAll",
                    false,
                    ResultMessages.NOT_FOUND_MULTI
            );
            if (logResult)
                return new ErrorDataResult<>(ResultMessages.NOT_FOUND_MULTI + ResultMessages.LOGGER_SUCCESS);
            return new ErrorDataResult<>(ResultMessages.NOT_FOUND_MULTI + ResultMessages.LOGGER_FAILED);
        }

    }

    @GetMapping("/getByOID")
    public DataResult<StudentServerEntity> GetByOID(HttpServletRequest request, String oid) {

        StudentServerEntity result = iStudentServerRepository.getByOid(oid);

        if (result != null) {

            Boolean logResult = logService.generateLog(
                    UUID.randomUUID().toString(),
                    "GetByOID",
                    true,
                    result,
                    ResultMessages.LISTING_SUCCESS
            );
            if (logResult)
                return new SuccessDataResult<>(result, ResultMessages.LISTING_SUCCESS + ResultMessages.LOGGER_SUCCESS);
            return new SuccessDataResult<>(result, ResultMessages.LISTING_SUCCESS + ResultMessages.LOGGER_FAILED);

        } else {
            Boolean logResult = logService.generateLog(
                    UUID.randomUUID().toString(),
                    "GetByOID",
                    false,
                    result,
                    ResultMessages.NOT_FOUND
            );
            if (logResult)
                return new ErrorDataResult<>(ResultMessages.NOT_FOUND + ResultMessages.LOGGER_SUCCESS);
            return new ErrorDataResult<>(ResultMessages.NOT_FOUND + ResultMessages.LOGGER_FAILED);
        }

    }

    @PostMapping("/newStudent")
    public Result NewStudent(HttpServletRequest request, @RequestBody StudentServerModel studentModel) {
        System.out.println(util.generateOID().toString());
        StudentServerEntity student = new StudentServerEntity();

        student.setOid(util.generateOID().toString());
        student.setFirstName(studentModel.getFirstName());
        student.setLastName(studentModel.getLastName());
        student.setTcNo(studentModel.getTcNo());
        student.setBirthDate(studentModel.getBirthDate());
        student.setRegistrationDate(studentModel.getRegistrationDate());
        student.setCourseTime(studentModel.getCourseTime());
        student.setOptime(new SimpleDateFormat("yyyyMMddHHmm").format(new Date()));


        StudentServerEntity result = iStudentServerRepository.save(student);

        if (result != null) {

            Boolean logResult = logService.generateLog(
                    UUID.randomUUID().toString(),
                    "NewStudent",
                    true,
                    student,
                    ResultMessages.STUDENT_CREATE_SUCCESS
            );
            if (logResult)
                return new SuccessResult(ResultMessages.STUDENT_CREATE_SUCCESS + ResultMessages.LOGGER_SUCCESS);
            return new SuccessResult(ResultMessages.STUDENT_CREATE_SUCCESS + ResultMessages.LOGGER_FAILED);
        } else {
            Boolean logResult = logService.generateLog(
                    UUID.randomUUID().toString(),
                    "NewStudent",
                    false,
                    student,
                    ResultMessages.STUDENT_CREATE_FAILED
            );
            if (logResult)
                return new ErrorResult(ResultMessages.STUDENT_CREATE_FAILED + ResultMessages.LOGGER_SUCCESS);
            return new ErrorResult(ResultMessages.STUDENT_CREATE_FAILED + ResultMessages.LOGGER_FAILED);
        }

    }
}
