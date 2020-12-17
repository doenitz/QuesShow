package com.example.demo.service;

import com.example.demo.dao.getData;
import org.springframework.beans.factory.annotation.Autowired;

public class getStageFromSummary {
    @Autowired
    getData db;
    /**
     * 从summary表获取阶段
     * */
    public String stage(String guid){
        String tablename=db.getStageFromSummary(guid);
        return tablename.substring(14,16);
    }
}
