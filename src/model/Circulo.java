package model;

public class Circulo extends FiguraGeometrica {

    private int radio;

    public Circulo(int radio, String color) {
        super(color);
        setRadio(radio);
    }

    public void setRadio(int radio) {
        if (radio >= 0 )
            this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(this.radio, 2);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", color='" + this.getColor() + '\'' +
                '}';
    }
}

