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

    /**
     * Converts this to a Vec3f
     *
     * @return a Vec3f of this
     */
    public Vec3f getVec3f()
    {
        return new Vec3f((float)getX(),(float)getY(),(float)getZ());
    }

    /**
     * Converts this to a Vec3l
     *
     * @return a Vec3l of this
     */
    public Vec3l getVec3l()
    {
        return new Vec3l((long)getX(),(long)getZ(),(long)getY());
    }

    /**
     * Converts this to a Vec3i
     *
     * @return a Vec3i of this
     */
    public Vec3i getVec3i()
    {
        return new Vec3i((int)getX(),(int)getY(),(int)getZ());
    }
}
