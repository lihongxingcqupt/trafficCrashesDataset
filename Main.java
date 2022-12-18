package jitiao1;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String end = "";
        end += sc.nextInt();
        String begin = end+"-01"+"-01";
        end += "-"+sc.nextInt();
        end += "-"+sc.nextInt();
        int beginDay = sc.nextInt();

        DateFormat dft = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date star = dft.parse(begin);//开始时间
            Date endDay=dft.parse(end);//结束时间
            Long starTime=star.getTime();
            Long endTime=endDay.getTime();
            Long num=endTime-starTime;//时间戳相差的毫秒数
            long day = num/24/60/60/1000;
            long zhou = day / 7;
            long a = day % 7;
            if(a + beginDay > 7){
                zhou += 1;
            }
            System.out.println(zhou+1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}



