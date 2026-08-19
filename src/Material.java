public abstract class Material implements Catalogable{

    protected String codigo;
    protected String titulo;
    protected int anioPublicacion;
    protected boolean libroDisponible;

    public Material(String codigo, String titulo, int anioPublicacion, boolean libroDisponible) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.libroDisponible = libroDisponible;
    }

    //Getters
    @Override
    public String getCodigo() {
        return this.codigo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public int getAnioPublicacion() {
        return this.anioPublicacion;
    }

    public boolean isLibroDisponible() {
        return this.libroDisponible;
    }

    //Metodo Abstracto
    public abstract String getTipo();

    //Metodo Concreto
    public void mostrarInfo(){
        System.out.printf("Resultado de la consulta: %n[%s] %s (%d) --- %b%n", getTipo(), this.titulo, this.anioPublicacion, this.libroDisponible);
    }

}
