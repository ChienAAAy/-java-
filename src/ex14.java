//Çó1+2!+3!+¡­+20!µÄºÍ¡£
class ex14{
	public static void main(String args[]) {
		int i,j,sum=0,mul=1;
		for(i=1;i<21;i++) {
			for(j=1;j<=i;j++)
				mul=mul*j;
			sum=sum+mul;
			mul=1;
		}
		System.out.println(sum);
	}
}