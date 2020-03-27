//：一个整数，它加上100后是一个完全平方数，加上168又是一个完全平方数，请问该数是多少？
class ex10{
	public static void main (String[]args){
	    long k=0;
	    for(k=1;k<=100000l;k++)
	       if(Math.floor(Math.sqrt(k+100))==Math.sqrt(k+100) && Math.floor(Math.sqrt(k+168))==Math.sqrt(k+168))
	           System.out.println(k);
	    }
	}
