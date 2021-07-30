package me.mrxbox98.math;

import me.mrxbox98.string.StringUtils;

import java.util.ArrayList;

public class MathUtils {

    public static double calcString(String str)
    {
        int plusCount= StringUtils.getCount(str,'+');
        int minusCount= StringUtils.getCount(str,'-');
        if(minusCount==0)
        {
            ArrayList<Integer> integers = new ArrayList<>();
            for(int i=0;i<plusCount;i++)
            {
                integers.add(Integer.parseInt(str.substring(0, str.indexOf('+'))));
                str=str.substring(str.indexOf('+')+1);
            }
            int count=0;
            for(int i=0;i<integers.size();i++)
            {
                count+= integers.get(i);
            }
            return count;
        }
        return 0;
    }

}
