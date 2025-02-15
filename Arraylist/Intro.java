
import java.util.*;
public class Intro
{
    public static void main(String args[])
    {
        // it is a linear data structutre
        // arraylist was also a linear structutre

        // Dynamic Size
        // primitive datatypes could not be 
        
        // dynamic siz e property will sove the fixed size property 

        //ArrayList<Integer> a=new ArrayList<>();

        // we can store the objects of the Integer class not primitively

        // String | Boolean | Charecter |Float | Double

        // various classes for the Arraylist to store

        //ArrayList<String> b=new ArrayList<>();
        //ArrayList<Boolean> c=new ArrayList<>();

        // similar to the vectors in the c++
        // this was the part of the java collections framework

        // add element O(1)
        // get element O(1)
        // remove element O(n)
        // set element O(n)
        // contans element O(n)

        ArrayList<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        System.out.println(list.toString());

        // to ge the elemt at an index

        System.out.println(list.get(2));
        // we have to give the index in get method

        // it will gove in constant time

        // remove element

        list.remove(2);
        // the above will take the linear time

        System.out.println(list.toString());

        list.set(2,99);
        System.out.println(list.toString());

        // set operation was also an linear operation

        System.out.println(list.contains(12));
        System.out.println(list.contains(1));

        // the above contains operationwill check the availabolity
        // O(n)

        list.add(2,100);
        System.out.println(list.toString());
       
        // size() which will give the size of the array
        System.out.println(list.toString());
        System.out.println(list.size());

        // to print the arraylist

        for(int i=1;i<=list.size();i++)
        {
            System.out.println(list.get(i-1));
        }

        for(int i:list)
        {
            System.out.println(i);
        }

        
        // Arraylist will behave as an arrays but it will change in some parts of implementation

        // when we declare the Arraylist it will form the array of some fixed size then the array completely/half filled

        // then java will create a new array of double size and then cpies all elements to it 
        

    }
}