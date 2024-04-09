package com.harunsefainan.studentserver.utils;

import org.springframework.stereotype.Component;

import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class StudentServerUtil {
    /*
     * OID FACTORY
     */
    private static final int OID_LENGTH = 14; // The length of the OID

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public synchronized String generateOID() {
        SecureRandom random = new SecureRandom();
        StringBuilder oidBuilder = new StringBuilder(OID_LENGTH);

        // Generate random characters for the OID
        for (int i = 0; i < OID_LENGTH; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(randomIndex);
            oidBuilder.append(randomChar);
        }

        // Add creation timestamp to the OID
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");
        String timestamp = now.format(formatter);
        oidBuilder.append(timestamp);

        return oidBuilder.toString();
    }

}
