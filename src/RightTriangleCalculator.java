import java.util.Scanner;

public class RightTriangleCalculator {
    public static void main(String[] args) {

        /*
        Ödev
        Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
        Formül
        Üçgenin cevresi = 2𝑢
        𝑢 = (a+b+c) / 2
        Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
         */

                // Declare int, double variables
                int a, b ;
                double c,  u, perimeter, area ;


                //create a new object

                Scanner input = new Scanner ( System.in);

                // prompt the user to input integers for all variables respectively

                System.out.print( " Enter cathetus A : ");
                a = input.nextInt();

                System.out.print( " Enter cathetus B : ");
                b = input.nextInt();

                // To solve for, take the square root of both sides to get c = √(b²+a²).
                c = Math.sqrt( ( a * a ) + ( b * b ) );


                // Display Hypotenuse
                System.out.println( " Hypotenuse " + c );

                // Calculate u
                u = ( a + b + c ) / 2 ;

                // Calculate perimeter of triangle
                perimeter  = 2 * u ;

                // Calculate area of triangle
                area = Math.sqrt ( u * ( u - a ) * ( u - b ) * ( u - c ));

                // Display perimeter and area of triangle
                System.out.println( " Perimeter of triangle : " + perimeter );
                System.out.println( " Area of triangle :" + area );


    }
}