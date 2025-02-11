
import java.util.*;
public class Maximum {

    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int inp=sc.nextInt();
            list.add(inp);
        }
        int max=Integer.MIN_VALUE;
        for(int i=1;i<=list.size();i++)
        {
            if(max<list.get(i-1))
            {
                max=list.get(i-1);
            }
        }

        System.out.println("The Maximum value: "+max);
    }
    
}
