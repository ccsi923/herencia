package model;

//Extends: palabra reservada a nivel de clase que me permite crear jerarquias entre clases
public class Cuadrado extends FiguraGeometrica {

    //Atributos (privados: favorecen la encapsulacion)
    //Privado: solo se puede modificar internamente desde la clase
    private int lado;

    //Constructor: permite instanciar un objeto
    //Cuando una clase hereda de otra, hereda sus atributos
    public Cuadrado(int lado, String color) {
        super(color); // siempre el primero
        setLado(lado);
    }

    //Metodos (Getter, setters, etc)
    public void setLado(int lado) {
        if (lado >= 0)
            this.lado = lado;
    }

    @Override //herramienta que sirve de comunicacion entre el programador y el ide
    public double area() {
        return Math.pow(this.lado, 2);
    }

    public int getLado() {
        return this.lado;
    }


    //Este metodo va a escribir el contenido de mi clase de una manera humanamente legible
    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + lado +
                ", color='" + this.getColor() + '\'' +
                '}';
    }
}
