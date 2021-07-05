package clase2.tt.ejercicio2;

public class Rectangulo extends FiguraGeometrica{

    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }

    @Override
    public double area() {
        return base*altura;
    }
}
