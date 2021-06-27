package me.mrxbox98.vec;

public class Vec3i extends Vec2i{

    private int z;

    /**
     * Creates a 3 integer vector
     *
     * @param x X integer
     *
     * @param y Y integer
     *
     * @param z Z integer
     */
    public Vec3i(int x, int y, int z) {
        super(x, y);
        this.z=z;
    }

    /**
     * Gets the Z value of the vec
     *
     * @return the Z value
     */
    public int getZ() {
        return z;
    }

    /**
     * Sets the Z value of the vec
     * @param z The new Z value
     */
    public void setZ(int z) {
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
     * Converts this to a Vec3d
     *
     * @return a Vec3d of this
     */
    public Vec3d getVec3d()
    {
        return new Vec3d((double)getX(),(double)getY(),(double)getZ());
    }

}
