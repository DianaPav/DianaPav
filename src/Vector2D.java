import java.util.Locale;

public class Vector2D {
    public double vX, vY;

    static int count= 0;

    public Vector2D() {
        vX = 1;
        vY = 1;
        count ++;
    }

    public Vector2D(double vX, double vY) {
        this.vX = vX;
        this.vY = vY;
        count++;
    }

    public Vector2D(Vector2D v){
        this.vX = v.vX;
        this.vY = v.vY;
        count++;
    }

    void print(){
        System.out.println(
            String.format(
                    Locale.US,
                    "(%.2f, %.2f)",
                    vX,
                    vY
            )
        );
    }

    double length(){
        return Math.sqrt(vX * vX + vY * vY);
    }

    void add(Vector2D v){
        vX += v.vX;
        vY += v.vY;
    }

    void sub(Vector2D v) {
        vX -= v.vX;
        vY -= v.vY;
    }

    void scale(double scaleFactor){
        vX *= scaleFactor;
        vY *= scaleFactor;
    }

    void normalized() {
        double l = length();
        vX /= l;
        vY /= l;
    }

    double dotProduct(Vector2D v){
        return vX * v.vX + vY * v.vY;
    }
}
