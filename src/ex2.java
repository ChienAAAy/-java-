//判断101-200之间有多少个素数，并输出所有素数。
class ex2{
	public static void main(String args[]) {
		int i,j;
		for(i=101;i<201;i++)
		{
			for(j=2;j<i;j++)
				if(i%j==0)
					break;
			if(j==i)
				System.out.println(i);
		}
		
			
	}
}