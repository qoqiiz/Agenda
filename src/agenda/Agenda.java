package agenda;

import java.util.Scanner;

public class Agenda {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        Boolean bandera = true;
        int menu=0 ;
        int contador = 1;
        String[] nombre = new String[100];
        String[] numero = new String[100];

        while (bandera == true) {
            System.out.println("    **AGENDA**\nSeleciona un numero");
            System.out.println("1.-nuevo");
            System.out.println("2.-buscar");
            System.out.println("3.-eliminar");
            System.out.println("4.-mostrar");
            System.out.println("5.-salir");
            menu = t.nextInt();


            switch (menu) {
                case 1:
                    System.out.println("Ingresa el nombre");
                    nombre[contador] = t.next().toUpperCase();
                    System.out.println("Ingresa el numero");
                    numero[contador] = t.next();
                    contador++;
                    break;

                case 2:

                    System.out.println("Ingresa su nombre");


                    String buscar = t.next().toUpperCase();
                    for (int i = 1; i < nombre.length; i++) {
                        if (buscar.equals(nombre[i])) {
                            System.out.println(nombre[i] + " | " + numero[i]+"\n");
                        }

                    }
                    break;

                case 3:

                    System.out.println("Ingresa el nombre a eliminar");
                    String eliminar = t.next().toUpperCase();
                    for (int i = 1; i < nombre.length; i++) {
                        if (eliminar.equals(nombre[i])) {
                            nombre[i] = " ";
                            numero[i] = " ";
                        }
                    }
                    System.out.println("Eliminado");
                    break;

                case 4:

                    for (int i = 1; i < contador; i++) {

                        System.out.println(nombre[i] + " | " + numero[i] + "\n");
                    }
                    break;

                case 5:

                    bandera = false;
                    break;
            }
        }
    }
}
