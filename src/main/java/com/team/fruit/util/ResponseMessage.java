package com.team.fruit.util;


import java.util.HashMap;
import java.util.Map;

/**
 * @author cx
 * @version 1.0
 * @date 2019/5/13 17:46
 */
public class ResponseMessage {
    private int code;
    private String msg;
    private Map<String, Object> data;

    public ResponseMessage(int code, String msg, Map<String, Object> data) {
        this.code = code;
        this.msg = msg;
        if (null==data) {
            this.data = new HashMap<String, Object>();
        } else {
            this.data = data;
        }
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}
