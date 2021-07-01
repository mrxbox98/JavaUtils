package me.mrxbox98.minecraft;

import java.util.ArrayList;

public class StringUtils {

    public static final String BLACK="§0";
    public static final String DARK_BLUE="§1";
    public static final String DARK_GREEN="§2";
    public static final String DARK_AQUA="§3";
    public static final String DARK_RED="§4";
    public static final String DARK_PURPLE="§5";
    public static final String GOLD="§6";
    public static final String GRAY="§7";
    public static final String DARK_GRAY="§8";
    public static final String BLUE="§9";
    public static final String GREEN="§a";
    public static final String AQUA="§b";
    public static final String RED="§c";
    public static final String LIGHT_PURPLE="§d";
    public static final String YELLOW="§e";
    public static final String WHITE="§f";
    public static final String OBFUSCATED="§k";
    public static final String BOLD="§l";
    public static final String STRIKETHROUGH="§m";
    public static final String UNDERLINE="§n";
    public static final String ITALIC="§o";
    public static final String RESET="§r";

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
