package me.mrxbox98.vec;

public class Vec2f {

    private float x;

    private float y;

    /**
     * Creates a 2 float vector
     *
     * @param x X float
     *
     * @param y Y float
     */
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

    /**
     * Converts the current vector into a integer vector
     *
     * @return A integer vector
     */
    public Vec2i getVec2i()
    {
        return new Vec2i((int)x,(int)y);
    }

    /**
     * Converts the current vector into a double vector
     *
     * @return A double vector
     */
    public Vec2d getVec2d()
    {
        return new Vec2d(x,y);
    }

    /**
     * Converts the current vector into a long vector
     *
     * @return A long vector
     */
    public Vec2l getVec2l()
    {
        return new Vec2l((long)x,(long)y);
    }

}
