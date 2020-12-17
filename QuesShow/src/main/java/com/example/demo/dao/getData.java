package com.example.demo.dao;

import com.example.demo.entity.BasicInfo;
import com.example.demo.entity.Category;
import com.example.demo.entity.Composition;
import com.example.demo.entity.TypeEntity;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Map;

@Repository
@CacheNamespace
public interface getData {
    Category findById(String id,String stage);
    String getStageFromSummary(String guid);
    void updateCompositionNum(Composition composition);
    BasicInfo getGuidByContent(BasicInfo basicInfo);
    ArrayList<TypeEntity> getTypes(String stage);
    @Select("SELECT * FROM dbo.Lgdb_Basic_questionclassifyName WHERE NewProperty<50")
    ArrayList<TypeEntity> NewpropertyAndName();
    @Select("SELECT * FROM dbo.Lgdb_QGenre")
    ArrayList<TypeEntity> Genre();
    @Select("SELECT QUESTYPE_CODE,QUESTYPE_NAME FROM dbo.Lgdb_Basic_QuesType")
    ArrayList<TypeEntity> TypeCode();
    @Select("SELECT ProvinceName FROM dbo.Info_Province_Original WHERE ProvinceID=#{ProvinceID}")
    String GetProvinceName(String ProvinceID);
    @Select("SELECT CityName FROM dbo.Info_City_Original WHERE CityID=#{CityID}")
    String GetCityName(String CityID);
    @Select("SELECT CountyName FROM dbo.Info_County_Original WHERE CountyID=#{CountyID}")
    String GetCountyName(String CountyID);
}
