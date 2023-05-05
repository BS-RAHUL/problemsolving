import java.util.Scanner;

public class Armstrong
{
    
    
    public static int power(int base,int exp){
        
        int ret=1;
        
        for(int i=1;i<=exp;i++){
            ret = ret * base;
        }
        
        return ret;
        
    }
    
    public static int toCalculateArmstrong()
    {
        int number;
        Scanner inputArmstrong = new Scanner(System.in);
        System.out.println("Enter the number to check whether it is armstrong or not ?");
        number = inputArmstrong.nextInt();
        int remainder ;
        int temp = number;
        int sumForArmstrong = 0;
        
        int count = 0;
        
        while(number > 0){
            
            count++;
            number = number / 10;
        }
        
        number = temp;
        while(number > 0)
        {
           
            remainder = number % 10;
        
            sumForArmstrong = sumForArmstrong + power(remainder,count);
            
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
