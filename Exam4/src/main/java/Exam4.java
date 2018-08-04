import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by xiaowei on 2018/8/4.
 */
public class Exam4 {
    public static void main(String[] args) {
        Random random=new Random();
        Map map=new HashMap();
        List list=new ArrayList();
        System.out.print("随机生成50个小于100的数，分别为:");
        for (int i=0;i<50;i++) {
            int n=random.nextInt(100);
            System.out.print(n+",");
            list.add(n);
        }
        List list1=new ArrayList();
        List list2=new ArrayList();
        List list3=new ArrayList();
        List list4=new ArrayList();
        List list5=new ArrayList();
        List list6=new ArrayList();
        List list7=new ArrayList();
        List list8=new ArrayList();
        List list9=new ArrayList();
        List listtemp=new ArrayList();
        map.put(1,list1);
        map.put(2,list2);
        map.put(3,list3);
        map.put(4,list4);
        map.put(5,list5);
        map.put(6,list6);
        map.put(7,list7);
        map.put(8,list8);
        map.put(9,list9);

        for (int i = 0; i <50 ; i++) {
           int num=(int)list.get(i);
           if(num/10 != 0){
               listtemp=(ArrayList)map.get(num/10);
               listtemp.add(num);
           }
        }
        System.out.print("\nMap中的数据为：{");

        for (int a=0;a<10;a++){

            System.out.print(a+"=>");

            if (map.get(a)==null){
                System.out.print("null,");
            }else{
                System.out.print(map.get(a)+",");
            }
        }
        System.out.print("}\n");


     //排序
        Comparator c = new Comparator<Integer>() {

            @Override

            public int compare(Integer o1, Integer o2) {

                // TODO Auto-generated method stub

                if((int)o1>(int)o2)

                    return 1;

                    //注意！！返回值必须是一对相反数，否则无效。jdk1.7以后就是这样。

                    //		else return 0; //无效

                else return -1;

            }

        };

        System.out.print("排序后的Map为：{");

        for (int a=0;a<10;a++){

            System.out.print(a+"=>");
            ArrayList list10=(ArrayList)map.get(a);

            if (map.get(a)==null){
                System.out.print("null,");
            }else{
                Collections.sort(list10,c);
                System.out.print(list10+",");
            }
        }
        System.out.print("}\n");
    }

}
