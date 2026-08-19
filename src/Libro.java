public class Libro extends Material{
    private String autor;
    private String isbn;

    public Libro(String codigo, String titulo, int anioPublicacion, boolean libroDisponible, String autor, String isbn) {
        super(codigo, titulo, anioPublicacion, libroDisponible);
        this.autor = autor;
        this.isbn = isbn;
    }

    //Getters
    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    //Override getTipo

    @Override
    public String getTipo() {
        return "Libro";
    }

    //ToSTRING

    @Override
    public String toString() {
        return "Libro{" +
                ", codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                "autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", anioPublicacion=" + anioPublicacion +
                ", libroDisponible=" + libroDisponible +
                '}';
    }
}
