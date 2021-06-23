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

}
