package com.team.fruit.controller;

import com.team.fruit.util.CodeMsg;
import com.team.fruit.util.ResponseMessage;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author cx
 * @version 1.0
 * @date 2019/5/13 17:29
 */
@RestController
public class UserController {
    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    public ResponseMessage test1(@RequestParam("page") Integer page,
                                        @RequestParam("pageSize") Integer pageSize) {
         List<JSONObject> data = new ArrayList<JSONObject>();
         for (int i = 0; i < 15; i++) {
             Map<String,Object> map = new HashMap<String,Object>();
             map.put("col1", i+1+"列1");
             map.put("col2", i+1+"列2");
             map.put("col3", i+1+"列3");
             map.put("totalSize", 15);
             JSONObject jsonObject = JSONObject.fromObject(map);
             data.add(jsonObject);
         }
         int start = (page - 1) * pageSize;
         int end = start + pageSize;
        return new ResponseMessage(CodeMsg.SUCCESS.getCode(),CodeMsg.SUCCESS.getMsg(),data.subList(start, end));
    }
    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    public ResponseMessage test2(@RequestParam("page") Integer page,
                                 @RequestParam("pageSize") Integer pageSize,
                                 @RequestParam(value = "queryType", defaultValue="", required = false) String queryType) {
        List<JSONObject> data = new ArrayList<JSONObject>();
        for (int i = 0; i < 32; i++) {
            Map<String,Object> map = new HashMap<String,Object>();
            map.put("col1", i+1+"列1" + queryType);
            map.put("col2", i+1+"列2" + queryType);
            map.put("col3", i+1+"列3" + queryType);
            map.put("totalSize", 32);
            JSONObject jsonObject = JSONObject.fromObject(map);
            data.add(jsonObject);
        }
        int start = (page - 1) * pageSize;
        int end = start + pageSize;
        return new ResponseMessage(CodeMsg.SUCCESS.getCode(),CodeMsg.SUCCESS.getMsg(),data.subList(start, end));
    }
    @RequestMapping(value = "/test3", method = RequestMethod.GET)
    public ResponseMessage test3(@RequestParam("page") Integer page,
                                        @RequestParam("pageSize") Integer pageSize) {
        List<JSONObject> data = new ArrayList<JSONObject>();
        for (int i = 0; i < 301; i++) {
            Map<String,Object> map = new HashMap<String,Object>();
            map.put("col1", i+1+"列1");
            map.put("col2", i+1+"列2");
            map.put("col3", i+1+"列3");
            map.put("totalSize", 301);
            JSONObject jsonObject = JSONObject.fromObject(map);
            data.add(jsonObject);
        }
        int start = (page - 1) * pageSize;
        int end = start + pageSize;
        return new ResponseMessage(CodeMsg.SUCCESS.getCode(),CodeMsg.SUCCESS.getMsg(),data.subList(start, end));
    }
    @RequestMapping(value = "/getUserInfo2", method = RequestMethod.GET)
    public ResponseMessage getUserInfo2() {
        return new ResponseMessage(CodeMsg.PASSWORD_EMPTY.getCode(),CodeMsg.PASSWORD_EMPTY.getMsg(),null);
    }
}
