package clase2.tt.ejercicio2;

public class Triangulo extends FiguraGeometrica {

    private int altura;
    private int base;


    public Triangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "altura=" + altura +
                ", base=" + base +
                '}';
    }

    @Override
    public double area() {
        return base*altura/2;
    }
}
