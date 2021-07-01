package me.mrxbox98.minecraft;

import java.util.ArrayList;

public class StringUtils {

    public static final String BLACK;
    public static final String DARK_BLUE;
    public static final String DARK_GREEN;
    public static final String DARK_AQUA;
    public static final String DARK_RED;
    public static final String DARK_PURPLE;
    public static final String GOLD;
    public static final String GRAY;
    public static final String DARK_GRAY;
    public static final String BLUE;
    public static final String GREEN;
    public static final String AQUA;
    public static final String RED;
    public static final String LIGHT_PURPLE;
    public static final String YELLOW;
    public static final String WHITE;
    public static final String OBFUSCATED;
    public static final String BOLD;
    public static final String STRIKETHROUGH;
    public static final String UNDERLINE;
    public static final String ITALIC;
    public static final String RESET;

    static {
        BLACK = "§0";
        DARK_BLUE = "§1";
        DARK_GREEN = "§2";
        DARK_AQUA = "§3";
        DARK_RED = "§4";
        DARK_PURPLE = "§5";
        GOLD = "§6";
        GRAY = "§7";
        DARK_GRAY = "§8";
        BLUE = "§9";
        GREEN = "§a";
        AQUA = "§b";
        RED = "§c";
        LIGHT_PURPLE = "§d";
        YELLOW = "§e";
        WHITE = "§f";
        OBFUSCATED = "§k";
        BOLD = "§l";
        STRIKETHROUGH = "§m";
        UNDERLINE = "§n";
        ITALIC = "§o";
        RESET = "§r";
    }

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
