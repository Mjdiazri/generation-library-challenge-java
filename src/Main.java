public class Main {

    public static void main(String[] args){

        Libro libro1 = new Libro("L-001", "El rey de hierro", 2007, true, "Maurice Druon", "aa5848594");
        Revista revista1 = new Revista("R-001", "Muy interesante", 2026, false, 12, "Ciencia");

        libro1.mostrarInfo();
        revista1.mostrarInfo();



    }
}
