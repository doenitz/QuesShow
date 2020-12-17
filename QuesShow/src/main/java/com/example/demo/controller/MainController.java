package com.example.demo.controller;

import com.example.demo.entity.*;
import com.example.demo.service.XmlFormatter;
import com.example.demo.service.getDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class MainController <T>{
    public static final String PAYMENT_URL="http://60.12.93.76:10103/webapi_aisearch/api/TQuesInfo/GetNormalTQuesInfo";
    @Autowired
    getDataService getDataService;
    @Resource
    private RestTemplate restTemplate;
    //根据guid查找试题属性
    @GetMapping("/category/{id}")
    public Category getCategory(@PathVariable("id") String id){
        try{
            Category category=getDataService.findByid(id);
            return category;
        }catch(Exception e){
            Category ct=new Category();
            ct.setNewProperty(e.toString());
            return ct;
        }
    }
    //修改作文词数
    @PostMapping("/composition")
    public String updateComposition(Composition composition){
        String result="";
        if(composition.getGuid().isEmpty()||composition.getGuid()==null||composition.getGuid()==""
                ||composition.getStage()==null||!(composition.getCompositionNum()>0)){
            result="修改失败,请先输入guid,查看当前属性再修改";
        }else {
            getDataService.updateComposition(composition);
            result="作文字数修改成功";
        }
        return result;
    }
    //模糊搜索原始表内容
    @GetMapping("/content")
    public BasicInfo searchContent(BasicInfo basicInfo){
        BasicInfo guidAndQues=getDataService.getGuidByContent(basicInfo);
        guidAndQues.setQuesStdnContent(new XmlFormatter().format(guidAndQues.getQuesStdnContent()));
        guidAndQues.setQuesContent(new XmlFormatter().format(guidAndQues.getQuesContent()));
        return guidAndQues;
    }
    //查找题型
    @GetMapping("/type/{stage}")
    public ArrayList<TypeEntity> getType(@PathVariable("stage") String stage){
        ArrayList<TypeEntity> type=getDataService.getTypes(stage);
        return type;
    }//查找题型
//    @PostMapping("/info")
//    public tempEnt getInfo(HttpServletResponse response){
//        response.setContentType("application/json; charset=utf-8");
//        return restTemplate.postForObject(PAYMENT_URL,new tempEnt("8CC4E7C43955448485044A025CACC696",true),tempEnt.class);
//    }
}
