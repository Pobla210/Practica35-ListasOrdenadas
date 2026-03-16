import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class ConversorLocalidad {
    ComparadorLocalidades comparar=new ComparadorLocalidades();
    TreeSet<Localidad> localidades=new TreeSet<>(Comparator.comparing(Localidad::getLocalidad, comparar).thenComparing(Localidad::getX));
    TreeSet<Localidad> localidadesnom=new TreeSet<>(Comparator.comparing(Localidad::getLocalidad,comparar).thenComparing(Localidad::getX));
    TreeSet<Localidad> localidadprov=new TreeSet<>(Comparator.comparing(Localidad::getProvincia,comparar).thenComparing(Localidad::getLocalidad,comparar).thenComparing(Localidad::getX));
    Localidad localidad;

    public void convertir(String[][] listaLocalidades){
        for(String[] localidadArray:listaLocalidades){
            localidad = new Localidad(localidadArray[0],localidadArray[1],Double.parseDouble(localidadArray[2]),Double.parseDouble(localidadArray[3]));
            localidades.add(localidad);
            localidadesnom.add(localidad);
            localidadprov.add(localidad);
        }
    }

    public String mostrarLocalidad(String nomLocalidad)throws LocalidadInvalidaException{
        for (Localidad mostrar:localidades){
            if (nomLocalidad.equalsIgnoreCase(mostrar.getLocalidad())){
                return mostrar.toString();
            }
        }
        throw new LocalidadInvalidaException("Localidad no encontrada");
    }

    public void mostrarLocalidadNombre(Scanner in){
        int cont=1;
        for (Localidad loc:localidadesnom){
            System.out.println(loc.toString());
            if (cont==50){
                System.out.println("Pulsa intro para ver mas localidades");
                in.nextLine();
                cont=0;
            }
            cont++;
        }
    }

    public void mostrarProv(Scanner in){
        int cont=1;
        for(Localidad locpro:localidadprov){
            System.out.println(locpro.toString());
            if (cont==50){
                System.out.println("Pulsa intro para ver mas localidades");
                in.nextLine();
                cont=0;
            }
            cont++;
        }
    }
    public void mostrarNomProv(){
        for (Localidad nompro:localidades){
            System.out.println(nompro.getProvincia());
        }
    }


}