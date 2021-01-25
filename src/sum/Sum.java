
package sum;

import java.util.Scanner;


public class Sum {
    public static void test(){
         Scanner sc = new Scanner (System.in);
        System.out.println("Enter two number:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int result = x+y;
        System.out.printf("addition result : %d\n",result);

}
    public static void main(String[] args) {
        test();
       
       
    }
    
}
