package 热身赛.第一次热身赛;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        
        while(n>0){
            int[] a = new int[26];
            String s1 = sc.nextLine();
            char[] c = s1.toCharArray();
            for (int j = 0; j < c.length; j++) {
                a[(int) (c[j] - 'a')]++;
            }
            for (int j = 0; j < 26; j++) {
                if(a[j]>1){
                    System.out.print((char)('a'+j));
                }
            }
            System.out.println();
            n--;
            if(n<1){
                break;
            }
        }
    }
}
