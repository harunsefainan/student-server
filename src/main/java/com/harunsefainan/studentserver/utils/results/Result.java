package com.harunsefainan.studentserver.utils.results;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Result {
    @JsonProperty("serviceStatus")
    private final ServiceStatus serviceStatus;
    @JsonProperty("uuid")
    private UUID uuid = UUID.randomUUID();

    public Result(String code, String message, Date time) {
        this.serviceStatus = new ServiceStatus();

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd-HH:mm:ss:MS");

        this.serviceStatus.setCode(code);
        this.serviceStatus.setMessage(message);
        this.serviceStatus.setTime(formatter.format(time));
    }

    public Result(String code, String message, String messageDetails, Date time) {
        this(code, message, time);
        this.serviceStatus.setMessageDetails(messageDetails);
    }

}
