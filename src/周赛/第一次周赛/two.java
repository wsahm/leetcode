package 周赛.第一次周赛;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class two {
    public static void main(String[] args) {
        int[][] events={{1,3,2},{4,5,2},{2,4,3}};
        int y=0;
        int[] w={};
        int[] v={};
        for (int i = 0; i < events.length; i++) {
            if (events[i][1] > y) {
                y = events[i][1];
            }
            w[i]=events[i][1]-events[i][0];
            v[i]=events[i][2];
        }
        int[][] f=new int[events.length][y];
        for (int i = 1; i < f.length; i++) {
            for (int j = 1; j < f[0].length; j++) {
                if(j-w[i]>=0){
                    f[i][j]=max(f[i-1][j],v[i]+f[i-1][j-w[i]]);
                }else{
                    f[i][j]=f[i-1][j];
                }

            }
        }
    }

    private static int max(int i, int i1) {
        return i>i1?i:i1;
    }
}
