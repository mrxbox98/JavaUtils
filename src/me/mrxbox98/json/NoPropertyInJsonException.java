package me.mrxbox98.json;

public class NoPropertyInJsonException extends Exception{
    public NoPropertyInJsonException(String error)
    {
        super(error);
    }
}
