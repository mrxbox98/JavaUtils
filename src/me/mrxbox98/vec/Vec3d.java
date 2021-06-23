package me.mrxbox98.vec;

public class Vec3d extends Vec2d{

    private double z;

    /**
     * Creates a 3 double vector
     *
     * @param x X double
     *
     * @param y Y double
     *
     * @param z Z double
     */
    public Vec3d(double x, double y, double z) {
        super(x, y);
        this.z=z;
    }

    /**
     * Gets the Z value of the vec
     *
     * @return the Z value
     */
    public double getZ() {
        return z;
    }

    /**
     * Sets the Z value of the vec
     * @param z The new Z value
     */
    public void setZ(double z) {
        this.z = z;
    }
}
