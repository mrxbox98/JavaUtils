package me.mrxbox98.parser;

public class DoubleParser {

    public static final String NUMBER_STRING="1234567890.";

    /**
     * Gets the value of string
     *
     * @param check the string to get the double from
     *
     * @return the double in the string
     */
    public static double getDouble(String check)
    {
        return Double.valueOf(check);
    }

    /**
     * Cuts a string to its double value
     *
     * @param check the string to cut
     *
     * @return the cut string
     */
    public static String cutToDouble(String check)
    {
        boolean foundNumber=false;
        String num="";
        for(int i=0;i<check.length();i++)
        {
            if(NUMBER_STRING.contains(check.substring(i,i+1)))
            {
                foundNumber=true;
                num+=check.substring(i,i+1);
            }
            else if(foundNumber)
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
