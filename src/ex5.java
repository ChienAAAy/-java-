//���������������Ƕ������ɴ��⣺ѧϰ�ɼ�> =90�ֵ�ͬѧ��A��ʾ��60-89��֮�����B��ʾ��60�����µ���C��ʾ��
import javax.swing.*;
public class ex5 {
     public static void main(String[] args) {
        String str = "";
        str = JOptionPane.showInputDialog("������N��ֵ������exit�˳�����");
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
