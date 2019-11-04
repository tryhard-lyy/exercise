package baogao3.first;

public class Point {
    private float x;
    private float y;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float juli(Point point){
        return (float) Math.sqrt(Math.abs((x - point.getX())* (x - point.getX())
                +(y - point.getY())* (y - point.getY())));
    }
    
}
