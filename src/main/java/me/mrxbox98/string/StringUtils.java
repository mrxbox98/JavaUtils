package me.mrxbox98.string;

public class StringUtils {

    public static int getCount(String str, char c)
    {
        if(str.indexOf(c)==-1)
        {
            return 0;
        }
        return getCount(str.substring(0,str.indexOf(c))+str.substring(str.indexOf(c)),c)+1;
    }

}
