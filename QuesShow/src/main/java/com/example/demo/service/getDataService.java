package com.example.demo.service;

import com.example.demo.dao.getData;
import com.example.demo.entity.BasicInfo;
import com.example.demo.entity.Category;
import com.example.demo.entity.Composition;
import com.example.demo.entity.TypeEntity;
import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Service
public class getDataService extends getStageFromSummary{
    @Autowired
    getData db;
    /**
     * @author 尹诚
     * @parm 根据guid查询试题属性
     * @date 2020/9/7 16:50
     */
    public Category findByid(String id){
        String Stage=stage(id);
        Category category=db.findById(id,Stage);
        category.setSubStage(category.getStage());
        ArrayList<TypeEntity> list=db.NewpropertyAndName();
        Map<String,String> map=new HashMap<String, String>();
        for(TypeEntity ProAndName:list){
            map.put(ProAndName.getNewProperty(),ProAndName.getName());
        }
        String NewProperty=category.getNewProperty();
        //将编号转换为中文
        if(NewProperty.length()>0){
            String[] split=NewProperty.split("\\|");
            for(int i=0;i<split.length;i++){
                if(map.containsKey(split[i])){
                    split[i]=map.get(split[i]);
                }
            }
            category.setNewProperty(StringUtils.join(Arrays.asList(split), '|'));// 数组转字符串(分隔)
        }
        category.setStage(category.getStage().replace("CB","初中")
                .replace("CC","高中")
                .replace("CE","高职")
                .replace("CF","大外")
                .replace("CH","英专"));
        //转换体裁
        Map<String,String> GenreMap=new HashMap<String, String>();
        for (TypeEntity genre:db.Genre()){
            GenreMap.put(genre.getGenreCode(),genre.getGenreName());
        }
        if(GenreMap.containsKey(category.getGenre())){
            category.setGenre(GenreMap.get(category.getGenre()));
        }
        //转换题型编码
        Map<String,String> TypeMap=new HashMap<String, String>();
        ArrayList<TypeEntity> a=db.TypeCode();
        ArrayList<TypeEntity> b=a;
        for (TypeEntity type:db.TypeCode()){
            TypeMap.put(type.getQUESTYPE_CODE(),type.getQUESTYPE_NAME());
        }
        if(TypeMap.containsKey(category.getType())){
            category.setType(TypeMap.get(category.getType()));
        }
        //转换作答方式
        category.setAnswerWay(category.getAnswerWay().replace("1","一般式选择")
                .replace("2","下拉式选择")
                .replace("3","填空")
                .replace("4","简答"));
        //转换题目形式
        category.setTopicForm(category.getTopicForm().replace("1","客观题")
                .replace("2","主观题"));
        //转换作答方式
        category.setQuesAskForm(category.getQuesAskForm().replace("1","空")
                .replace("2","文本")
                .replace("3","表格")
                .replace("4","末尾提示")
                .replace("5","图片"));
        //转换地区显示
        String Area=category.getArea();
        if (Area!=null&&Area.length()>1){
            Area=Area.replace("|","-");

            String[] splitArea=Area.split("-");
            for(int j=0;j<splitArea.length;j++){
                if(j%2==0){
                    splitArea[j]=db.GetProvinceName(splitArea[j]);
                    if (splitArea[j]==null)
                        splitArea[j]="全国";
                }else {
                    String city=db.GetCityName(splitArea[j]);
                    if (city==null){
                        city=db.GetCountyName(splitArea[j]);
                        if(city==null){
                            city="通用";
                        }
                    }
                    splitArea[j]=city;
                }
            }
            category.setArea(StringUtils.join(Arrays.asList(splitArea), '-'));
        }
        return category;
    }
    /**
     * @author 尹诚
     * @parm Composition类对象
     * 更新作文字数
     * @date 2020/7/7 19:40
     */
    public void updateComposition(Composition composition){
        db.updateCompositionNum(composition);
    }
    /**
     * @author 尹诚
     * @parm content内容
     * 模糊查询
     * @date 2020/7/14 19:57
     */
    public BasicInfo getGuidByContent(BasicInfo basicInfo){

        return db.getGuidByContent(basicInfo);
    }
    /**
     * @author 尹诚
     * @parm content内容
     * 模糊查询
     * @date 2020/7/14 19:57
     */
    public ArrayList<TypeEntity> getTypes(String stage){
        return db.getTypes(stage);
    }
}
