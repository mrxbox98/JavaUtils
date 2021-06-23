package me.mrxbox98.vec;

public class Vec2i {

    private int x;

    private int y;

    /**
     * Creates a 2 integer vector
     *
     * @param x X integer
     *
     * @param y Y integer
     */
    public Vec2i(int x, int y)
    {
        this.x=x;
        this.y=y;
    }

    /**
     * Gets the X value
     *
     * @return The X value
     */
    public int getX() {
        return x;
    }

    /**
     * Gets the Y value
     *
     * @return The Y value
     */
    public int getY() {
        return y;
    }

    /**
     * Sets the X value of the vec
     *
     * @param x the new X value
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Sets the Y value of the vec
     *
     * @param y the new Y value
     */
    public void setY(int y) {
        this.y = y;
    }
}
