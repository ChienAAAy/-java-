//��1��2��3��4�����֣�����ɶ��ٸ�������ͬ�����ظ����ֵ���λ�������Ƕ��٣�
class ex9{
	public static void main(String args[]) {
		int i,j,x,y=0;
		for(i=1;i<5;i++) 
			for(j=1;j<5;j++) 
				for(x=1;x<5;x++) 
					if(i!=j&&i!=x&&j!=x) {
					y=y+1;
					System.out.println(i*100+j*10+x);
					}

		System.out.println(y);
		}
	}
	