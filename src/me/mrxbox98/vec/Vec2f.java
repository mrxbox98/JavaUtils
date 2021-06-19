package me.mrxbox98.vec;

public class Vec2f {

    private float x;

    private float y;

    public Vec2f(float x, float y)
    {
        this.x=x;
        this.y=y;
    }

    /**
     * Gets the X value
     *
     * @return The X value
     */
    public float getX() {
        return x;
    }

    /**
     * Sets the X value of the vec
     *
     * @param x the new X value
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * Gets the Y value
     *
     * @return The Y value
     */
    public float getY() {
        return y;
    }

    /**
     * Sets the Y value of the vec
     *
     * @param y the new Y value
     */
    public void setY(float y) {
        this.y = y;
    }

}
