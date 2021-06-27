package me.mrxbox98.vec;

public class Vec3l extends Vec2l{

    private long z;

    /**
     * Creates a 3 long vector
     *
     * @param x X long
     *
     * @param y Y long
     *
     * @param z Z long
     */
    public Vec3l(long x, long y, long z) {
        super(x, y);
        this.z=z;
    }

    /**
     * Gets the Z value of the vec
     *
     * @return the Z value
     */
    public long getZ() {
        return z;
    }

    /**
     * Sets the Z value of the vec
     * @param z The new Z value
     */
    public void setZ(long z) {
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
