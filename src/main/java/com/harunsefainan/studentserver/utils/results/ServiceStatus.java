package com.harunsefainan.studentserver.utils.results;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ServiceStatus {
    @JsonProperty("code")
    protected String code;
    @JsonProperty("message")
    protected String message;
    @JsonProperty("messageDetails")
    protected String messageDetails;
    @JsonProperty("time")
    protected String time;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessageDetails() {
        return messageDetails;
    }

    public void setMessageDetails(String messageDetails) {
        this.messageDetails = messageDetails;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
