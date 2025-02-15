import java.util.*;
public class Multidimention {
    
    public static void main(String args[])
    {
        // 2-D arraylist
        ArrayList<ArrayList<Integer>> a=new ArrayList<>();

        ArrayList<Integer> x=new ArrayList<>();
        ArrayList<Integer> y=new ArrayList<>();
        ArrayList<Integer> z=new ArrayList<>();

        for(int i=1;i<=5;i++)
        {
            x.add(i);
        }
        for(int i=6;i<=10;i++)
        {
            y.add(i);
        }
        for(int i=11;i<=15;i++)
        {
            z.add(i);
        }

        a.add(x);
        a.add(y);
        a.add(z);

        System.out.println(a);

        System.out.println(a.get(2));
        System.out.println(a.get(2).get(1));
        // to access the elements in 2-D

        System.out.println("\n\n\n\n");
        for(int i=1;i<=a.size();i++)
        {
            for(int j=1;j<=a.get(i-1).size();j++)
            {
                System.out.println(a.get(i-1).get(j-1));
            }
        }


    }
}
