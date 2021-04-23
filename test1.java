import java.util.StringTokenizer;
public class test1
{
    public static void main(String[]args)
    {
        String s="1 2 3 4 5 6";
        StringTokenizer st=new StringTokenizer(s);
        int sum=0;
        while(st.hasMoreTokens())
        {
            sum+=Integer.parseInt(st.nextToken());
        }
        System.out.println(sum);
        
    }
    
    
}