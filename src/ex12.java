//����ƹ����ӽ��б������������ˡ��׶�Ϊa,b,c���ˣ��Ҷ�Ϊx,y,z���ˡ��ѳ�ǩ���������������������Ա����������������
//a˵������x�ȣ�c˵������x,z�ȣ��������ҳ��������ֵ�������
import java.util.ArrayList;
public class ex12 {
     String a, b, c;

    public static void main(String[] args) {
        String[] op = {"x", "y", "z"};
        ArrayList<ex12> arrayList = new ArrayList<ex12>();
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                for (int k = 0; k < 3; k++) {
                	ex12 a = new ex12(op[i], op[j], op[k]);
                    if (!a.a.equals(a.b) && !a.b.equals(a.c) && !a.a.equals("x")
                            && !a.c.equals("x") && !a.c.equals("z")) {
                        arrayList.add(a);
                    }
                }
        for (Object a : arrayList) {
            System.out.println(a);
        }
    }

    public ex12(String a, String b, String c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "a�Ķ�����" + a + "," + "b�Ķ�����" + b + "," + "c�Ķ�����" + c + "\n";
    }
}