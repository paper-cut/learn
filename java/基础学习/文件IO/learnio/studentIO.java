package 文件IO.learnio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class studentIO {
    public static void main(String[] args) throws IOException {
        TreeSet<student> ts = new TreeSet<>(new Comparator<student>() {
            @Override
            public int compare(student s1, student s2) {
                int s1fen = s1.getChinese() + s1.getEnglish() + s1.getMath();
                int s2fen = s2.getChinese() + s2.getMath() + s2.getEnglish();
                int num=s1fen-s2fen;
                int num2=num==0?s1.getChinese()-s2.getChinese():num;
                int num3=num2==0?s1.getEnglish()-s2.getEnglish():num2;
                int num4=num3==0?s1.getName().compareTo(s2.getName()):num3;
                return num4;
            }
        });

        for (int i = 0; i < 5; i++) {
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入第"+(i+1)+"个学生的信息");
            System.out.println("姓名：");
            String name = sc.nextLine();
            System.out.println("语文成绩：");
            int chinese = sc.nextInt();
            System.out.println("数学成绩：");
            int math = sc.nextInt();
            System.out.println("英语成绩：");
            int english = sc.nextInt();

            student st=new student();
            st.setName(name);
            st.setChinese(chinese);
            st.setEnglish(english);
            st.setMath(math);

            ts.add(st);
        }
        BufferedWriter bt=new BufferedWriter(new FileWriter("name.txt"));
        for (student s:ts){
            bt.write(s.toString());
            bt.newLine();
            bt.flush();
        }

        bt.close();
    }
}
