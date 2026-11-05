public class Libro {
    private String titulo;
    private String autor;
    private  int anioPublicacion;
    private boolean disponible = true;
    private int vecesprestado = 0;

    public Libro(String titulo, String autor, int anioPublicacion){
      this.titulo = titulo;
      this.autor = autor;
      this.anioPublicacion = anioPublicacion;
      this.disponible = true;
      this.vecesprestado = 0;

    }

    public void mostrarInfo(){
        System.out.println(titulo +" " +"-" +" "  +autor +" " +"(" + anioPublicacion +")");
        System.out.print("Estado: ");System.out.print(disponible);
        System.out.print(" ");
        System.out.println(vecesprestado);
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getVecesprestado() {
        return vecesprestado;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void isDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setVecesprestado(int vecesprestado) {
        this.vecesprestado = vecesprestado;
    }


    
}
