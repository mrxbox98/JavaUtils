package me.mrxbox98.vec;

public class Vec2l {

    private long x;

    private long y;

    /**
     * Creates a 2 long vector
     *
     * @param x X long
     *
     * @param y Y long
     */
    public Vec2l(long x, long y)
    {
        this.x=x;
        this.y=y;
    }

    /**
     * Gets the X value
     *
     * @return The X value
     */
    public long getX() {
        return x;
    }

    /**
     * Sets the X value of the vec
     *
     * @param x the new X value
     */
    public void setX(long x) {
        this.x = x;
    }

    /**
     * Gets the Y value
     *
     * @return The Y value
     */
    public long getY() {
        return y;
    }

    /**
     * Sets the Y value of the vec
     *
     * @param y the new Y value
     */
    public void setY(long y) {
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
     * Converts the current vector into a float vector
     *
     * @return A float vector
     */
    public Vec2f getVec2f()
    {
        return new Vec2f((float)x,(float)y);
    }

    /**
     * Converts the current vector into a double vector
     *
     * @return A double vector
     */
    public Vec2d getVec2d()
    {
        return new Vec2d((double)x,(double)y);
    }
}
