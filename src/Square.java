public class Square {
    int a;
    public Square (int a) {
        this.a = a;
    }
    public double getDiagonal(){
        return a * Math.sqrt(2);
    }
}
class Rectangle extends Square{
    private int b;

    public Rectangle(int a, int b){
        super(a);
        this.b = b;
    }
    @Override
    public double getDiagonal(){
        return Math.sqrt(super.a * super.a + b *b);
    }
}