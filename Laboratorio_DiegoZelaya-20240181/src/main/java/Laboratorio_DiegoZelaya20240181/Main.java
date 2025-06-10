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
            System.out.println("Bienvenido a tu Agenda");
            System.out.println("1.Agregar Contacto ");
            System.out.println("2. Mostrar Contactos");
            System.out.println("3. Buscar por Nombre el Contacto");
            System.out.println("4.Eliminar Contacto");
            System.out.println("5.Salir");
            int respuesta1 = sc.nextInt();
            switch(respuesta1){
                case 1:
                    //Crear un Contacto
                    System.out.println("Introduzca el id de la nueva Persona que desea Agregar");
                    int IdPersona = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Introduzca el Nombre del nuevo Contacto");
                    String Nombre = sc.next();
                    contactos.put(IdPersona, Nombre);
                    sc.nextLine();
                    System.out.println("Se acaba de Agregar su Contacto");
                    break;
                case 2:
                    //Mostrar los contactos de Forma Ordenada
                    System.out.println("Se Mostrara los Contacto Ordenados");
                    System.out.println("****************************************************");
                    for (Map.Entry<Integer, String> mapa : contactos.entrySet()){
                        System.out.println("Clave: "+ mapa.getKey()+ " Nombre: "+ mapa.getValue());
                    }
                    System.out.println("****************************************************");
                    break;
                case 3:
                    //Buscar por nombre
                    System.out.println("Introduzca el Nombre del Contacto que desea Buscar:");
                    int Contact = sc.nextInt();
                    contactos.get(Contact);



                    break;
                case 4:
                    //Contacto que se desea Eliminar
                    System.out.println("Contacto que desea Eliminar");
                    int ID = sc.nextInt();
                    contactos.remove(ID);
                    sc.nextLine();
                    System.out.println("Esta Bien asi");
                    System.out.println("****************************************************");
                    for (Map.Entry<Integer, String> mapa : contactos.entrySet()){
                        System.out.println("Clave: "+ mapa.getKey()+ " Nombre: "+ mapa.getValue());
                    }
                    System.out.println("****************************************************");
                    break;
                case 5:
                    //Salir de la App contactos
                    respuesta = true;
                    System.out.println("Se acaba de Salir de la Agenda");
                    break;

                default:
                    System.out.println("Desea salir?");
                    String checksalir = sc.next();
                    if (checksalir == "ok" || checksalir == "si"){
                        respuesta = false;
                    }
                    break;
            }

        }
    }
}