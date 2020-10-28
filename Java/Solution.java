public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int n=A.size();
        if(B>n){
            B=n;
        }
        int[][] arr=new int[B+1][n+1];
        for(int i=0;i<=n;i++){
            arr[0][i]=0;
        }
        for(int i=0;i<=B;i++){
            arr[i][0]=0;
        }
        for(int i=1;i<=B;i++){
            for(int j=1;j<=n;j++){
                int a=0;
                for(int j1=1;j1<j;j1++){
                    if(a<arr[i-1][j1-1]-A.get(j1-1)+A.get(j-1)){
                        a=arr[i-1][j1-1]-A.get(j1-1)+A.get(j-1);
                    }
                    arr[i][j]=Math.max(arr[i][j-1],a);
                }
            }
        }
        return arr[B][n];
    }
}
