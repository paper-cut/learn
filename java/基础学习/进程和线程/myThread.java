package 进程和线程;

public class myThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(this.getName()+":"+i);
        }
    }
}
