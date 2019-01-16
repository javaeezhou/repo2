package cn.bt.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;

public class BeanFactory {
    private static Map<String,Object> map;
    private static Properties pro;

    static{
        try {
            pro = new Properties();
            InputStream is = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
            pro.load(is);
            //取出配置文件中所有的key
            Enumeration keys = pro.keys();
            //遍历枚举
            while(keys.hasMoreElements()){
                //取出每个key
                String key = keys.nextElement().toString();
                //根据key获取value
                String beanPath = pro.getProperty(key);
                //反射创建对象
                Object value = Class.forName(key).newInstance();
                //把key和value存入map中
                map.put(key,value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Object getBean(String key) {
        return map.get(key);
    }
}
