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

    /**
     * Sets the jsons property name
     *
     * @param propertyName The property name to use
     */
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    /**
     * Gets the int property from the json
     *
     * @return the int property of the json
     *
     * @throws NoPropertyInJsonException if there is no int property
     */
    public int getJsonInt() throws NoPropertyInJsonException {
        if(!isHasInt())
        {
            throw new NoPropertyInJsonException("Does not have an int");
        }
        return jsonInt;
    }

    /**
     * Sets the int property of a json
     *
     * @param jsonInt the int to set the property to
     */
    public void setJsonInt(int jsonInt) {
        this.setHasInt(true);
        this.jsonInt = jsonInt;
    }

    /**
     * Gets the int property from the json
     *
     * @return the int property of the json
     *
     * @throws NoPropertyInJsonException if there is no int property
     */
    public String getJsonString() throws NoPropertyInJsonException {
        if(!isHasString())
        {
            throw new NoPropertyInJsonException("Does not have a string");
        }
        return jsonString;
    }

    /**
     * Sets the string property of a json
     *
     * @param jsonString the string to set the property to
     */
    public void setJsonString(String jsonString) {
        this.setHasString(true);
        this.jsonString = jsonString;
    }

    /**
     * Gets the long property from the json
     *
     * @return the long property of the json
     *
     * @throws NoPropertyInJsonException if there is no long property
     */
    public long getJsonLong() throws NoPropertyInJsonException {
        if(!isHasLong())
        {
            throw new NoPropertyInJsonException("Does not have a long");
        }
        return jsonLong;
    }

    /**
     * Sets the long property of a json
     *
     * @param jsonLong the long to set the property to
     */
    public void setJsonLong(long jsonLong) {
        this.setHasLong(true);
        this.jsonLong = jsonLong;
    }

    /**
     * Gets the double property from the json
     *
     * @return the double property of the json
     *
     * @throws NoPropertyInJsonException if there is no double property
     */
    public double getJsonDouble() throws NoPropertyInJsonException {
        if(!isHasDouble())
        {
            throw new NoPropertyInJsonException("Does not have a double");
        }
        return jsonDouble;
    }

    /**
     * Sets the double property of a json
     *
     * @param jsonDouble the double to set the property to
     */
    public void setJsonDouble(double jsonDouble) {
        this.setHasDouble(true);
        this.jsonDouble = jsonDouble;
    }

    /**
     * Gets the float property from the json
     *
     * @return the float property of the json
     *
     * @throws NoPropertyInJsonException if there is no float property
     */
    public float getJsonFloat() throws NoPropertyInJsonException {
        if(!isHasFloat())
        {
            throw new NoPropertyInJsonException("Does not have a float");
        }
        return jsonFloat;
    }

    /**
     * Sets the float property of a json
     *
     * @param jsonFloat the float to set the property to
     */
    public void setJsonFloat(float jsonFloat) {
        this.setHasFloat(true);
        this.jsonFloat = jsonFloat;
    }

    /**
     * Gets the boolean property from the json
     *
     * @return the boolean property of the json
     *
     * @throws NoPropertyInJsonException if there is no boolean property
     */
    public boolean isJsonBoolean() throws NoPropertyInJsonException {
        if(!isHasBoolean())
        {
            throw new NoPropertyInJsonException("Does not have a boolean");
        }
        return jsonBoolean;
    }

    /**
     * Sets the boolean property of a json
     *
     * @param jsonBoolean the boolean to set the property to
     */
    public void setJsonBoolean(boolean jsonBoolean) {
        this.setHasBoolean(true);
        this.jsonBoolean = jsonBoolean;
    }

    /**
     * Gets the json property from the json
     *
     * @return the json property of the json
     *
     * @throws NoPropertyInJsonException if there is no json property
     */
    public ArrayList<JsonObject> getJsonJson() throws NoPropertyInJsonException {
        if(!isHasJson())
        {
            throw new NoPropertyInJsonException("Does not have a json");
        }
        return jsonJson;
    }

    /**
     * Sets the json property of a json
     *
     * @param jsonJson the json to set the property to
     */
    public void setJsonJson(ArrayList<JsonObject> jsonJson) {
        this.setHasJson(true);
        this.jsonJson = jsonJson;
    }

    /**
     * Checks whether the json has an int
     *
     * @return true if the json has an int; false otherwise
     */
    public boolean isHasInt() {
        return hasInt;
    }

    /**
     * Sets whether the json has an int propery
     *
     * @param hasInt whether the json has an int
     */
    public void setHasInt(boolean hasInt) {
        this.hasInt = hasInt;
    }

    /**
     * Checks whether the json has an String
     *
     * @return true if the json has an String; false otherwise
     */
    public boolean isHasString() {
        return hasString;
    }

    /**
     * Sets whether the json has an String propery
     *
     * @param hasString whether the json has an String
     */
    public void setHasString(boolean hasString) {
        this.hasString = hasString;
    }

    /**
     * Checks whether the json has an long
     *
     * @return true if the json has an long; false otherwise
     */
    public boolean isHasLong() {
        return hasLong;
    }

    /**
     * Sets whether the json has an long propery
     *
     * @param hasLong whether the json has an long
     */
    public void setHasLong(boolean hasLong) {
        this.hasLong = hasLong;
    }

    /**
     * Checks whether the json has an double
     *
     * @return true if the json has an double; false otherwise
     */
    public boolean isHasDouble() {
        return hasDouble;
    }

    /**
     * Sets whether the json has an double propery
     *
     * @param hasDouble whether the json has an double
     */
    public void setHasDouble(boolean hasDouble) {
        this.hasDouble = hasDouble;
    }

    /**
     * Checks whether the json has an float
     *
     * @return true if the json has an float; false otherwise
     */
    public boolean isHasFloat() {
        return hasFloat;
    }

    /**
     * Sets whether the json has an float propery
     *
     * @param hasFloat whether the json has an float
     */
    public void setHasFloat(boolean hasFloat) {
        this.hasFloat = hasFloat;
    }

    /**
     * Checks whether the json has an json
     *
     * @return true if the json has an json; false otherwise
     */
    public boolean isHasJson() {
        return hasJson;
    }

    /**
     * Sets whether the json has an json propery
     *
     * @param hasJson whether the json has an json
     */
    public void setHasJson(boolean hasJson) {
        this.hasJson = hasJson;
    }

    /**
     * Checks whether the json has an boolean
     *
     * @return true if the json has an boolean; false otherwise
     */
    public boolean isHasBoolean() {
        return hasBoolean;
    }

    /**
     * Sets whether the json has an boolean propery
     *
     * @param hasBoolean whether the json has an boolean
     */
    public void setHasBoolean(boolean hasBoolean) {
        this.hasBoolean = hasBoolean;
    }
}
