//��10������������w
import java.util.Scanner;;     //����java.util���µ��������
public class ex17 {     //���������˹�����---Sort
   //�Ӽ�������10�����ִ������飬�����䰴��С��������
    public static void main(String[] args) {
        int array[]=new int[10];     //����һ������Ϊ10�Ķ������� 
        Scanner arr=new Scanner(System.in);//��Scanner���ȡ����̨������
        System.out .println("������10������(�ÿո����)��");//��ʾ̨�����ʾ--������10������(�ÿո����)��
        //��forѭ����һ��ȡ����̨�����ʮ�����ָ�ֵ������array
        for(int i=0;i<array.length;i++) //���������i=0,��i<���鳤��ʱ��ִ��ѭ����䣬����������ÿִ��һ��i=1+1
        {
            array[i]=arr.nextInt();//���ܿ���̨��������ָ�����array��ֵ
        }
         System.out.println();//��ʾ̨���һ���հ������������
        System.out.print("����ǰ���飺 ");//��ʾ̨�����ʾ--����ǰ���飺
        //��forѭ����һ��ȡ��ʾ����array��Ԫ��
         for(int i=0;i<array.length;i++)//���������i=0,��i<���鳤��ʱ��ִ��ѭ����䣬����������ÿִ��һ��i=1+1
         {
               System.out.print(array[i]+" ");//��ʾ̨�������array��Ԫ�أ��м���"�ո�"����
           }

         //��������ð�ݷ����д�С���������
         int temp;  //����һ��������ʱ����temp
         //������ѭ���Ƚ��������ڵ�Ԫ�أ���ֵ���Ԫ�ؽ������Ҷˣ�һֱѭ���Ƚ�n-1�ˣ�ֱ��˳���������
         for(int i=0;i<array.length;i++) //���ѭ��������������
         {
             for(int j=i+1;j<array.length;j++)  //�ڲ�ѭ��������������
             {  
                 //������Ԫ��i��������Ԫ��j(����i�������ڵ�i+1����)��ִ���ж����,��������λ�ã�������С��������
                 if(array[i]>array[j])
                 {
                     //����i�������ڵ�i+1�������򽻻�λ��
                     temp=array[i]; //����i+1�����ŵ�temp�У�array[i] ��>temp
                     array[i]=array[j]; //��j������ֵ���ڵ�j+1������ֵ; array[j]��>array[i]
                     array[j]=temp; //��i+1������ֵ=ԭʼ����temp�� ֵ;temp��>array[j]
                 }
             }
         }
         System.out.println();  //��ʾ̨���һ���հ������������
         System.out.print("\n��������飺 "); //��ʾ̨�����ʾ--���к����飺
         //��һ���˳�����кõ�����ֵi
         for(int i=0;i<array.length;i++)
         {
             System.out.print(array[i]+" ");//��ʾ̨�������array��Ԫ�أ��м���"�ո�"����
         }
    }
}