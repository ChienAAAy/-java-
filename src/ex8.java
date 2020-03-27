//一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？
class ex8{
	public static void main(String args[]) {
		double hign=100;
		int i;
		for(i=1;i<=10;i++)
			hign=hign/2;
		System.out.println(hign+"m");
			
		
	}
}