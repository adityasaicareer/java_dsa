import java.util.*;
public class Sort {

    public static void main(String args[])
    {
        // Collectins.sort();
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(9);
        list.add(4);

        Collections.sort(list);

        System.out.println(list);
        // it will be sorted in ascending order
        // for descending order


        Collections.sort(list,Collections.reverseOrder());
        // Collections.reverseOrder() was a comparitor

        System.out.println(list.toString());
        // in descending order

        

    }
    
}
