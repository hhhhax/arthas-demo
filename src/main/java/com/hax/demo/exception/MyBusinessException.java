package com.hax.demo.exception;


import com.hax.demo.domain.enums.ResponseEnums;

/**
 * @Author: hax
 * @Date: 2019/10/24
 * @company: yoe
 */
public class MyBusinessException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private String code;

    private String msg;

    private ResponseEnums enums;

    private String message;//打印出的日志信息

    public MyBusinessException(ResponseEnums enums, String message) {
        super();
        this.code = enums.getCode();
        this.msg = enums.getMsg();
        this.message = message;
    }

    public MyBusinessException(ResponseEnums enums) {
        super();
        this.code = enums.getCode();
        this.msg = enums.getMsg();
        this.enums = enums;
    }


    public MyBusinessException() {
        super();
    }

    public MyBusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyBusinessException(String message) {
        super(message);
    }


    public ResponseEnums getEnums() {
        return enums;
    }

    public void setEnums(ResponseEnums enums) {
        this.enums = enums;
    }

    public String getCode() {
        return code;
    }


    public void setCode(String code) {
        this.code = code;
    }


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
