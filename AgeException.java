import java.util.Scanner;
class aex extends Exception
{
    aex(String m)
    {
            super(m);
    }
}
    class AgeException 
    {
        public static void main(String[] args)
        {
            try
            {
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter the age:");
                int age=sc.nextInt();
                if(age>18)
                {
                    System.out.println("Eligible to vote");
                }
                else
                {
                   throw new aex("Not eligible to vote");
                }
            }  
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
