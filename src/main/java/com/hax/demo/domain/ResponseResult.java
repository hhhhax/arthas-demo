package com.hax.demo.domain;


import com.alibaba.fastjson.annotation.JSONField;
import com.hax.demo.domain.enums.ResponseEnums;
import org.springframework.stereotype.Component;

@Component
public class ResponseResult<T> extends Message {

    private static final long serialVersionUID = 2676739209995586154L;

    @JSONField(name = "code")
    private String code;
    @JSONField(name = "text")
    private String text;
    @JSONField(name = "data")
    private T data;



    public void setEnums(ResponseEnums enums) {
        this.code = enums.getCode();
        this.text = enums.getMsg();
    }

    public ResponseResult() {
    }

    //返回成功
    public static ResponseResult ok() {
        ResponseResult result = new ResponseResult();
        result.setEnums(ResponseEnums.SUCCESS_OPTION);
        return result;
    }

    //返回成功
    public static ResponseResult ok(Object data) {
        ResponseResult result = new ResponseResult();
        result.setEnums(ResponseEnums.SUCCESS_OPTION);
        result.setData(data);
        return result;
    }


    //返回失败
    public static ResponseResult failure(ResponseEnums enums) {
        ResponseResult result = new ResponseResult();
        result.setEnums(enums);
        return result;
    }

    //返回失败
    public static ResponseResult failure(ResponseEnums enums, Object data) {
        ResponseResult result = new ResponseResult();
        result.setEnums(enums);
        result.setData(data);
        return result;
    }


    //返回失败
    public static ResponseResult failure(String code,String message) {
        ResponseResult result = new ResponseResult();
        result.setCode(code);
        result.setText(message);
        return result;
    }

    public ResponseResult(String code, String text, T data) {
        this.code = code;
        this.text = text;
        this.data = data;
    }

    public ResponseResult(ResponseEnums responseEnums) {
        this.code = responseEnums.getCode();
        this.text = responseEnums.getMsg();
    }

    public ResponseResult(ResponseEnums responseEnums, T data) {
        this.code = responseEnums.getCode();
        this.text = responseEnums.getMsg();
        this.data = data;
    }


    public ResponseResult(String code, String text) {
        this.code = code;
        this.text = text;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}