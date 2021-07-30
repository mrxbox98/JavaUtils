package me.mrxbox98.logger;

public interface Console {

    /**
     * Back ANSI escape code
     */
    String Black = "\u001b[30m";

    /**
     * Red ANSI escape code
     */
    String Red = "\u001b[31m";

    /**
     * Green ANSI escape code
     */
    String Green = "\u001b[32m";

    /**
     * Yellow ANSI escape code
     */
    String Yellow = "\u001b[33m";

    /**
     * Blue ANSI escape code
     */
    String Blue = "\u001b[34m";

    /**
     * Magenta ANSI escape code
     */
    String Magenta = "\u001b[35m";

    /**
     * Cyan ANSI escape code
     */
    String Cyan = "\u001b[36m";

    /**
     * White ANSI escape code
     */
    String White = "\u001b[37m";

    /**
     * Reset ANSI
     */
    String Reset = "\u001b[0m";

    /**
     * Bright Black ANSI escape code
     */
    String Bright_Black = "\u001b[30;1m";

    /**
     * Bright Red ANSI escape code
     */
    String Bright_Red = "\u001b[31;1m";

    /**
     * Bright Green ANSI escape code
     */
    String Bright_Green = "\u001b[32;1m";

    /**
     * Bright Yellow ANSI escape code
     */
    String Bright_Yellow = "\u001b[33;1m";

    /**
     * Bright Blue ANSI escape code
     */
    String Bright_Blue = "\u001b[34;1m";

    /**
     * Bright Magenta ANSI escape code
     */
    String Bright_Magenta = "\u001b[35;1m";

    /**
     * Bright Cyan ANSI escape code
     */
    String Bright_Cyan = "\u001b[36;1m";

    /**
     * Bright White ANSI escape code
     */
    String Bright_White = "\u001b[37;1m";




    /**
     * Logs a string as an info
     *
     * @param str string to log
     */
    public static void log(String str)
    {
        System.out.println("[INFO]:"+str);
    }

    /**
     * Logs a string as an info
     *
     * @param str string to log
     */
    public static void info(String str)
    {
        System.out.println("\u001b[37m[INFO]:"+str);
    }

    /**
     * logs a string as a warning
     *
     * @param str string to log
     */
    public static void warn(String str)
    {
        System.out.println("\u001b[33m[WARN]:"+str);
    }

    /**
     * Logs an error's stack trace
     *
     * @param e error to log
     */
    public static void error(Error e)
    {
        for(StackTraceElement trace: e.getStackTrace())
        {
            System.out.println("\u001b[31m[ERROR]:"+trace.toString());
        }
    }

}
