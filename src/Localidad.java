public class Localidad {
    protected String localidad;
    protected String provincia;
    protected double x;
    protected double y;

    public Localidad(String localidad,String provincia,double x,double y) throws FormatException{
        if (localidad.isEmpty() || provincia.isEmpty()){
            throw new FormatException("Error. Este dato no puede ir vacio");
        }
        this.localidad=localidad;
        this.provincia=provincia;
        this.x=x;
        this.y=y;
    }

    public String toString(){
        return "Nombre de la localidad: "+localidad+
                "\nNombre de la provincia: "+provincia+
                "\nCoordenadas: "+"X: "+x+" Y: "+y;
    }
}
