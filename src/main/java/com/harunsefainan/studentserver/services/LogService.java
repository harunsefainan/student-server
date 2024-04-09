package com.harunsefainan.studentserver.services;

import com.harunsefainan.studentserver.entities.StudentServerEntity;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogService {

    @Value("${projectName}")
    private String projectName;

    @Value("${logMsgFormat}")
    private String logMsgFormat;

    @Value("${logMsgFormat_Ex}")
    private String logMsgFormatEx;

    final Logger logger = LoggerFactory.getLogger(LogService.class);

    public Boolean generateLog(String uuid, String serviceName, Boolean success, String msj) {
        logger.info(
                logMsgFormat,
                uuid,
                projectName,
                serviceName,
                success,
                msj.replaceAll("\\r\\n|\\r|\\n", " ").trim()
        );
        return true;
    }

    public Boolean generateLog(String uuid, String serviceName, Boolean success, StudentServerEntity student, String msj) {

        if (student != null) {
            logger.info(
                    logMsgFormatEx,
                    uuid,
                    projectName,
                    serviceName,
                    success,
                    student,
                    msj.replaceAll("\\r\\n|\\r|\\n", " ").trim()
            );
            return true;
        }
        return false;
    }
}
