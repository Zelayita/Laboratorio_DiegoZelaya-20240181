package Laboratorio_DiegoZelaya20240181;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> contactos = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        boolean respuesta = false;

        while(!respuesta){
            System.out.println("*******Bienvenidos a Agenda de Contactos*******");
            System.out.println("1.Agregar Contacto ");
            System.out.println("2. Mostrar Contactos");
            System.out.println("3. Buscar por Nombre el Contacto");
            System.out.println("4.Eliminar Contacto");
            System.out.println("5.Salir");
            int respuesta1 = sc.nextInt();
            switch(respuesta1){
                case 1:
                    System.out.println("Introduzca el id de la nueva Persona que desea Agregar");
                    int IdPersona = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Introduzca el Nombre del nuevo Contacto");
                    String Nombre = sc.next();
                    contactos.put(IdPersona, Nombre);
                    sc.nextLine();
                    System.out.println("Se acaba de Agregar su Contacto");
                    int puesta = sc.nextInt();
                    sc.nextLine();
                    break;
                case 2:
                    System.out.println("Se Mostrara los Contacto Ordenados");
                    for (Map.Entry<Integer, String> mapa : contactos.entrySet()){
                        System.out.println("Clave: "+ mapa.getKey()+ " Nombre: "+ mapa.getValue());
                    }
                    int puesta2 = sc.nextInt();
                    sc.nextLine();
                    break;
                case 3:
                    System.out.println("Introduzca el Nombre del Contacto que desea Buscar:");
                    String ContactName = sc.next();




                    int puesta3 = sc.nextInt();
                    sc.nextLine();
                    break;
                case 4:
                    System.out.println("Contacto que desea Eliminar");
                    int ID = sc.nextInt();
                    contactos.remove(ID);
                    sc.nextLine();
                    System.out.println("Esta Bien asi");
                    for (Map.Entry<Integer, String> mapa : contactos.entrySet()){
                        System.out.println("Clave: "+ mapa.getKey()+ " Nombre: "+ mapa.getValue());
                    }
                    int puesta4 = sc.nextInt();
                    sc.nextLine();
                    break;
                case 5:
                    respuesta = true;
                    System.out.println("Se acaba de Salir de la Agenda");
                    int puesta5 = sc.nextInt();
                    sc.nextLine();
                    break;
                default:
                    System.out.println("Solo numero entre 1 y 4");
                    break;
            }

        }
    }
}