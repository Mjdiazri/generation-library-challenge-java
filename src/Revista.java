public class Revista extends Material{

    private int edicion;
    private String tematica;

    public Revista( String codigo, String titulo, int anioPublicacion, boolean libroDisponible, int edicion, String tematica){
        super (codigo, titulo, anioPublicacion, libroDisponible);
        this.edicion = edicion;
        this.tematica = tematica;
    }

    //Getters
    public int getEdicion(){
        return this.edicion;
    }

    public String getTematica(){
        return  this.tematica;
    }

    @Override
    public String getTipo(){
        return "Revista";
    }

    //ToString

    @Override
    public String toString() {
        return "Revista{" +
                ", codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", anioPublicacion=" + anioPublicacion +
                ", libroDisponible=" + libroDisponible +
                "edicion=" + edicion +
                ", tematica='" + tematica + '\'' +
                '}';
    }
}
