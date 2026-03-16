import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String opcion;
        int numero;
        String nomloca="";
        String nomprovincia="";
        double corx=0;
        double cory=0;
        String validador="[a-zA-ZÁÉÍÓÚáéíóúñÑ ]+";

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
                    conver.mostrarLocalidadNombre(in);
                    break;
                case 3:
                    conver.mostrarProv(in);
                    break;
                case 4:
                case 5:
                    try{
                        System.out.println("Dime el nombre: ");
                        nomloca= in.nextLine();
                        if (!nomloca.matches(validador)){
                            throw new FormatException("No puedes introducir numeros.");
                        }
                        System.out.println("Dime la provincia: ");
                        nomprovincia= in.nextLine();
                        if (!nomprovincia.matches(validador)){
                            throw new FormatException("No puedes introducir numeros.");
                        }

                        System.out.println("Dime la coordenada x: ");
                        String coorx=in.nextLine();
                        corx=Double.parseDouble(coorx);
                        System.out.println("Dime la coordenada y: ");
                        String coory=in.nextLine();
                        cory=Double.parseDouble(coory);
                    }

                    catch (FormatException fe){
                    System.out.println(fe.getMessage());
                    }

                    Localidad nueva=new Localidad(nomloca,nomprovincia,corx,cory);
                    conver.localidades.add(nueva);
                    conver.localidadesnom.add(nueva);
                    conver.localidadprov.add(nueva);
                    System.out.println("Localidad añadida");
                case 6:
                case 7:
                    conver.mostrarNomProv();
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
            }

        }while (numero!=7);
    }
}
