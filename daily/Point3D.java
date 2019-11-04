package baogao3.first;

public class Point3D extends Point{
    private float z;

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float juli(Point3D point3D){
        return (super.getX()-point3D.getX())*(super.getX()-point3D.getX())
                +(super.getY()-point3D.getY())*(super.getY()-point3D.getY())+(z-point3D.getZ())*(z-point3D.getZ());
   }

}
