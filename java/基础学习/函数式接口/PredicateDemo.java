package 函数式接口;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        String[] strArry={"林青霞,30","柳岩,34","张曼玉,35","貂蝉,31","王祖贤,33"};
        List<String> list=new ArrayList<String>();

        for (String str:strArry){
            if (getBoolean(str, s -> s.split(",")[0].length()>2, s -> Integer.parseInt(s.split(",")[1])>33)) {
                list.add(str);
            }
        }

        for (String s:list){
            System.out.println(s);
        }


    }

    public static boolean getBoolean(String s, Predicate<String> pre1,Predicate<String> pre2){
       return pre1.and(pre2).test(s);
    }

}
