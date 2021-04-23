public class test5
{
    public static void main(String[]args)
    {
        String s="1,2,3,4,5,6";
        String[]array=s.split(",");
        int sum=0;
        for(int i=0; i<array.length;i++)
        {
            sum+=Integer.parseInt(array[i]);
        }
        System.out.println(sum);
    }
    
    
}