package com.harunsefainan.studentserver.utils.results;

import java.util.Date;

public class DataResult<T> extends Result {

    private T data;

    public DataResult(T data, String code, String message, Date time) {
        super(code, message, time);
        this.data = data;
    }

    public DataResult(T data, String code, String message, String messageDetails, Date time) {
        super(code, message, messageDetails, time);
        this.data = data;
    }

    public T getData() {
        return this.data;
    }


}
