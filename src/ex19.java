import java.util.Scanner;

//дһ����������һ���ַ����ĳ��ȣ���main�����������ַ�����������䳤��
class ex19{
	public static void main(String arg[]) {
		System.out.println("����һ���ַ���");
		Scanner arr=new Scanner(System.in);
        String in=arr.nextLine();
        char[] a=new char[100];
        a=in.toCharArray();
        int j=0;
        for(int i:a)
        	j=j+1;
        System.out.println("����Ϊ"+j);
	}
	
}