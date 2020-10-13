class fibonacci {
    public static long fib(int x) {
          if (x <= 1) 
            return x; 
        return fib(x - 1) + fib(x - 2); 
    }

    public static void main(String args[]) {
        int n=9;
        System.out.println("The "+n+"th Fibonacci number is: "+fib(n));
        
    }
}
