import java.util.Scanner;
@SuppressWarnings("all")
//TO PREVENT OVERFLOW IN ANY CASE JUST MULTIPLY BY (int)(1L X) THIS WILL PREVENT OVERFLOW AS LONG WILL NOT 
public class CpMath {
    public static void main(String[] args) {
        int m,a,b;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        m = s.nextInt();
        System.out.println(power(a, b, m));
        // division(a, b, m);
        s.close();
      }
    
      //NORMAL WAYS
      
     //(a+b)%m = ((a%m)+(b%m))%m
      //(a*b)%m = ((a%m)*(b%m))%m
      //(a-b)%m = ((a%m)-(b%m)+m)%m
    
    
      //BINARY EXPONENTIATION
      //BPOW
      //o(log n)
      
  //POWER
      private static int power(int a,int b,int m){
        if(b==0){
            return a%m;
        }
        if(b%2==0){
            int t = power(a, b/2, m);
            return (int)(1L*t*t)%m;
        }
        else{
            int t = power(a, (b-1)/2, m);
            t = (int)(1L*t*t)%m;
            return (int)(1L*a*t)%m;
        }
      }

   
      //INVERSE
      private static int inverse(int x,int m){
        return power(x, m-2, m);
       }

       //DIVISION

    //works only for prime m
    //fermats little theorem
      private static void division(int a,int b,int m){
        int res1 = (a/b)%m;
        int inv_b = power(b, m-2, m);
        int res2 = a*inv_b%m;
        System.out.println(res1+" "+res2);
      }
     
}
