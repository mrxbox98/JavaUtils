package me.mrxbox98.sorting;

import java.util.ArrayList;

public class sort {

    /**
     * Very inefficient sort I would not recommend using this
     *
     * @param array An array of Integers
     *
     * @return The hopefully sorted array of Integers
     */
    public static ArrayList<Integer> sortInteger(ArrayList<Integer> array)
    {
        for(int i=0;i<array.size();i++)
        {
            for(int x=0;x<array.size();x++)
            {
                if(i>x)
                {
                    if(array.get(i)<array.get(x))
                    {
                        Integer temp=array.get(i);
                        array.set(i,array.get(x));
                        array.set(x,temp);
                    }
                }
                if(x>i)
                {
                    if(array.get(x)<array.get(i))
                    {
                        Integer temp=array.get(x);
                        array.set(x,array.get(i));
                        array.set(i,temp);
                    }
                }
            }
        }
        return array;
    }

}
