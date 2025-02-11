import java.util.*;
public class Reverse{
    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= 5; i++)
        {
            list.add(i);
        }
        System.out.println("The List before: " + list);

        for(int i = 1; i <= list.size(); i++)
        {
            System.out.println("Index: " + (list.size() - i) + ", Value: " + list.get(list.size() - i));
        }
    }
}