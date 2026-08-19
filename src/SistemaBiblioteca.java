import java.util.*;

public class SistemaBiblioteca {

    private Map<String, Material> catalogo = new HashMap<>();
    private Map<String, ArrayList<String>> listaEspera = new HashMap<>();
    private Set<String> miembros = new HashSet<>();

    //metodo
    public void registrarMaterial(Material m){
        catalogo.put(m.getCodigo(), m);
    }

    public Material buscarMaterial(String codigo){
        return catalogo.get(codigo);
    }

    public void mostrarCatalogo(){
        for (Map.Entry<String, Material> m : catalogo.entrySet()){
            m.getValue().mostrarInfo();
            //System.out.println(m.getKey() +"\n"+ m.getValue());
        }
    }

    public void agregarEspera(String codigoMaterial, String usuario) {
        if (listaEspera.get(codigoMaterial) == null) {
            listaEspera.putIfAbsent(codigoMaterial, new ArrayList<>());
            listaEspera.get(codigoMaterial).add(usuario);
        } else {
            listaEspera.get(codigoMaterial).add(usuario);
        }
    }


    public String siguienteEnEspera(String codigoMaterial){
         return listaEspera.get(codigoMaterial).remove(0);
    }

    public boolean registrarMiembro(String usuario){
        return miembros.add(usuario);
    }

    public boolean tieneMembresia(String usuario){
        return miembros.contains(usuario);
    }


}
