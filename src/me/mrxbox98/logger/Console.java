package me.mrxbox98.logger;

public class Console {

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
        System.out.println("[INFO]:"+str);
    }

    /**
     * logs a string as a warning
     *
     * @param str string to log
     */
    public static void warn(String str)
    {
        System.out.println("[WARN]:"+str);
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
            System.out.println("[ERROR]:"+trace.toString());
        }
    }

}
