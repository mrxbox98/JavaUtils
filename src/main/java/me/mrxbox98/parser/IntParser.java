package me.mrxbox98.parser;

public class IntParser {

    public static final String NUMBER_STRING = "123456789";

    /**
     * Gets the integer value of check
     *
     * @param check The string to check for the integer
     *
     * @return The integer's value
     */
    public static int getInt(String check)
    {
        return Integer.valueOf(check);
    }

    /**
     * Cuts a string down to its first int number
     *
     * @param check The string to cut down
     *
     * @return The string with only the int
     */
    public static String cutToInt(String check)
    {
        String num="";

        boolean started=false;

        for(int i=0;i<check.length();i++)
        {
            if(NUMBER_STRING.contains(check.substring(i,i+1)))
            {
                started=true;
                num+=check.substring(i,i+1);
            }
            else if(started)
            {
                return num;
            }
        }
        if(num.length()==0)
        {
            return null;
        }
        return num;
    }
}
