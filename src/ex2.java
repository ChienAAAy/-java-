//�ж�101-200֮���ж��ٸ����������������������
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