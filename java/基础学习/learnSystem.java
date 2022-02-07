public class learnSystem {
    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long b = System.currentTimeMillis();
        System.out.println(b - a);
    }
}