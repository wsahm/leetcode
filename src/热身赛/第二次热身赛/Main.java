package 热身赛.第二次热身赛;

import java.sql.Connection;
import java.lang.String;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while(t>0){
            long cs1=1;
            long cs2=2;
            long a=scanner.nextLong();
            long sum=0;
            for (long i = 3; i <= a; i++) {
                long cf=1;
                for (int j = 0; j < 3; j++) {
                    cf=(cf*(i%123456789))%123456789;
                }
                sum=(2*cs1+cs2+cf)%123456789;
                cs1=cs2;
                cs2=sum;
            }
            System.out.println(sum);
            t--;
        }
    }
}
