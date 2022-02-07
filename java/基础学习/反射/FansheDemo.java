package 反射;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class FansheDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        //读取配置文件
        Properties prop=new Properties();
        FileReader fr=new FileReader("基础学习\\反射\\config.txt");
        prop.load(fr);
        fr.close();
        String className = prop.getProperty("className");
        String methodName = prop.getProperty("methodName");
        //获取类
        Class<?> s = Class.forName(className);
        //获取类的对象
        Constructor<?> con = s.getConstructor();
        Object obj = con.newInstance();
        //获取类的方法
        Method method = s.getMethod(methodName);
        //调用方法
        method.invoke(obj);



    }
}
