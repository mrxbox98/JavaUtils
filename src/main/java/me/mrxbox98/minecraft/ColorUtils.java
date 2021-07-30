package me.mrxbox98.minecraft;

import java.lang.reflect.Field;
import java.util.HashMap;

public class ColorUtils {

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
    public static final HashMap<String, String> colorStrings = new HashMap<>();


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
        colorStrings.put("BLACK",BLACK);
        colorStrings.put("DARK_BLUE",DARK_BLUE);
        colorStrings.put("DARK_GREEN",DARK_GREEN);
        colorStrings.put("DARK_AQUA",DARK_AQUA);
        colorStrings.put("DARK_RED",DARK_RED);
        colorStrings.put("DARK_PURPLE",DARK_PURPLE);
        colorStrings.put("GOLD",GOLD);
        colorStrings.put("GRAY",GRAY);
        colorStrings.put("DARK_GRAY",DARK_GRAY);
        colorStrings.put("BLUE",BLUE);
        colorStrings.put("GREEN",GREEN);
        colorStrings.put("AQUA",AQUA);
        colorStrings.put("RED",RED);
        colorStrings.put("LIGHT_PURPLE",LIGHT_PURPLE);
        colorStrings.put("YELLOW",YELLOW);
        colorStrings.put("WHITE",WHITE);
        colorStrings.put("OBFUSCATED",OBFUSCATED);
        colorStrings.put("BOLD",BOLD);
        colorStrings.put("STRIKETHROUGH",STRIKETHROUGH);
        colorStrings.put("UNDERLINE",UNDERLINE);
        colorStrings.put("ITALIC",ITALIC);
        colorStrings.put("RESET",RESET);
    }

    /**
     * Applies a color to the selected text
     *
     * @param color Color to apply
     *
     * @param apply The string to apply it to
     *
     * @return The colored string
     *
     * @throws NoSuchFieldException if the color is not in the list of colors above
     */
    public static String applyColor(String color, String apply) throws NoSuchFieldException {
        Field colorCode = ColorUtils.class.getDeclaredField(color);

        String stringColorCode = colorCode.toGenericString();

        apply=removeFormatting(apply);

        return stringColorCode+apply;
    }

    /**
     * Removes the formatting from a string
     *
     * @param apply the string to remove the formatting
     *
     * @return formatless code
     */
    public static String removeFormatting(String apply)
    {
        try
        {
            while(apply.contains("&"))
            {
                apply=apply.substring(0,apply.indexOf("&")) + apply.substring(apply.indexOf("&")+2);
            }
            while(apply.contains("§"))
            {
                apply=apply.substring(0,apply.indexOf("§")) + apply.substring(apply.indexOf("§")+2);
            }
        } catch (Exception e) {
        }
        return apply;

    }

    public static String getFormattedString(String in)
    {
        colorStrings.forEach((str1,str2) -> {
            in.replaceAll(str1,str2);
        });
        return in;
    }



}
