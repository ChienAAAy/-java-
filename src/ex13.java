//��һ�������У�2/1��3/2��5/3��8/5��13/8��21/13�����������е�ǰ20��֮�͡�
class ex13{
    public static void main(String[] args) {
        float fm = 1f;
        float fz = 1f;
        float temp;
        float sum = 0f;
        for (int i = 0; i < 20; i++) {
            temp = fm;
            fm = fz;
            fz = fz + temp;
            sum += fz / fm;
            //System.out.println(sum);
        }
        System.out.println(sum);
    }
}
