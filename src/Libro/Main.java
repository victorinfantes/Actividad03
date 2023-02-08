package Libro;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Libro> libros = new ArrayList<>();
        int id, menu = 0;
        String titulo, editorial, autor;
        while (menu != 4) {
            switch (menu) {
                case 1: {
                    System.out.println("Opcion1");
                    System.out.println("Introduce id: ");
                    id = sc.nextInt();
                    System.out.println("Introduce titulo: ");
                    titulo = sc.next();
                    System.out.println("Introduce autor: ");
                    autor = sc.next();
                    System.out.println("Introduce editorial: ");
                    editorial = sc.next();
                    libros.add(new Libro(id, titulo, autor, editorial));
                    System.out.println("Libro Introducido");
                    for (Libro l : libros) {
                        System.out.println(l.toString());
                    }
                    break;
                }
                case 2: {
                    System.out.println("Opcion2");
                    for (Libro l : libros) {
                        System.out.println(l.toString());
                    }
                    break;
                }
                case 3: {
                    System.out.println("Opcion3");
                    System.out.println("Introduce la opcion del menu");
                    menu = sc.nextInt();
                    switch (menu) {
                        case 1: {
                            System.out.println("Introduce el id del libro:");
                            id = sc.nextInt();
                            for (int i = 0; i < libros.size(); i++) {
                                if (id == libros.get(i).getId()) {
                                    System.out.println(libros.get(i).toString());
                                } else {
                                    System.out.println("El id no existe");
                                }
                                break;
                            }
                        }
                        case 2: {
                            System.out.println("Introduce el id del libro:");
                            autor = sc.next();
                            for (int i = 0; i < libros.size(); i++) {
                                if (autor.equals(libros.get(i).getAutor())) {
                                    System.out.println(libros.get(i).toString());
                                } else {
                                    System.out.println("El id no existe");
                                }
                                break;
                            }
                        }
                    }

                }
                System.out.println("Introduce la opcion");
                menu = sc.nextInt();
            }
        }
    }
}
