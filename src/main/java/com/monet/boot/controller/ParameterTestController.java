package com.monet.boot.controller;

import com.monet.boot.bean.Person;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ParameterTestController {
    @PostMapping("/saveUser")
    public Person saveUser(Person person){
        return person;
    }


    @GetMapping("/car/{id}/owner/{username}")
    public Map<String,Object> getCar(@PathVariable("id") Integer id,
                                     @PathVariable("username") String name,
                                     @PathVariable Map<String,String> pv,
                                     @RequestHeader("User-Agent") String userAgent,
                                     @RequestHeader Map<String,String> header,
                                     @RequestParam("age") Integer age,
                                     @RequestParam("inters")List<String> inters,
                                     @RequestParam Map<String,String> params,
                                     @CookieValue("_ga") String _ga,
                                     @CookieValue("cookie") Cookie cookie){
        HashMap<String, Object> HashMap = new HashMap<>();
       /*
        HashMap.put("id",id);
        HashMap.put("name",name);
        HashMap.put("pv",pv);
        HashMap.put("userAgent",userAgent);
        HashMap.put("header",header);
        */
        HashMap.put("age",age);
        HashMap.put("inters",inters);
        HashMap.put("params",params);
        HashMap.put("_ga",_ga);
        System.out.println(cookie);
        return  HashMap;
    }

    @PostMapping("/save")
    public Map postMethod(@RequestBody String content){
        HashMap<String, Object> map = new HashMap<>();
        map.put("content",content);
        return map;

    }
}
