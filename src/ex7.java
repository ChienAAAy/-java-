//����һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ�����
import java.util.Scanner;
public class ex7 {
    public static void main(String args[]) {
        System.out.println("�������ַ�����");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int countO = 0;
        int countM = 0;
        int countE = 0;
        char[] arrChar = str.toCharArray();
        for (int i = 0; i < arrChar.length; i++) {

             if(arrChar[i]>='a') {
            	if(arrChar[i]<='z') 
            		countE++;
            }
            else if(arrChar[i]>='A') {
            	if(arrChar[i]<='Z') 
            		countE++;
            }

            else if('0'<=arrChar[i]&&arrChar[i]<='9' ) {
            	
            	countM++;
            }
            else countO++;
            	
        }
      
        System.out.println("��ĸ�ĸ���" + countE);
        System.out.println("���ֵĸ���" + countM);
        System.out.println("�����ַ��ĸ���" + countO);
    }   
}
