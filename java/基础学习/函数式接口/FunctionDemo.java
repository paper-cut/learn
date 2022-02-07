package 函数式接口;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
//        getFunction("林青霞,30",s->{
//            return Integer.parseInt(s.split(",")[1])+70;
//                }
//        );

        getFunction("林青霞,30",s->Integer.parseInt(s.split(",")[1])+70);

        System.out.println("--------");

        getFunction("林青霞,30",s->s.split(",")[1],s->Integer.parseInt(s),s->s+70);
    }

    public static void getFunction(String s, Function<String,Integer> fun){
        System.out.println(fun.apply(s));
    }

    public static void getFunction(String s,Function<String,String> fun1,Function<String,Integer> fun2,Function<Integer,Integer> fun3){
        System.out.println(fun1.andThen(fun2).andThen(fun3).apply(s));
    }
}
