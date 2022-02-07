package 集合进阶;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection<String> c=new ArrayList<>();

        c.add("c");//添加元素
        c.remove("c");//删除元素
        c.clear();//清空元素
        c.contains("c");//判断是否有改元素
        c.isEmpty();//判断集合是否为空
        c.size();//判断集合长度（元素的个数）

        c.iterator();

        
    }
    
}
