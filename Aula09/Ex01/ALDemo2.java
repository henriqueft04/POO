package Aula09.Ex01;
import Aula07.Ex02.DateYMD;
import Aula07.Ex02.Date;
import java.util.Set;
import java.util.TreeSet;

public class ALDemo2 {

    public static void main(String[] args) {

        Set<Date> c4 = new TreeSet<>();
        Date d1 = new DateYMD(6,10,2001);
        Date d2 = new DateYMD(12,5,2002);
        Date d3 = new DateYMD(2,7,2000);
        Date d4 = new DateYMD(4,8,2000);
        Date d5 = new DateYMD(20,4,2000);

        c4.add(d1);
        c4.add(d2);
        c4.add(d3);
        c4.add(d4);
        c4.add(d5);

        for(Date d : c4){
            System.out.println(d);
        }

    }
    
    
}
