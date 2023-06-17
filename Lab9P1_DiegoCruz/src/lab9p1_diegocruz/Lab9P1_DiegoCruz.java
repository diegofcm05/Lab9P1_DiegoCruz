/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9p1_diegocruz;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author dfcm9
 */
public class Lab9P1_DiegoCruz {
    
    static Scanner sc_int = new Scanner (System.in);
    static Scanner sc = new Scanner (System.in);
    static Random ran = new Random();
    static ArrayList<Libros> Almanaquelib = new ArrayList<>();//Declaracion de ArrayList de Libros a nivel de clase
    static int atributobusc;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean resp = true;
        
        while (resp){
            System.out.println("""
                               Bienvenido!
                               Menu Lab 9:
                               1. Libros y mas Libros! Remastered
                               2. Salir
                               Ingrese una opcion: 
                               """);
            int opcion = sc_int.nextInt();
            switch (opcion){
                case 1:
                {
                    boolean submenu = true;
                    while (submenu){
                        System.out.println("""
                                       SubMenu de Libros:
                                       Elija una opcion:
                                       1. Agregar texto
                                       2. Listar Libros
                                       3. Modificar Libro
                                       4. Eliminar Libro
                                       5. Buscar Libro por Titulo
                                       6. Buscar Libros segun autor
                                       7. Busqueda con filtro de genero
                                       8. Salir
                                       """);
                        int subopcion = sc_int.nextInt();
                        switch (subopcion){
                            case 1:
                            {
                                Agregarlib(Almanaquelib);
                                break;
                            }
                            case 2:
                            {
                                if (Almanaquelib.isEmpty()){
                                    System.out.println("No hay libros para listar actualmente. Vaya a la opcion 1 para ingresar libros.\n");
                                }
                                else{
                                    System.out.println("Libros Disponibles:");
                                    Printlibros(Almanaquelib);
                                }
                                break;
                            }
                            case 3:
                            {
                                if (Almanaquelib.isEmpty()){
                                    System.out.println("No hay libros ingresados dentro de la biblioteca para modificar. Vaya a la opcion 1 primero para ingresar libros.\n");
                                }
                                else{
                                    Modificarlib(Almanaquelib);
                                }
                                break;
                            }
                            case 4:
                            {
                                if (Almanaquelib.isEmpty()){
                                    System.out.println("No hay libros ingresados dentro de la biblioteca. Vaya a la opcion 1 primero para ingresar libros.\n");
                                }
                                else{
                                    Eliminarlibro(Almanaquelib);
                                }
                                break;
                            }
                            case 5:
                            {
                                if (Almanaquelib.isEmpty()){
                                    System.out.println("No hay libros ingresados dentro de la biblioteca para buscar. Vaya a la opcion 1 primero para ingresar libros.\n");
                                }
                                else{
                                    atributobusc = 5;
                                    BuscarLib(Almanaquelib, atributobusc);
                                }
                                break;
                            }
                            case 6:
                            {
                                if (Almanaquelib.isEmpty()){
                                    System.out.println("No hay libros ingresados dentro de la biblioteca para buscar. Vaya a la opcion 1 primero para ingresar libros.\n");
                                }
                                else{
                                    atributobusc = 6;
                                    BuscarLib(Almanaquelib, atributobusc);
                                    
                                }
                                break;
                            }
                            case 7:
                            {
                                if (Almanaquelib.isEmpty()){
                                    System.out.println("No hay libros ingresados dentro de la biblioteca para buscar. Vaya a la opcion 1 primero para ingresar libros.\n");
                                }
                                else{
                                    atributobusc = 7;
                                    BuscarLib(Almanaquelib, atributobusc);
                                    
                                }
                                break;
                            }
                            case 8:
                            {
                                submenu = false;
                                break;
                            }
                            default:
                            {
                                System.out.println("Opcion Invalida. Por favor ingrese una opcion valida.\n");
                            }
                            
                        }
                        
                    }
                    break;
                }
                case 2:
                {
                    resp = false;
                    break;
                }
                default:
                {
                    System.out.println("Opcion Invalida. Intente de nuevo.\n");
                    break;
                }
            }
            }
        // TODO code application logic here
    }
    
    // Aqui se encuentran los metodos para Agregar, Imprimir, Modificar, Eliminar y Buscar Libros.
    public static void Agregarlib(ArrayList<Libros> Librero){
        String titulo, autor, genero;
        int edadmi;
        
        System.out.println("Ha elegido la opcion de agregar un libro. Por favor aporte la informacion solicitada.");
        System.out.println("Ingrese titulo: ");
        titulo = sc.nextLine();
        System.out.println("Ingrese autor:");
        autor = sc.nextLine();
        System.out.println("Ingrese genero");
        genero = sc.nextLine();
        System.out.println("Ingrese la edad minima para leer:");
        edadmi = sc_int.nextInt();
        while (edadmi <0){
            System.out.println("Ingrese una edad valida, que no sea menor a 0.");
            edadmi = sc_int.nextInt();
        }
        
        Libros libunico = new Libros (titulo,autor,genero,edadmi);
        Librero.add(libunico);
        System.out.println("Libro agregado exitosamente!\n");
    }
    
    public static void Printlibros(ArrayList<Libros> Librero){
        for (int i = 0; i < Librero.size(); i++) {
            System.out.println("");
            System.out.println("Libro "+(i+1));
            System.out.println("Titulo: "+Librero.get(i).getTitulo());
            System.out.println("Autor: "+Librero.get(i).getAutor());
            System.out.println("Genero: "+Librero.get(i).getGenero());
            System.out.println("Edad Minima: "+Librero.get(i).getEdmi());
            System.out.println("");
            System.out.println("----------------");
            System.out.println("");
        }
        
    }
    
    public static void Modificarlib(ArrayList<Libros> Librero){
        System.out.println("Ha ingresado la opcion de modificar libros. Elija el libro que modificara ingresando su numero de libro.");
        Printlibros(Librero);
        int libselect = sc_int.nextInt();
        while (libselect > Librero.size() || libselect <0){
            System.out.println("Ese libro no existe. Ingrese el numero de un libro que si esta disponible.");
            libselect = sc_int.nextInt();
        }
        System.out.println("Ha seleccionado el libro "+Librero.get(libselect-1).getTitulo()+", que atributo desea modificar?");
        System.out.println("""
                           1. Titulo
                           2. Autor
                           3. Genero
                           4. Edad Minima
                           Seleccione una opcion:
                           """);
        int modify = sc_int.nextInt();
        switch (modify){
            case 1:
            {
                System.out.println("Modificara el titulo del libro. Ingrese un nuevo titulo.");
                Librero.get(libselect-1).setTitulo(sc.nextLine());
                System.out.println("Libro modificado exitosamente!");
                break;
            }
            case 2:
            {
                System.out.println("Modificara el autor del libro. Ingrese un nuevo autor.");
                Librero.get(libselect-1).setAutor(sc.nextLine());
                System.out.println("Libro modificado exitosamente!");
                break;
            }
            case 3:
            {
                System.out.println("Modificara el genero del libro. Ingrese un nuevo genero.");
                Librero.get(libselect-1).setGenero(sc.nextLine());
                System.out.println("Libro modificado exitosamente!");
                break;
            }
            case 4:
            {
                System.out.println("Modificara la edad minima del libro. Ingrese una nueva edad minima.");
                Librero.get(libselect-1).setEdmi(sc.nextInt());
                while (Librero.get(libselect-1).getEdmi() <0){
                    System.out.println("Ingrese una edad valida, que no sea menor a 0.");
                    Librero.get(libselect-1).setEdmi(sc.nextInt());
                }
                System.out.println("Libro modificado exitosamente!");
                break;
            }
            default:
            {
                System.out.println("Ingrese un atributo a modificar valido.");
                break;
            }
        }
        
    }
    
    public static void Eliminarlibro (ArrayList<Libros> Librero){
        System.out.println("Ha ingresado la opcion de eliminar libro. Elija el libro que eliminara ingresando su numero de libro.");
        Printlibros(Librero);
        int libelim = sc_int.nextInt();
        while (libelim > Librero.size() || libelim < 0){
            System.out.println("Ese libro no existe. Ingrese el numero de un libro que si esta disponible.");
            libelim = sc_int.nextInt();
        }
        Librero.remove(libelim-1);
        System.out.println("El libro ha sido eliminado exitosamente!");
    }
    
    public static void BuscarLib(ArrayList<Libros> Librero, int atributo){
        ArrayList<Libros> Encontrados = new ArrayList<>();
        switch(atributo){
            case 5:
            {
                System.out.println("Ingrese el titulo a buscar: ");
                String titulo = sc.nextLine();
                for (int i = 0; i < Librero.size(); i++) {
                    if (titulo.equalsIgnoreCase(Librero.get(i).getTitulo())){
                        Encontrados.add(Librero.get(i));
                    }
                    
                }
                if (Encontrados.isEmpty()){
                    System.out.println("No se encontro ningun libro con el titulo que busco.");
                }
                else
                {
                System.out.println("Los libros encontrados con el titulo que busco fueron: ");
                System.out.println("");
                Printlibros(Encontrados);
                }
                break;
            }
            case 6:
            {
                System.out.println("Ingrese el autor a buscar: ");
                String autor = sc.nextLine();
                for (int i = 0; i < Librero.size(); i++) {
                    if (autor.equalsIgnoreCase(Librero.get(i).getAutor())){
                        Encontrados.add(Librero.get(i));
                    }
                    
                }
                if (Encontrados.isEmpty()){
                    System.out.println("No se encontro ningun libro con el autor que busco.");
                }
                else
                {
                System.out.println("Los libros encontrados con el autor que busco fueron: ");
                System.out.println("");
                Printlibros(Encontrados);
                }
                break;
            }
            case 7:
            {
                System.out.println("Ingrese el genero a buscar:");
                String genero = sc.nextLine();
                for (int i = 0; i < Librero.size(); i++) {
                    if (genero.equalsIgnoreCase(Librero.get(i).getGenero())){
                        Encontrados.add(Librero.get(i));
                    }
                    
                }
                if (Encontrados.isEmpty()){
                    System.out.println("No se encontro ningun libro con el genero que busco.");
                }
                else
                {
                System.out.println("Los libros encontrados con el genero que busco fueron: ");
                System.out.println("");
                Printlibros(Encontrados);
                }
                break;
            }
        }
    }
   
}
