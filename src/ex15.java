//利用递归方法求5!
class ex15{
	public static void main(String args[]) {
		System.out.println(fun(5));
	}
	static int fun(int n) {
		if(n==0)
			return 1;
		else return n*fun(n-1);
		
	}
	
}