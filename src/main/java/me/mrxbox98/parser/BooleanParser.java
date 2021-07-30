package me.mrxbox98.parser;

public class BooleanParser {

    /**
     * Checks whether the string supplied is true or false
     *
     * @precondition the string is either "true" or "false"
     *
     * @param check the string to check
     *
     * @return true if the string is "true"; false otherwise
     */
    public static boolean getBoolean(String check)
    {
        if(check.toLowerCase().equals("false"))
        {
            return false;
        }
        if(check.toLowerCase().equals("true"))
        {
            return true;
        }
        else
        {
            throw new IllegalArgumentException("This String is not a boolean");
        }
    }

    /**
     * Check whether the string is "true"
     *
     * @param check The string to check
     *
     * @return true if the string is "true" and false otherwise
     */
    public static boolean isTrue(String check)
    {
        return getBoolean(check);
    }

    /**
     * Check whether the string is "false"
     *
     * @param check The string to check
     *
     * @return true if the string is "false" and false otherwise
     */
    public static boolean isFalse(String check)
    {
        return !getBoolean(check);
    }

    /**
     * Cuts the string to only be a string boolean
     *
     * @param check the string to cut
     *
     * @return null if it has no "true" or "false"
     */
    public static String cutToBoolean(String check)
    {
        if(check.toLowerCase().indexOf("true")==-1 || check.toLowerCase().indexOf("false")==-1)
        {
            return null;
        }
        if(check.toLowerCase().indexOf("true")==-1)
        {
            check.substring(check.indexOf("false"),check.indexOf("false")+5);
        }
        if(check.toLowerCase().indexOf("false")==-1)
        {
            check.substring(check.indexOf("true"),check.indexOf("true")+4);
        }
        return check;
    }

}
