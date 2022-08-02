import model.Circulo;
import model.Cuadrado;
import model.FiguraGeometrica;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado1 = new Cuadrado(3, "azul");
        Cuadrado cuadrado2 = new Cuadrado(2, "amarillo");
        Cuadrado cuadrado3 = new Cuadrado(5, "verde");
        Cuadrado cuadrado4 = new Cuadrado(7, "rojo");

        ArrayList<Cuadrado> cuadradoArrayList = new ArrayList<>();

        cuadradoArrayList.add(cuadrado1); // indice 0
        cuadradoArrayList.add(cuadrado2); // indice 1
        cuadradoArrayList.add(cuadrado3); // indice 2
        cuadradoArrayList.add(cuadrado4); // indice 3

        // for tradicional con indice
        /*for (int i = 0; i < cuadradoArrayList.size(); i++) {
            Cuadrado cuadradoActual = cuadradoArrayList.get(i);
            System.out.println(cuadradoActual);
        }

        // for each
        for (Cuadrado actual : cuadradoArrayList) {
            // actual -> es una variable local al bucle
            System.out.println(actual);
        }*/

        System.out.println("---------------------------------");
        // Circulos

        Circulo circulo1 = new Circulo(3, "azul");
        Circulo circulo2 = new Circulo(2, "amarillo");
        Circulo circulo3 = new Circulo(5, "verde");
        Circulo circulo4 = new Circulo(7, "rojo");


        ArrayList<Circulo> circuloArrayList = new ArrayList<>();

        circuloArrayList.add(circulo1); // indice 0
        circuloArrayList.add(circulo2); // indice 1
        circuloArrayList.add(circulo3); // indice 2
        circuloArrayList.add(circulo4); // indice 3

        // for tradicional con indice
        /*for (int i = 0; i < circuloArrayList.size(); i++) {
            Circulo circuloActual = circuloArrayList.get(i);
            System.out.println(circuloActual);
        }

        // for each
        for (Circulo actual : circuloArrayList) {
            // actual -> es una variable local al bucle
            System.out.println(actual);
        }*/

        System.out.println("---------------------------------");
        ArrayList<FiguraGeometrica> figuraGeometricas = new ArrayList<>();
        figuraGeometricas.add(cuadrado1); // indice 0
        figuraGeometricas.add(cuadrado2); // indice 1
        figuraGeometricas.add(cuadrado3); // indice 2
        figuraGeometricas.add(cuadrado4); // indice 3
        figuraGeometricas.add(circulo1); // indice 4
        figuraGeometricas.add(circulo2); // indice 5
        figuraGeometricas.add(circulo3); // indice 6
        figuraGeometricas.add(circulo4); // indice 7


        for (int i = 0; i < figuraGeometricas.size(); i++) {
            FiguraGeometrica actual = figuraGeometricas.get(i);
            System.out.println(actual);
            System.out.println("El area es = " + actual.area());
        }


        figuraGeometricas.sort(Comparator.comparing(FiguraGeometrica::area));

        System.out.println("--------------------");

        for (int i = 0; i < figuraGeometricas.size(); i++) {
            FiguraGeometrica actual = figuraGeometricas.get(i);
           // System.out.println(actual);
            System.out.println("El area es = " + actual.area());
        }

        // for each
        /*for (FiguraGeometrica actual : figuraGeometricas) {
            // actual -> es una variable local al bucle
            System.out.println(actual);
            System.out.println("El area es = " + actual.area());
        }*/
    }
}
