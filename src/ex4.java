//��һ���������ֽ������������磺����90,��ӡ��90=2*3*3*5��
public class ex4{
    public static void fengjie(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.print(i + "*");
                fengjie(n / i);
            }
        }
        System.out.print(n);
        System.exit(0);///��������䣬�����������
    }

    public static void main(String[] args) {
        String str = "";
        str = javax.swing.JOptionPane.showInputDialog("������N��ֵ������exit�˳�����");
        int N;
        N = 0;
        try {
            N = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.print(N + "�ֽ���������" + N + "=");
        fengjie(N);
    }
}
