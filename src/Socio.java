public class Socio {
    private String nombre;
    private int numeroSocio;
    private  int contrasena;
    private int librosPrestados = 0;
    private final int maxPrestamos = 2;

    public Socio(String nombre, int numeroSocio, int contrasena){
        this.nombre = nombre;
        this.numeroSocio = numeroSocio;
        this.contrasena = contrasena;

    }

    public boolean comprobarContrasena(int pin){
        
        return this.contrasena == pin;
        
    }

    public boolean puedePedir(){

      return librosPrestados < maxPrestamos;

    }

    public void pedirLibro(Libro libro){
        if(puedePedir()){
            /*TODO metodo Biblioteca.prestar(libro) */
            librosPrestados++;

            if(puedePedir()){
                if(Biblioteca.prestar(libro)){
                    librosPrestados++;
                    System.out.println("Prestamo Realizado");
                }else{
                    System.out.println("Este libro ya esta prestado");
                }
                

            }
          
        }else{
            System.out.println("No mas prestamos para ti");
        }
    }

    public void devolverLibro(Libro libro){
        Biblioteca.devolver(libro);
        librosPrestados--;

        if (librosPrestados < 0){
            librosPrestados = 0;
        }

    }

    public void mostrarDatos(){
        System.out.println(nombre);
        System.out.println(numeroSocio);
        System.out.println(librosPrestados);
    }

    /*GETTERS---------------- */
    public int getContrasena() {
        return contrasena;
    }

    public int getLibrosPrestados() {
        return librosPrestados;
    }

    public int getMaxPrestamos() {
        return maxPrestamos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    /*SETTERS---------------- */
    public void setContrasena(int contrasena) {
        this.contrasena = contrasena;
    }

    public void setLibrosPrestados(int librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroSocio(int numeroSocio) {
        this.numeroSocio = numeroSocio;
    }


}
