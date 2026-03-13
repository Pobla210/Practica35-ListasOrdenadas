import java.util.TreeSet;

public class ConversorLocalidad {
    TreeSet<Localidad> localidades=new TreeSet<>();
    Localidad localidad;

    public void convertir(String[][] listaLocalidades){
        for(String[] localidadArray:listaLocalidades){
            localidad = new Localidad(localidadArray[0],localidadArray[1],Double.parseDouble(localidadArray[2]),Double.parseDouble(localidadArray[3]));
            localidades.add(localidad);
        }
    }


}