//һ��5λ�����ж����ǲ��ǻ���������12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ��
import java.util.Scanner;
public class ex16{
	public static void main(String arg[]) {
		 System.out.print("������һ��5λ����");
	        Scanner in = new Scanner(System.in);
	        int nub = in.nextInt();
	        if(nub%10==nub/10000 && nub/1000%10==nub/10%10)
	        	System.out.println("�������ǻ�����");
	        else
	        	System.out.println("�����ֲ��ǻ�����");
		
	}
}