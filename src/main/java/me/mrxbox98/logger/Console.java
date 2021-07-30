package me.mrxbox98.logger;

public interface Console {

    String Black = "\u001b[30m";

    String Red = "\u001b[31m";

    String Green = "\u001b[32m";

    String Yellow = "\u001b[33m";

    String Blue = "\u001b[34m";

    String Magenta = "\u001b[35m";

    String Cyan = "\u001b[36m";

    String White = "\u001b[37m";

    String Reset = "\u001b[0m";

    String Bright_Black = "\u001b[30;1m";

    String Bright_Red = "\u001b[31;1m";

    String Bright_Green = "\u001b[32;1m";

    String Bright_Yellow = "\u001b[33;1m";

    String Bright_Blue = "\u001b[34;1m";

    String Bright_Magenta = "\u001b[35;1m";

    String Bright_Cyan = "\u001b[36;1m";

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
