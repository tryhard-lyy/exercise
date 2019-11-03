package baogao3.first;

public class Sphere extends Circle {
    public Sphere(double radius) {
        super(radius);
    }

    public double getSurfaceArea(){
        return 4 * Math.PI * getRadius()* getRadius();
    }

    public double getVolume(){
        return 4/3 * Math.PI * getRadius() * getRadius() *getRadius();
    }

}
