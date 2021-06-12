package assignments;
import java.util.Scanner;

public class A6Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 of true or else 0 if false");
        System.out.println("Enter the first one");
        int num1 = input.nextInt();
        System.out.println("Enter the second one");
        int num2 = input.nextInt();

        hamlet(num1,num2);
    }
    static int hamlet (int num1,int num2 )
    {
        if (num1 == 1 || num2 == 1 || num1 == 1 && num2 == 1)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }

        return 0;
    }
}
