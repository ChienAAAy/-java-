//将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
public class ex4{
    public static void fengjie(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.print(i + "*");
                fengjie(n / i);
            }
        }
        System.out.print(n);
        System.exit(0);///不能少这句，否则结果会出错
    }

    public static void main(String[] args) {
        String str = "";
        str = javax.swing.JOptionPane.showInputDialog("请输入N的值（输入exit退出）：");
        int N;
        N = 0;
        try {
            N = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.print(N + "分解质因数：" + N + "=");
        fengjie(N);
    }
}
