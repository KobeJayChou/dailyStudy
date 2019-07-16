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
 * @date 2019/7/10 17:29
 */
@RestController
public class UserController {
    @RequestMapping(value = "/testGet", method = RequestMethod.GET)
    public ResponseMessage testGet(@RequestParam("page") Integer page,
                                 @RequestParam("pageSize") Integer pageSize,
                                 @RequestParam(value = "queryType", defaultValue="", required = false) String queryType,
                                 @RequestParam(value = "col1", defaultValue="", required = false) String col1,
                                 @RequestParam(value = "col2", defaultValue="", required = false) String col2,
                                 @RequestParam(value = "col3", defaultValue="", required = false) String col3) {
        List<JSONObject> data = new ArrayList<JSONObject>();
        int range = 32;
        if (col1.equals("1列1")) {
            Map<String,Object> res = new HashMap<String, Object>();
            res.put("total",0);
            res.put("data",data);
            return new ResponseMessage(CodeMsg.SUCCESS.getCode(),CodeMsg.SUCCESS.getMsg(),res);
        }
        for (int i = 0; i < range; i++) {
            Map<String,Object> map = new HashMap<String,Object>();
            map.put("col1", i+1+"列1" + queryType + col1 + col2 + col3);
            map.put("col2", i+1+"列2" + queryType + col1 + col2 + col3);
            map.put("col3", i+1+"列3" + queryType + col1 + col2 + col3);
            JSONObject jsonObject = JSONObject.fromObject(map);
            data.add(jsonObject);
        }
        int start = (page - 1) * pageSize;
        int end = start + pageSize;
        int subEnd = end > 32 ? 32 : end;
        Map<String,Object> res = new HashMap<String, Object>();
        res.put("total",32);
        res.put("data",data.subList(start, subEnd));
        return new ResponseMessage(CodeMsg.SUCCESS.getCode(),CodeMsg.SUCCESS.getMsg(),res);
    }
    @RequestMapping(value = "/testPost", method = RequestMethod.POST)
    public ResponseMessage testPost(@RequestParam("page") Integer page,
                                        @RequestParam("pageSize") Integer pageSize,
                                        @RequestParam(value = "queryType", defaultValue="", required = false) String queryType,
                                        @RequestParam(value = "col1", defaultValue="", required = false) String col1,
                                        @RequestParam(value = "col2", defaultValue="", required = false) String col2,
                                        @RequestParam(value = "col3", defaultValue="", required = false) String col3) throws Exception {
        List<JSONObject> data = new ArrayList<JSONObject>();
        for (int i = 0; i < 32; i++) {
            Map<String,Object> map = new HashMap<String,Object>();
            map.put("col1", i+1+"列1" + queryType + col1 + col2 + col3);
            map.put("col2", i+1+"列2" + queryType + col1 + col2 + col3);
            map.put("col3", i+1+"列3" + queryType + col1 + col2 + col3);
            JSONObject jsonObject = JSONObject.fromObject(map);
            data.add(jsonObject);
        }
        int start = (page - 1) * pageSize;
        int end = start + pageSize;
        Map<String,Object> res = new HashMap<String, Object>();
        res.put("total",32);
        res.put("data",data.subList(start, end));
        return new ResponseMessage(CodeMsg.SUCCESS.getCode(),CodeMsg.SUCCESS.getMsg(),res);
    }
}
