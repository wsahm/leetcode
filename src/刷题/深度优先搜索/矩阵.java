package 刷题.深度优先搜索;

public class 矩阵 {
    static int[] x={1,-1,0,0};
    static int[] y={0,0,-1,1};
    public static void main(String[] args) {
        int[][] mat={{0,0,0},{0,1,0},{0,0,0}};
        updateMatrix(mat);
    }
    public static int[][] updateMatrix(int[][] mat) {

        int[][] arr=new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    arr[i][j]=0;
                }else{
                    fun(mat,arr,i,j,i,j);
                }
            }
        }
        return arr;
    }
    public static void fun(int[][] mat,int[][] arr,int i,int j,int x1,int y1){
        if(mat[x1][y1]==0){
            arr[i][j]++;
        }else{
            for(int l=0;l<4;l++){
                x1=x[l]+i;
                y1=y[l]+i;
                if(x1>=0&&x1<4&&y1>=0&&y1<4){
                    fun(mat,arr,i,j,x1,y1);
                }
            }
        }
    }
}
