package 函数式接口;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        String[] strArrays={"林青霞,30","张曼玉,35","王祖贤,33"};
//        printInfo(strArrays,(s)->{
//                System.out.print("姓名："+s.substring(0,s.lastIndexOf(","))+",");
//        },(s)->{
//                System.out.println("年龄："+s.substring(s.lastIndexOf(",")+1));
//        });

        printInfo(strArrays,s-> System.out.print("姓名："+s.split(",")[0]+","),s-> System.out.println("年龄："+Integer.parseInt(s.split(",")[1])));
    }

    public static void printInfo(String[] strArray,Consumer<String> con1,Consumer<String> con2){
        for (String s:strArray){
            con1.andThen(con2).accept(s);
        }
    }


}
