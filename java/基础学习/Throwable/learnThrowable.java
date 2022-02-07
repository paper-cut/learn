package Throwable;

public class learnThrowable {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");

    }

    private static void method() {
        int[] arr={1,2,3};

        try{
            System.out.println(arr[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界异常");
            e.printStackTrace();
        }
    }
}
