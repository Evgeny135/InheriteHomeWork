public abstract class Figure {
    private double a;
    private double b;
    //Класс был родительским для других но пользователит не могли им
    // польщоваться то это класс абстрактный

    public Figure(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public abstract double area();

    public final  double getA() {
        return a;
    }

    public final double getB() {
        return b;
        //finall - константа, метод не переопределен
    }
}
