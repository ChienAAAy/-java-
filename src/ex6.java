//输入两个正整数m和n，求其最大公约数和最小公倍数。

public class ex6 {
    //下面的方法是求出最大公约数
    public static int gcd(int m, int n) {
        while (true) {
            if ((m = m % n) == 0)
                return n;
            if ((n = n % m) == 0)
                return m;
        }
    }

    public static void main(String args[]) throws Exception {
        //取得输入值
        //Scanner chin = new Scanner(System.in);
        //int a = chin.nextInt(), b = chin.nextInt();
        int a = 23;
        int b = 32;
        int c = gcd(a, b);
        System.out.println("最小公倍数：" + a * b / c + "\n最大公约数：" + c);
    }
}

