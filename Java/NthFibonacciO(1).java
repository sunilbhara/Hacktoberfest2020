//golden ratio is (1+sqrt(5))/2 which compute to 1.61. Multiple it with n and round it off.

import java.util.*;


public class nthfibo 
{
    static void nthfibonacci(int n)
    {
        double goldenratio = (1+Math.sqrt(5))/2;
        double res = Math.round(Math.pow(goldenratio, n)/Math.sqrt(5)); 
        System.out.println((int)res);
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        nthfibonacci(n);
        
    }
}
