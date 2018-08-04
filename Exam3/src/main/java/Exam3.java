import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by xiaowei on 2018/8/4.
 */
public class Exam3 {
    public static void main(String[] args)  {
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入日期:");
        while (scanner.hasNext()){
            String s=scanner.next();

            Pattern p = Pattern.compile("^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))?$");
            boolean b= p.matcher(s).matches();
            if (!b){
                System.out.println("日期格式不对！正确格式为2018-06-21");
            }
            else{
//                try {
////                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
////                    Date date=dateFormat.parse(s);
////                    long time=date.getTime();
////                    long addtime=24*60*60*1000;
////                    long newDateTime=time+addtime;
////                    Date newDate=new Date(newDateTime);
////                    System.out.println(dateFormat.format(newDate));
//                }catch (Exception e){
//                    System.out.println(e.getMessage());
//                }
                String[] dateitem=s.split("-");
                int year=Integer.parseInt(dateitem[0]);
                int month=Integer.parseInt(dateitem[1]);
                int day=Integer.parseInt(dateitem[2]);
                if (month==1 || month==3 || month==5|| month==7|| month==8|| month==10|| month==12){
                    if(day+1>31 ){
                        if (month+1>12){
                            day=1;
                            month=1;
                            year=year+1;
                        }else{
                            day=1;
                            month=month+1;
                        }
                    }else{
                        day=day+1;
                    }
                }

                if(month==4 || month==6 || month==9|| month==11){
                    if(day+1>30){
                            day=1;
                            month=month+1;
                        }

                    else{
                        day=day+1;
                    }
                }

                            if(month==2){
                                if(year%400==0 || (year%4==0 && year%100!=0) ){
                                                    if(day+1>29){
                                                        day=1;
                                                        month=month+1;
                                                    }

                                                   else {
                                                    day = day + 1;
                                                   }
                                  }else {
                                    if(day+1>28){
                                        day=1;
                                        month=month+1;
                                    }

                                    else {
                                        day = day + 1;
                                    }
                                 }

                               }
                System.out.println(year+"-"+month+"-"+day);

            }

        }
    }
}
