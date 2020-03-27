//一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
import java.util.Scanner;
public class ex16{
	public static void main(String arg[]) {
		 System.out.print("请输入一个5位数：");
	        Scanner in = new Scanner(System.in);
	        int nub = in.nextInt();
	        if(nub%10==nub/10000 && nub/1000%10==nub/10%10)
	        	System.out.println("该数字是回文数");
	        else
	        	System.out.println("该数字不是回文数");
		
	}
}