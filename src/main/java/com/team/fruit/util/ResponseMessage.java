package com.team.fruit.util;

import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author cx
 * @version 1.0
 * @date 2019/5/13 17:46
 */
public class ResponseMessage {
    private int code;
    private String msg;
    private List<JSONObject> data;

    public ResponseMessage(int code, String msg, List<JSONObject> data) {
        this.code = code;
        this.msg = msg;
        if (null==data) {
            this.data = new ArrayList<JSONObject>();
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

    public List<JSONObject> getData() {
        return data;
    }

    public void setData(List<JSONObject> data) {
        this.data = data;
    }
}
