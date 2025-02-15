import java.util.*;
public class Multidimprac {

    public static void main(String args[])
    {
        ArrayList<ArrayList<Integer>> Main=new ArrayList<>();

        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        ArrayList<Integer> c=new ArrayList<>();

        for(int i=1;i<=5;i++)
        {
            a.add(1*i);
            b.add(2*i);
            c.add(3*i);
        }

        Main.add(a);
        Main.add(b);
        Main.add(c);

        System.out.println(Main);
        for(int i=1;i<=Main.size();i++)
        {
            for(int j=1;j<=Main.get(i-1).size();j++)
            {
                System.out.println(Main.get(i-1).get(j-1));
            }
        }
    }
    
}
