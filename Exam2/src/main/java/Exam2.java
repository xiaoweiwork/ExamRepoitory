import java.util.Scanner;

/**
 * Created by xiaowei on 2018/8/4.
 */
public class Exam2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入工资");
        while (scanner.hasNext()){
            String s=scanner.next();
            if (!s.matches( "[0-9]+")){
                System.out.println("非数字请重新输入");
            }
            else{
                int salary=Integer.parseInt(s);
                Exam2 exam2=new Exam2();
                System.out.println("需要缴纳的税费是："+exam2.salaryCompute(salary));
            }


        }

    }
    public  double salaryCompute(int salary){
        int taxneed=salary-3500;
        if (taxneed<0){
            return 0.0;
        }
        else if (taxneed<=1500 && taxneed>0) {

            return  taxneed*0.03;

        } else if (taxneed<=4500 && taxneed>1500) {

            return  taxneed*0.1-105;

        } else if (taxneed<=9000 && taxneed>4500) {

            return  taxneed*0.2-555;

        } else if (taxneed<=35000 && taxneed>9000) {

            return  taxneed*0.25-1005;

        } else if (taxneed<=55000 && taxneed>35000) {

            return  taxneed*0.30-2755;

        } else if (taxneed<=80000 && taxneed>55000) {

            return  taxneed*0.35-5505;

        } else if (taxneed>80000) {

            return  taxneed*0.45-13505;

        }
         return  0.0;
    }

}
