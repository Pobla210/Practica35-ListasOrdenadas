import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String opcion;
        int numero;
        String nomloca;
        ConversorLocalidad conver=new ConversorLocalidad();
        conver.convertir(ListaLocalidades.getListaLocalidades());

        do {
            System.out.println("1)Mostrar los datos de una localidad"+
                    "\n2)Mostrar la lista de localidades ordenada por nombre de localidad"+
                    "\n3)Mostrar la lista de localidades ordenada por provincia y luego por nombre de localidad"+
                    "\n4)Mostrar la lista de localidades ordenada por su distancia a la ciudad de palencia"+
                    "\n5)Añadir una localidad"+
                    "\n6)Mostrar la ciudad mas cercana a un punto de geolocalizacion"+
                    "\n7)Salir");
            opcion= in.nextLine();
            numero=Integer.parseInt(opcion);

            switch (numero){
                case 1:
                    System.out.println("Dime el nombre de la localidad: ");
                    nomloca= in.nextLine();
                    conver.mostrarLocalidad(nomloca);
                    break;
                case 2:
                    conver.mostrarLocalidadNombre();
                    break;
                case 3:
                    conver.mostrarProv();
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    System.out.println("Saliendo...");
                    break;
            }

        }while (numero!=7);
    }
}
