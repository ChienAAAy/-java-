//��һ��������������100����һ����ȫƽ����������168����һ����ȫƽ���������ʸ����Ƕ��٣�
class ex10{
	public static void main (String[]args){
	    long k=0;
	    for(k=1;k<=100000l;k++)
	       if(Math.floor(Math.sqrt(k+100))==Math.sqrt(k+100) && Math.floor(Math.sqrt(k+168))==Math.sqrt(k+168))
	           System.out.println(k);
	    }
	}
