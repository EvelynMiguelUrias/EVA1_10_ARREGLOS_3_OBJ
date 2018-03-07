/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_10_arreglos_3_obj;

/**
 *
 * @author Evelyn
 */
public class EVA1_10_ARREGLOS_3_OBJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ARREGLO DE 5 OBJETOS DE TIPO PERSONA 
        Persona apGente[] = new Persona[5];
        //DEBEMOS DE CREAR CADA UNO DE ELLOS 
        apGente[0] = new Persona();//CONSTRUCTOR DEFAULT
        apGente[1] = new Persona("Ana", "Witchar", 45);//CONSTRUCTOR CON PARAMETROS 
        apGente[2] = new Persona("Cesar", "Cruz", 47);
        apGente[3] = new Persona("Ivan", "Urias", 15);
        apGente[4] = new Persona("Luis", "Urias", 13);
        for (int i = 0; i < apGente.length; i++) {//PARA MANDARLOS LLAMAR Y QUE NO NOS MANDE LA DIRECCION SE LLAMAN DESDE LOS GET
            //SE UTILIZA EL PUNTO PARA ACCEDER A LO QUE ESTA ALMACENADO EN LA DIRECCION DE CADA ARREGLO
            System.out.println("Nombre: " + apGente[i].getsNombre());
            System.out.println("Apellido: " + apGente[i].getsApellido());
            System.out.println("Edad: " + apGente[i].getiEdad());
        }
        //CREO LA COPIA
        Persona apCopiaGen[]= new Persona[5];
        for (int i = 0; i < apGente.length; i++) {
           //ESTO NO FUNICONA, SOLO COPIA DIRECCIONES
           //apCopiaGen[i]=apGente[i];//COPIAMOS LA DIRRECCION DEL OBJETO, NO ES UNA COPIA DE DATOS, ES DE REFERENCIA 
           //ESTO SI FUNCIONA, HAY QUE LEER PROPIEDAD POR PROPIEDAD DE CADA OBJETO 
           apCopiaGen[i] = new Persona();//CREAR EL OBJETO 
           apCopiaGen[i].setsNombre(apGente[i].getsNombre());//COPIAR LOS DATOS 
           apCopiaGen[i].setsApellido(apGente[i].getsApellido());
           apCopiaGen[i].setiEdad(apGente[i].getiEdad());
        }
        //IMPRIMIR LA COPIA 
        System.out.println("xxxxxxx");
        System.out.println("copia");
        for (int i = 0; i < apGente.length; i++) { 
            System.out.println("Nombre: " + apCopiaGen[i].getsNombre());
            System.out.println("Apellido: " + apCopiaGen[i].getsApellido());
            System.out.println("Edad: " + apCopiaGen[i].getiEdad());
        }
    }
    
}
class Persona{
    private String sNombre;
    private String sApellido;
    private int iEdad;
    //CONSTRUCTOR 
    public Persona() {
        sNombre = "Evelyn";
        sApellido = "Miguel";
        iEdad = 19;
    }
    //CONSTRUCTOR CON PARAMETROS DE ENTRADA 
    public Persona(String sNombre, String sApellido, int iEdad) {
        this.sNombre = sNombre;
        this.sApellido = sApellido;
        this.iEdad = iEdad;
    }
    //METODOS GET Y SET 
    public String getsNombre() {
        return sNombre;
    }
    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }
    public String getsApellido() {
        return sApellido;
    }
    public void setsApellido(String sApellido) {
        this.sApellido = sApellido;
    }
    public int getiEdad() {
        return iEdad;
    }
    public void setiEdad(int iEdad) {
        this.iEdad = iEdad;
    }   
}
