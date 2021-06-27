package me.mrxbox98.vec;

public class Vec3f extends Vec2f{

    private float z;

    /**
     * Creates a 3 float vector
     *
     * @param x X float
     *
     * @param y Y float
     *
     * @param z Z float
     */
    public Vec3f(float x, float y, float z) {
        super(x, y);
        this.z=z;
    }

    /**
     * Gets the Z value of the vec
     *
     * @return the Z value
     */
    public float getZ() {
        return z;
    }

    /**
     * Sets the Z value of the vec
     * @param z The new Z value
     */
    public void setZ(float z) {
        this.z = z;
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

    /**
     * Converts this to a Vec3d
     *
     * @return a Vec3d of this
     */
    public Vec3d getVec3d()
    {
        return new Vec3d((double)getX(),(double)getY(),(double)getZ());
    }
}
