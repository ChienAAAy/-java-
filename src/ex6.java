//��������������m��n���������Լ������С��������

public class ex6 {
    //����ķ�����������Լ��
    public static int gcd(int m, int n) {
        while (true) {
            if ((m = m % n) == 0)
                return n;
            if ((n = n % m) == 0)
                return m;
        }
    }

    public static void main(String args[]) throws Exception {
        //ȡ������ֵ
        //Scanner chin = new Scanner(System.in);
        //int a = chin.nextInt(), b = chin.nextInt();
        int a = 23;
        int b = 32;
        int c = gcd(a, b);
        System.out.println("��С��������" + a * b / c + "\n���Լ����" + c);
    }
}

