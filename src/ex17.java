//对10个数进行排序。w
import java.util.Scanner;;     //导入java.util包下的所有类库
public class ex17 {     //声明定义了公共类---Sort
   //从键盘输入10个数字存入数组，并将其按从小到大排列
    public static void main(String[] args) {
        int array[]=new int[10];     //创建一个长度为10的定长数组 
        Scanner arr=new Scanner(System.in);//用Scanner类获取控制台的输入
        System.out .println("请输入10个数字(用空格隔开)：");//显示台输出提示--请输入10个数字(用空格隔开)：
        //用for循环逐一获取控制台输入的十个数字赋值给数组array
        for(int i=0;i<array.length;i++) //定义变量当i=0,当i<数组长度时，执行循环语句，否则跳出；每执行一次i=1+1
        {
            array[i]=arr.nextInt();//接受控制台输入的数字给数组array赋值
        }
         System.out.println();//显示台输出一个空白行用于作间隔
        System.out.print("排序前数组： ");//显示台输出提示--排列前数组：
        //用for循环逐一提取显示数组array的元素
         for(int i=0;i<array.length;i++)//定义变量当i=0,当i<数组长度时，执行循环语句，否则跳出；每执行一次i=1+1
         {
               System.out.print(array[i]+" ");//显示台输出数组array的元素，中间用"空格"隔开
           }

         //对数组用冒泡法进行从小到大的排序
         int temp;  //定义一个整型临时变量temp
         //用两层循环比较两个相邻的元素，将值大的元素交换至右端，一直循环比较n-1趟，直至顺序排列完毕
         for(int i=0;i<array.length;i++) //外层循环控制排序趟数
         {
             for(int j=i+1;j<array.length;j++)  //内层循环控制排序趟数
             {  
                 //若数组元素i大于数组元素j(即第i个数大于第i+1个数)，执行判断语句,调换两数位置，即将较小数往左移
                 if(array[i]>array[j])
                 {
                     //若第i个数大于第i+1个数，则交换位置
                     temp=array[i]; //将第i+1个数放到temp中，array[i] —>temp
                     array[i]=array[j]; //第j个数的值等于第j+1个数的值; array[j]—>array[i]
                     array[j]=temp; //第i+1个数的值=原始存在temp的 值;temp—>array[j]
                 }
             }
         }
         System.out.println();  //显示台输出一个空白行用于作间隔
         System.out.print("\n排序后数组： "); //显示台输出提示--排列后数组：
         //逐一输出顺序排列好的数组值i
         for(int i=0;i<array.length;i++)
         {
             System.out.print(array[i]+" ");//显示台输出数组array的元素，中间用"空格"隔开
         }
    }
}