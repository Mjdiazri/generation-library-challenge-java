import java.util.HashMap;
import java.util.Map;

public class SistemaBiblioteca {

    private Map<String, Material> catalogo = new HashMap<>();

    //metodo
    public void registrarMaterial(Material m){
        catalogo.put(m.getCodigo(), m);
    }

    public Material buscarMaterial(String codigo){
        return catalogo.get(codigo);
    }

    public void mostrarCatalogo(){
        for (Map.Entry<String, Material> m : catalogo.entrySet()){
            System.out.println(m.getKey() +"\n"+ m.getValue() );
        }
    }


}
