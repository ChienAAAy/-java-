//��ӡ�����е� "ˮ�ɻ��� "����ν "ˮ�ɻ��� "��ָһ����λ�������λ���������͵��ڸ�������
//���磺153��һ�� "ˮ�ɻ��� "����Ϊ153=1�����η���5�����η���3�����η���
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
