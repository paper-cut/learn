package 集合进阶;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> l=new ArrayList<>();

        l.add(0,"java");//为指定位置插入内容
        l.remove(0);//删除指定索引处的元素，并返回
        l.add(0,"java");//为指定位置插入内容
        l.set(0,"python");//修改索引处的元素，返回被修改的元素
        l.get(0);//获取指定索引处的元素
    }
    
}
