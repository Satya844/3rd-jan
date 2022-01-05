public class RecursionExample3 {  
    static int factorial(int n){      
          if (n == 2)      
            return 2;      
          else      
            return(n * factorial(n-1));      
    }      
  
public static void main(String[] args) {  
System.out.println("Factorial of 5 is: "+factorial(5));
System.out.println("Factorial of 7 is: "+factorial(7));
System.out.println("Factorial of 9 is: "+factorial(9));
}  
}  
