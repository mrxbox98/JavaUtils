package me.mrxbox98.json;

import java.util.ArrayList;

public class JsonObject {

    /**
     * The json object's name
     */
    private String propertyName;

    /**
     * The jsons int property
     */
    private int jsonInt;

    /**
     * The jsons string property
     */
    private String jsonString;

    private long jsonLong;

    private double jsonDouble;

    private float jsonFloat;

    private boolean jsonBoolean;

    private ArrayList<JsonObject> jsonJson;

    private boolean hasInt;

    private boolean hasString;

    private boolean hasLong;

    private boolean hasDouble;

    private boolean hasFloat;

    private boolean hasJson;

    private boolean hasBoolean;

    /**
     * Gets the property's name
     *
     * @return the name of the json
     */
    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public int getJsonInt() throws NoPropertyInJsonException {
        if(!isHasInt())
        {
            throw new NoPropertyInJsonException("Does not have an int");
        }
        return jsonInt;
    }

    public void setJsonInt(int jsonInt) {
        this.setHasInt(true);
        this.jsonInt = jsonInt;
    }

    public String getJsonString() throws NoPropertyInJsonException {
        if(!isHasString())
        {
            throw new NoPropertyInJsonException("Does not have a string");
        }
        return jsonString;
    }

    public void setJsonString(String jsonString) {
        this.setHasString(true);
        this.jsonString = jsonString;
    }

    public long getJsonLong() throws NoPropertyInJsonException {
        if(!isHasLong())
        {
            throw new NoPropertyInJsonException("Does not have a long");
        }
        return jsonLong;
    }

    public void setJsonLong(long jsonLong) {
        this.setHasLong(true);
        this.jsonLong = jsonLong;
    }

    public double getJsonDouble() throws NoPropertyInJsonException {
        if(!isHasDouble())
        {
            throw new NoPropertyInJsonException("Does not have a double");
        }
        return jsonDouble;
    }

    public void setJsonDouble(double jsonDouble) {
        this.setHasDouble(true);
        this.jsonDouble = jsonDouble;
    }

    public float getJsonFloat() throws NoPropertyInJsonException {
        if(!isHasFloat())
        {
            throw new NoPropertyInJsonException("Does not have a float");
        }
        return jsonFloat;
    }

    public void setJsonFloat(float jsonFloat) {
        this.setHasFloat(true);
        this.jsonFloat = jsonFloat;
    }

    public boolean isJsonBoolean() throws NoPropertyInJsonException {
        if(!isHasBoolean())
        {
            throw new NoPropertyInJsonException("Does not have a boolean");
        }
        return jsonBoolean;
    }

    public void setJsonBoolean(boolean jsonBoolean) {
        this.setHasBoolean(true);
        this.jsonBoolean = jsonBoolean;
    }

    public ArrayList<JsonObject> getJsonJson() throws NoPropertyInJsonException {
        if(!isHasJson())
        {
            throw new NoPropertyInJsonException("Does not have a json");
        }
        return jsonJson;
    }

    public void setJsonJson(ArrayList<JsonObject> jsonJson) {
        this.setHasJson(true);
        this.jsonJson = jsonJson;
    }

    public boolean isHasInt() {
        return hasInt;
    }

    public void setHasInt(boolean hasInt) {
        this.hasInt = hasInt;
    }

    public boolean isHasString() {
        return hasString;
    }

    public void setHasString(boolean hasString) {
        this.hasString = hasString;
    }

    public boolean isHasLong() {
        return hasLong;
    }

    public void setHasLong(boolean hasLong) {
        this.hasLong = hasLong;
    }

    public boolean isHasDouble() {
        return hasDouble;
    }

    public void setHasDouble(boolean hasDouble) {
        this.hasDouble = hasDouble;
    }

    public boolean isHasFloat() {
        return hasFloat;
    }

    public void setHasFloat(boolean hasFloat) {
        this.hasFloat = hasFloat;
    }

    public boolean isHasJson() {
        return hasJson;
    }

    public void setHasJson(boolean hasJson) {
        this.hasJson = hasJson;
    }

    public boolean isHasBoolean() {
        return hasBoolean;
    }

    public void setHasBoolean(boolean hasBoolean) {
        this.hasBoolean = hasBoolean;
    }
}
