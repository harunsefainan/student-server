package com.harunsefainan.studentserver.utils.results;

import java.util.Date;

public class SuccessDataResult<T> extends DataResult<T> {

    public SuccessDataResult(T data, String code, String message) {
        super(data, code, message, new Date());
    }

    public SuccessDataResult(T data, String message) {
        super(data, "200", message, new Date());
    }

    public SuccessDataResult(T data) {
        super(data, "200", "Başarılı", new Date());
    }

    public SuccessDataResult(String message) {
        super(null, "200", message, new Date());
    }

    public SuccessDataResult() {
        super(null, "200", "Başarılı", new Date());
    }

}
