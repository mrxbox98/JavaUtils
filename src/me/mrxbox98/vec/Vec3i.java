package me.mrxbox98.vec;

public class Vec3i extends Vec2i{

    private int z;

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

}
