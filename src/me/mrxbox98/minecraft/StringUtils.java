package me.mrxbox98.minecraft;

import java.util.ArrayList;

public class StringUtils {



    /**
     * Converts multiple lines into a block of lines so that
     * other plugins text cannot be in the middle of it
     *
     * @param str Text to convert
     *
     * @return Block text
     */
    public static String blockTextArrayList(ArrayList<String> str)
    {
        String ret="";

        for(int i=0;i<str.size();i++)
        {
            ret+=str.get(i)+"\n";
        }
        return ret;
    }

    /**
     * Converts multiple lines into a block of lines so that
     * other plugins text cannot be in the middle of it
     *
     * @param str Text to convert
     *
     * @return Block text
     */
    public static String blockTextArray(String[] str)
    {
        String ret="";

        for(int i=0;i<str.length;i++)
        {
            ret+=str[i]+"\n";
        }
        return ret;
    }

}
