public class Fraction{
    private int numerator;
    private int denominator = 1;

    public Fraction(int numerator, int denominator){
        if(denominator == 0){
            System.out.println("Denominator can't be zero. Choose another one.");
            return;
        }
        this.numerator = numerator * (denominator < 0 ? -1 : 1);
        this.denominator = Math.abs(denominator);
        normalization();
    }

    //1. конструктор, который принимает дробь в качестве аргумента
    public Fraction (Fraction fraction) {
        if(fraction.denominator == 0){
            System.out.println("Denominator can't be zero. Choose another one.");
            return;
        }
        this.numerator = fraction.numerator * (fraction.denominator < 0 ? -1 : 1);
        this.denominator = Math.abs(fraction.denominator);
        normalization();
    }

    //2. конструктор, который принимает число с плавающей точкой в качестве аргумента
    public Fraction (double number) {
        String s = Double.toString(number);
        int m = s.length() - 2;
        double r = Math.pow(10.0, (double) m);
        this.numerator = (int) (number * r);
        this.denominator = (int) r;
    }

    //3. метод sum()
    public void sum (Fraction fraction) {
        this.numerator *= fraction.denominator;
        fraction.numerator *= this.denominator;
        this.denominator *= fraction.denominator;
        this.numerator += fraction.numerator;
        normalization();
    }

    //4. метод mult()
    public void mult (Fraction fraction) {
        this.numerator *= fraction.numerator;
        this.denominator *= fraction.denominator;
        normalization();
    }

    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    public void setNumerator(int numerator){
        this.numerator = numerator;
    }

    public void setDenominator(int denominator){
        if (denominator == 0) {
            System.out.println("Denominator can't be zero. Choose another one.");
            return;
        }
        if (denominator < 0){
            this.numerator *= -1;
        }
    }

    private int gcd(int numerator, int denominator){
        while (numerator != 0 && denominator != 0) {
            if (numerator > denominator) {
                numerator %= denominator;
            } else {
                denominator %= numerator;
            }
        }
        return numerator + denominator;
    }

    private void normalization(){
        int n = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= n;
        denominator /= n;
    }

    public boolean properFraction(){ //проверка правильности дроби
        return (Math.abs(numerator) < denominator ? true : false);
    }

    public int getIntegerPart(){ // выделение целой части
        return (numerator / denominator);
    }

    public Fraction fractionalPart(){ // выделение дробной части
        return new Fraction(numerator % denominator, denominator);
    }

    public double toDecimalFractions(){ // результат деления в виде десятичной дроби
        return (double) numerator / denominator;
    }

    public String toString(){ // вывод дроби на печать
        return new String(numerator + " / " + denominator);
    }

    public Fraction sumFractionTo(Fraction obj){
        return new Fraction(this.numerator * obj.denominator + obj.numerator * this.denominator, this.denominator * obj.denominator);
    }

    public Fraction sumFraction(Fraction obj1, Fraction obj2){
        return new Fraction(obj1.numerator * obj2.denominator + obj2.numerator * obj1.denominator, obj1.denominator * obj2.denominator);
    }
}