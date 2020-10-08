package com.smallert.AbstractFactory.amendment.reflect;

import java.io.IOException;
import java.util.Properties;

public class GetConfigParamUtil {
    private GetConfigParamUtil(){}
    static Properties props=new Properties();
    static {
        try {
            props.load(GetConfigParamUtil.class.getClassLoader().getResourceAsStream("factoryInfo.config"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Object get(String key){
        if (props==null) return null;
        return props.get(key);
    }
}
