import java.util.Scanner;
//�������飬�������һ��Ԫ�ؽ�������С�������һ��Ԫ�ؽ�����������顣
class ex18{
	public static void main(String args[]) {
		 int i, min, max, n, temp1, temp2;
	        int a[];
	        System.out.println("��������ĳ���:");
	        Scanner keyboard = new Scanner(System.in);
	        n = keyboard.nextInt();
	        a = new int[n];
	        for (i = 0; i < n; i++) {
	            System.out.print("�����" + (i + 1) + "������");
	            a[i] = keyboard.nextInt();
	        }
	        //������������������
	        max = 0;
	        min = 0;
	        //����������־,��ʼ��ָ���һ����
	        for (i = 1; i < n; i++) {
	            if (a[i] > a[max])
	                max = i; //��������,�������a[max]���Ͱ����������±긳��max
	            if (a[i] < a[min])
	                min = i; //ͬ�ϣ����С��a[min],�Ͱ����������±긳��min
	        }
	        //����forѭ���ҵ����ֵ����Сֵ��max�����ֵ���±꣬min����Сֵ���±�
	        temp1 = a[0];
	        temp2 = a[min]; //������tempֻ��Ϊ���ڽ���ʱʹ��
	        a[0] = a[max];
	        a[max] = temp1; //���Ƚ���a[0]�����ֵa[max]
	        if (min != 0) { //�����Сֵ����a[0]��ִ������
	            a[min] = a[n - 1];
	            a[n - 1] = temp2; //����a[min]��a[n-1]
	        } else {       //�����Сֵ��a[0],ִ������
	            a[max] = a[n - 1];
	            a[n - 1] = temp1;
	        }
	        for (i = 0; i < n; i++) { //�������
	            System.out.print(a[i] + " ");
	        }
	    }
	}
