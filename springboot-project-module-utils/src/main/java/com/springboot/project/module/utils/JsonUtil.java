package com.springboot.project.module.utils;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

public class JsonUtil {

    /**
     * 返回data里实体类
     * @param result
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T getObject(String result, Class<T> clazz) {
        T t = JSON.parseObject(JsonUtil.getString(result, "data"), clazz);
        return t;
    }


    /**
     * 返回实体类
     * @param result
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T getMyObject(String result, Class<T> clazz) {
        T t = JSON.parseObject(result, clazz);
        return t;
    }

    /**
     * 返回data里数组实体类
     * @param result
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> List<T> getArrayList(String result, Class<T> clazz) {
        List<T> list = JSON.parseArray(JsonUtil.getString(result, "data"), clazz);
        return list;
    }

    /**
     * 返回数组实体类
     * @param result
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> List<T> getMyArrayList(String result, Class<T> clazz) {
        List<T> list = JSON.parseArray(result, clazz);
        return list;
    }

    /**
     * 返回String
     * @param result
     * @param key
     * @return
     */
    public static String getString(String result, String key) {
        try {
            JSONObject jsonObject = JSONObject.parseObject(result);
            return jsonObject.getString(key);
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * 返回Int
     * @param result
     * @param key
     * @return
     */
    public static int getInt(String result, String key) {
        try {
            JSONObject jsonObject = JSONObject.parseObject(result);
            return jsonObject.getInteger(key);
        } catch (JSONException e) {
            e.printStackTrace();
            return -1;
        }
    }

    /**
     * 返回Long
     * @param result
     * @param key
     * @return
     */
    public static long getLong(String result, String key) {
        try {
            JSONObject jsonObject = JSONObject.parseObject(result);
            return jsonObject.getLong(key);
        } catch (JSONException e) {
            e.printStackTrace();
            return -1;
        }
    }

    /**
     * 返回Double
     *
     * @param result
     * @param key
     * @return
     */
    public static double getDouble(String result, String key) {
        try {
            JSONObject jsonObject = JSONObject.parseObject(result);
            return jsonObject.getDouble(key);
        } catch (JSONException e) {
            e.printStackTrace();
            return -1;
        }
    }

    /**
     * 返回Boolean
     * @param result
     * @param key
     * @return
     */
    public static boolean getBoolean(String result, String key) {
        try {
            JSONObject jsonObject = JSONObject.parseObject(result);
            return jsonObject.getBoolean(key);
        } catch (JSONException e) {
            return false;
        }
    }

    /**
     * 实体类转换为json
     * @param object
     * @return
     */
    public static String entityToJson(Object object){
        try {
            JSONObject jsonObject = new JSONObject();
            return jsonObject.toJSONString(object);
        } catch (JSONException e) {
            return "";
        }
    }

    /**
     * 输出Json
     * @param code
     * @param msg
     * @param data
     * @param <T>
     * @return
     */
    public static <T> String outJson(int code,String msg,T data){
        BaseJsonData baseEntity = new BaseJsonData();
        baseEntity.setCode(code);
        baseEntity.setMsg(msg);
        baseEntity.setData(data);
        return JsonUtil.entityToJson(baseEntity);
    }

}
