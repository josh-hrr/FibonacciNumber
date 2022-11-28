class Main {
  public static void main(String[] args) {
      System.out.println(fib(10)); 
  }   
    public static int fib(int n) {
      int[] result = new int[100];
        if(result[n] != 0){
            return result[n];
        }       
        if(n<=1){
            return n;
        }       
        result[n] = fib(n-1) + fib(n-2);      
        return result[n];
    }
}