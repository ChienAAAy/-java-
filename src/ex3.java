//打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。
//例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。
class ex3{
	public static void main(String args[]) {
		int x;
		math mathx= new math();
		for(x=100;x<=999;x++)
			mathx.shuixianhua(x);
	}
}
class math{
    public void shuixianhua(int x) {
        int i = 0, j = 0, k = 0;
        i = x / 100;
        j = (x % 100) / 10;
        k = x % 10;
        if (x == i * i * i + j * j * j + k * k * k)
            System.out.println(x);
    }
}
