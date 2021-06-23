package me.mrxbox98.vec;

public class Vec2d {

    private double x;

    private double y;

    /**
     * Creates a 2 double vector
     *
     * @param x X double
     *
     * @param y Y double
     */
    public Vec2d(double x, double y)
    {
        this.x=x;
        this.y=y;
    }

    /**
     * Gets the X value
     *
     * @return The X value
     */
    public double getX() {
        return x;
    }

    /**
     * Sets the X value of the vec
     *
     * @param x the new X value
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Gets the Y value
     *
     * @return The Y value
     */
    public double getY() {
        return y;
    }

    /**
     * Sets the Y value of the vec
     *
     * @param y the new Y value
     */
    public void setY(double y) {
        this.y = y;
    }
}
