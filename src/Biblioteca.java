import java.util.InputMismatchException;
import java.util.Scanner;

public class Biblioteca {
    Libro libro1 = new Libro("El Hobbit", "Tolkien", 2001);
    Libro libro2 = new Libro("IT", "Stefen King ", 1975);
    Libro libro3 = new Libro("El capitan calzoncillos", "David  Pikel", 2015);

    Socio socio1 = new Socio("Iván", 101, 6767);
    Socio socio2 = new Socio("Soler", 102, 1234);

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.inicioSesion();
    }

    public int lecturaSegura(){
        Scanner sc = new Scanner(System.in);
        boolean EsNatural = false;
        int numero = 0;
        do{
            try{
                numero = sc.nextInt();
                EsNatural = false;

                if (numero < 0) {
                    EsNatural = true;
                    System.out.println("No se admiten numeros negativos");
                }

            }catch(InputMismatchException ex){
                System.out.println("Error! Caracteres no validos detectados Intentalo de nuevo");
                EsNatural = true;
                sc.nextLine();
            }
                
        }while(EsNatural);

        return numero;
    }

    public boolean  ComprobarNumeroSocio(){

        boolean socio1Correcto = false;
        boolean socio2Correcto = false;
        int numeroSocio1 = socio1.getNumeroSocio();
        int numeroSocio2 = socio2.getNumeroSocio();
        

        System.out.print("Introduce tu numero de socio: ");

        

        do{

            int numeroIntroducido = lecturaSegura();

            if(numeroSocio1 == numeroIntroducido){

                socio1Correcto = true;

            }else if(numeroSocio2 == numeroIntroducido){

                socio2Correcto = true;

            }else{
                System.out.println("Este socio no existe");
            }
            

        }while(socio1Correcto && socio2Correcto );

        return socio1Correcto || socio2Correcto;

        
    }

    public void pedirContraseña(){
        int intentoContraseñausuario;
        int numeroIntentos = 4;
        boolean contraseñaSocio1 = false;
        boolean contraseñaSocio2 = false;
            System.out.println("Introduce la contraseña");
            
        do{

            intentoContraseñausuario = lecturaSegura();
            numeroIntentos--;
            
                if(socio1.getContrasena() == intentoContraseñausuario){
                    System.out.printf("Contraseña correcta, BIENVENIDO %s", socio1.getNombre());
                    contraseñaSocio1 = true;

                }
            

            
                else if(socio2.getContrasena() == intentoContraseñausuario){
                    System.out.printf("Contraseña correcta, BIENVENIDO %s", socio2.getNombre());
                    contraseñaSocio2 = true;

                
            }else{
                System.out.println("Contraseña incorrecta:");
                System.out.printf("te quedan %d intentos\n",numeroIntentos);
            }
            if(contraseñaSocio1 && contraseñaSocio2){
                System.out.print("Este socio no existe intentalo de nuevo: ");
            }
           

        }while(!contraseñaSocio1  && numeroIntentos < 0 || !contraseñaSocio2 && numeroIntentos < 0);

        if(numeroIntentos == 0){
            System.out.println("Te has quedado sin intentos");
        }
    }

    public void ImprimirSocios(){
        System.out.println("--- SOCIOS ---");
        System.out.println( socio1.getNumeroSocio() +" " +"-" +" " +socio1.getNombre());
        System.out.println( socio2.getNumeroSocio() +" " +"-" +" " +socio2.getNombre());
    }

    public void inicioSesion(){
        ImprimirSocios();
        ComprobarNumeroSocio();
        pedirContraseña();
        System.out.println();
        menuPrincipal();


    }

    public void imprimirMenuPrincipal(){
        System.out.println();
        System.out.println("1. Ver todos los libros");
        System.out.println("2. Pedir un libro");
        System.out.println("3. Devolver un libro");
        System.out.println("4. Ver mis datos de socio");
        System.out.println("5. Salir");
    }

    public void menuPrincipal(){
        System.out.println();
        System.out.println();
        System.out.println("¿Que quieres hacer?");
        System.out.println();
        int opciones = 0;
        
        
        do { 
            imprimirMenuPrincipal();
            opciones = lecturaSegura();

        switch (opciones) {
            case 1 -> {

            }

            case 2 -> {
                librosbiblioteca();
            }

            case  3 -> {
                librosbiblioteca();
            }

            case 4 -> {

            }

            case 5 -> {
                System.out.println();
                System.out.println("Adios");
                
            }

            default -> {
                
                System.out.println("Numero introducido no es correcto intentalo de nuevo");
                
            }

        } 

        }while (opciones != 5);

        
        
    }

    public void librosbiblioteca(){
        System.out.println("--- LIBROS DE LA BIBLIOTECA---");
        System.out.println();
        System.out.print("1. ");libro1.mostrarInfo();
        System.out.println();
        System.out.print("2. ");libro2.mostrarInfo();
        System.out.println();
        System.out.print("3. ");libro3.mostrarInfo();
        

    }

    public static boolean prestar(Libro libro){
        
        return true;
    }

    public static void devolver(Libro libro){

    }

    
}
