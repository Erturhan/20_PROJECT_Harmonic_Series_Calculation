import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double num1 = 1  , result = 0 ;

        while(true)
        {
            System.out.print("Please , enter the number you want :");
            num1 = scan.nextInt();

            if (num1 > 1)
           {
               for (double i = num1 ; i >= 1 ; i --)
               {
                   result  += (1.0 / i) ;
               }
               System.out.println(result);
               break ;
           }
            else {
                System.out.println("The wrong entery , try again !");
            }



        }


    }
}