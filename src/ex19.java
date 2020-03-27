import java.util.Scanner;

//写一个函数，求一个字符串的长度，在main函数中输入字符串，并输出其长度
class ex19{
	public static void main(String arg[]) {
		System.out.println("输入一个字符串");
		Scanner arr=new Scanner(System.in);
        String in=arr.nextLine();
        char[] a=new char[100];
        a=in.toCharArray();
        int j=0;
        for(int i:a)
        	j=j+1;
        System.out.println("长度为"+j);
	}
	
}