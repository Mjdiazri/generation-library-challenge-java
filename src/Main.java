import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args){

        //Creacion libros y revistas
        Libro libro1 = new Libro("L-001", "El rey de hierro", 2007, true, "Maurice Druon", "isbn-56: 947-1947-81-2");
        Libro libro2 = new Libro("L-002", "Murdoku", 2025, true, "Manuel Garand", "isbn-10: 628-7915-21-8");
        Revista revista1 = new Revista("R-001", "Muy interesante", 2026, false, 12, "Ciencia");
        Revista revista2 = new Revista("R-002", "Motos", 2001, true, 1, "Entretenimiento");
        Libro libro3 = new Libro("L-001", "El rey de hierro", 2027, false, "Maurice Druon", "isbn-56: 008-1839-47-8");

        //Registro en catalogo
        SistemaBiblioteca biblioteca = new SistemaBiblioteca();
        biblioteca.registrarMaterial(libro1);
        biblioteca.registrarMaterial(libro2);
        biblioteca.registrarMaterial(revista1);
        biblioteca.registrarMaterial(revista2);

        //Prueba doble libro
        biblioteca.registrarMaterial(libro3);

        //Busqueda por codigo Catalogo
        System.out.println("\n------------ Busqueda Catalogo --------------------");
        System.out.println(biblioteca.buscarMaterial("R-002"));
        System.out.println(biblioteca.buscarMaterial("R-0004"));

        //Lista de espera ArrayList
        biblioteca.agregarEspera("R-001", "Juana");
        biblioteca.agregarEspera("R-001", "Marcos");
        biblioteca.agregarEspera("R-001", "Julian");

        //Llamar siguiente
        System.out.println("\n----------- LLamar siguiente ---------------------");
        System.out.println(biblioteca.siguienteEnEspera("R-001"));
        System.out.println(biblioteca.siguienteEnEspera("R-001"));

        //Hashset agregar membresia
        System.out.println("\n----------- Agregar Miembros ---------------------");
        System.out.println(biblioteca.registrarMiembro("Diana Hurtado"));
        System.out.println(biblioteca.registrarMiembro("Camila Vasquez"));
        System.out.println(biblioteca.registrarMiembro("Yuri Balvuena"));
        System.out.println(biblioteca.registrarMiembro("Camila Vasquez"));

        //Validar Membresia
        System.out.println("\n----------- Validar Membresia ---------------------");
        System.out.println(biblioteca.tieneMembresia("Diana Hurtado"));
        System.out.println(biblioteca.tieneMembresia("Juan Duran"));

        //Mostrar catalogo
        System.out.println("\n----------- Mostrar Catalogo ---------------------");
        biblioteca.mostrarCatalogo();





    }
}
