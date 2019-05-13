package com.team.fruit.controller;

import com.team.fruit.util.CodeMsg;
import com.team.fruit.util.ResponseMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    @RequestMapping(value = "/getUserInfo1", method = RequestMethod.GET)
    public ResponseMessage getUserInfo1() {
         List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("data","测试数据格式");
        data.add(map);
        return new ResponseMessage(CodeMsg.SUCCESS.getCode(),CodeMsg.SUCCESS.getMsg(),data);
    }
    @RequestMapping(value = "/getUserInfo2", method = RequestMethod.GET)
    public ResponseMessage getUserInfo2() {
        return new ResponseMessage(CodeMsg.PASSWORD_EMPTY.getCode(),CodeMsg.PASSWORD_EMPTY.getMsg(),null);
    }
}
