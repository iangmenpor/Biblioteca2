public class Libro {
    private String titulo;
    private String isbn;
    private String autor;
    private String genero;
    private String fechapublicacion;

    public String getNombreCompleto(){ return isbn + ""+ autor + "" + genero + ""+ fechapublicacion;}

    public String getTitulo() {return titulo;}

    public String getIsbn() {return isbn;}

    public String getGenero() {return genero;}

    public String getFechapublicacion() {return fechapublicacion;}


}
