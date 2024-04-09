package com.harunsefainan.studentserver.controllers;


import com.harunsefainan.studentserver.entities.StudentServerEntity;
import com.harunsefainan.studentserver.repositories.IStudentServerRepository;
import com.harunsefainan.studentserver.services.LogService;
import com.harunsefainan.studentserver.utils.ResultMessages;
import com.harunsefainan.studentserver.utils.results.*;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;


@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/api/students")
public class StudentServerController {

    private final IStudentServerRepository iStudentServerRepository;
    private final LogService logService;


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
}
