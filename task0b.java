import java.util.Scanner;
public class task0b
{
    public static void main(String[]args)
    {
        
        String s="23 3 8 20 32";
        int sum=0;
        Scanner a=new Scanner(s);
       for(;a.hasNextInt();)
        {
            sum+=Integer.parseInt(a.next());
           
        }
        System.out.println(sum);
        for(;a.hasNextInt();)
        {
         System.out.println(a.nextInt());
        }
    }
    
    
}