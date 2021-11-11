package 周赛.第一次周赛;

public class one {
    public static void main(String[] args) {
        String arr[]={"a","b","a"};
        String arr1[]=new String[arr.length];
        int k=3;
        int w=0;
        for(int i=0;i<arr.length;i++){
            int num=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i].equals(arr[j])&&i!=j){
                    num=1;
                }
            }
            if(num==0){
                arr1[w++]=arr[i];
            }
        }
        if(arr1.length>=k && arr1[k-1]!=null){
            System.out.println(arr1[k-1]);
        }else{
            System.out.println("");
        }
    }
}
