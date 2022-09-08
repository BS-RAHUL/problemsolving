import java.util.Scanner;

public class armstrong
{
    public static int toCalculateArmstrong()
    {
        float number;
        Scanner inputArmstrong = new Scanner(System.in);
        System.out.println("Enter the number to check whether it is armstrong or not ?");
        number = inputArmstrong.nextInt();
        int remainder ;
        float temp = number;
        float sumForArmstrong = 0;
        while(number > 0)
        {
            remainder = (int)number % 10;
            sumForArmstrong = sumForArmstrong + (remainder * remainder * remainder);
            number = number / 10;
        }
        if(sumForArmstrong == temp)
        {
            return 1;
        }else
        {
            return 0;
        }

    }

    public static void main(String[] args)
    {
         int result = toCalculateArmstrong();
         if(result == 1)
         {
             System.out.println("It is an Armstrong Number  ");
         }else
         {
             System.out.println("It is not an Armstrong Number ");
         }
 
    }
}
