package me.mrxbox98.vec;

public class Vec3f extends Vec2f{

    private float z;

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

}