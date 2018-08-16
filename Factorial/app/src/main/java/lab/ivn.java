package lab;

public class ivn {

  public static void main(String[] args) {
    //System.out.println(factorial(5));
    return;
  }
  
  public long factorial(int n){
    if (n<2){
      return 1;
    }
      else{
        return n * factorial(n-1);
      }
  }
  
  
  
  
  
}