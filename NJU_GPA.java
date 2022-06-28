import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NJU_GPA {
    public static void main(String[] args) throws FileNotFoundException {
        //scores.txt文件在项目目录下，与src同级
        /*
         * scores.txt格式：
         * ==============
         *  89  2
         *  90  1
         * ==============
         * --->成绩89  学分2
         * --->成绩90  学分1
         */
        Scanner sc=new Scanner(new FileInputStream("scores.txt"));
        //南大实行5分制学分绩，100分=5分绩点，绩点是每门课的分数除以20
        //所有绩点与学分乘积，相加后除以学分总和就是这学期的学分绩点
        double sum=0;
        int totalCredit=0;
        while (sc.hasNextInt()){
            //绩点*学分的累加
            double jidian=sc.nextInt()*1.0/20;
            int credit=sc.nextInt();
            totalCredit+=credit;
            sum+=jidian*credit;
        }
        System.out.println("经计算，本学期你的学分绩点为："+(sum/totalCredit));
        sc.close();
    }


}
