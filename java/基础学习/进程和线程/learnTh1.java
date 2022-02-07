package 进程和线程;

public class learnTh1{
    public static void main(String[] args) {
        myThread th1=new myThread();
        myThread th2=new myThread();

        th1.setName("高铁");
        th2.setName("飞机");

        th1.setPriority(10);
        th2.setPriority(9);

        th1.start();
        th2.start();


    }
}