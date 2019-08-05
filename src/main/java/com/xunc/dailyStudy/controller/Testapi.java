package com.xunc.dailyStudy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
public class Testapi {
    @RequestMapping(value = "/requestgetTime", method = RequestMethod.GET)
    public Map<String, Object> requestgetTime(@RequestParam(value ="startTime") String startTime,@RequestParam(value ="endTime") String endTime) throws Exception {
        Map<String, Object> rtnMap = new HashMap();
        rtnMap.put("rtnCode", "200");
        ArrayList<Map> list = new ArrayList();
        for (int a = 0; a < 10; a++) {
            Map m1 = new HashMap();
            m1.put("x", a);
            m1.put("y", a*1000);
            list.add(m1);
        }
        Map m2 = new HashMap();
        m2.put("a", list);
        rtnMap.put("data", m2);
        rtnMap.put("rtnMsg", "requestgetTime");
        return rtnMap;
    }
    @RequestMapping(value = "/requestPost", method = RequestMethod.POST)
    public Map<String, Object> requestPost(@RequestParam(value ="appNo") String appNo1) throws Exception {
        Map<String, Object> rtnMap = new HashMap();
        rtnMap.put("rtnCode", "200");
        ArrayList<Map> list = new ArrayList();
        for (int a = 0; a < 5; a++) {
            Map m1 = new HashMap();
            m1.put("x", a);
            m1.put("y", a+10);
            list.add(m1);
        }
        Map m2 = new HashMap();
        m2.put("a", list);
        rtnMap.put("data", m2);
        rtnMap.put("rtnMsg", "取消失败");
        return rtnMap;
    }
    @RequestMapping(value = "/requestGet", method = RequestMethod.GET)
    public Map<String, Object> requestGet(@RequestParam(value ="appNo") String appNo1) throws Exception {
        Map<String, Object> rtnMap = new HashMap();
        rtnMap.put("rtnCode", "200");
        ArrayList<Map> list = new ArrayList();
        for (int a = 0; a < 5; a++) {
            Map m1 = new HashMap();
            m1.put("x", a);
            m1.put("y", a+10);
            list.add(m1);
        }
        Map m2 = new HashMap();
        m2.put("a", list);
        rtnMap.put("data", m2);
        rtnMap.put("rtnMsg", "取消失败");
        return rtnMap;
    }
}
