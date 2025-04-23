package com.jiao.bean;
import com.alibaba.fastjson.JSONObject;
/**
 * @Package com.jiao.bean.DimJoinFunction
 * @Author xinyi.jiao
 * @Date 2025/4/17 8:57
 * @description: 接口
 */
public interface DimJoinFunction<T> {
    void addDims(T obj, JSONObject dimJsonObj) ;

    String getTableName() ;

    String getRowKey(T obj) ;
}
