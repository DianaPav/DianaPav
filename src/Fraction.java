public class Fraction {
    int numerator = 0;
    int denominator = 1;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator != 0 ){
            this.denominator = denominator;
        }
        else{
            System.out.println("Denominator is zero");
        }
        reduce();
    }

    public Fraction sum(Fraction fraction){
        int num1 = this.numerator * fraction.denominator;
        int num2 = fraction.numerator * this.denominator;
        int num3 = this.denominator * fraction.denominator;
        Fraction result = new Fraction(num1 + num2, num3);
        return result;
    }

    @Override
    public String toString() {
        if (denominator == 1){
            return numerator + "";
        }
        return numerator + "/" + denominator;
    }

    private void reduce(){
        for (int i = Math.min(numerator, denominator); i >= 2; i--){
            if (numerator % i == 0 && denominator % i == 0){
                numerator /= i;
                denominator /= i;
            }
        }
    }
}
