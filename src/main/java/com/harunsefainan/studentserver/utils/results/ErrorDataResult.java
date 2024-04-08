package com.harunsefainan.studentserver.utils.results;

import java.util.Date;

public class ErrorDataResult<T> extends DataResult<T> {

    public ErrorDataResult(T data, String code, String message) {
        super(data, code, message, new Date());
    }

    public ErrorDataResult(T data, String message) {
        super(data, "500", message, new Date());
    }

    public ErrorDataResult(T data) {
        super(data, "500", "Başarısız", new Date());
    }

    public ErrorDataResult(String message) {
        super(null, "500", message, new Date());
    }

    public ErrorDataResult() {
        super(null, "500", "Başarısız", new Date());
    }

}
