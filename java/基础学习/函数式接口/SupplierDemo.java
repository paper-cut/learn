package 函数式接口;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        int[] arr={5,6,8,9,10,5,3};
        int max1 = getMax(() -> {
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        });
        System.out.println(max1);
    }

    public static int getMax(Supplier<Integer> sup){

        return sup.get();
    }
}
