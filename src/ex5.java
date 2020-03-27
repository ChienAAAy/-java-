//利用条件运算符的嵌套来完成此题：学习成绩> =90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
import javax.swing.*;
public class ex5 {
     public static void main(String[] args) {
        String str = "";
        str = JOptionPane.showInputDialog("请输入N的值（输入exit退出）：");
        int N;
        N = 0;
        try {
            N = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        str = (N > 90 ? "A" : (N > 60 ? "B" : "C"));
        System.out.println(str);
    }
}
