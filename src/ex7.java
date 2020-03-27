//输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
import java.util.Scanner;
public class ex7 {
    public static void main(String args[]) {
        System.out.println("请输入字符串：");
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
      
        System.out.println("字母的个数" + countE);
        System.out.println("数字的个数" + countM);
        System.out.println("其他字符的个数" + countO);
    }   
}
