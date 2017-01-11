/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad5clasescuenta;

/**
 *
 * @author admin1
 */
public class CCuenta {
    //atributos
    private String nombre;
    private String numCuenta;
    private String dni;
    private double saldo;
    private double tipoInteres;
    
    //constructores
    public CCuenta(String n, String d, String nCuenta){
        asignarNombre(n);
        asignarDNI(d);
        asignarNumCuenta(nCuenta);
    }
    
    public CCuenta(){
    
    }
    public CCuenta(String n, String d, String nCuenta, double s){
        asignarNombre(n);
        asignarNumCuenta(nCuenta);
        asignarDNI(d);
        saldoInicial(s);
    }
    
    //metodos
    /**
     * Se asigna el nombre pasado por parametro
     * @param n titular de la cuenta
     */
    public void asignarNombre(String n){
        if (n.length()>0)
            nombre=n;
            }
    /**
     * Devuelve el nombre del titular de la cuenta
     * @return 
     */
    public String devolverNombre(){
        return nombre;
    }
    /**
     * Se asigna el numero de cuenta pasado por parametro
     * @param nc 
     */
    public void asignarNumCuenta(String nc){
        if (nc.length()==20 || nc.length()==24)
            numCuenta=nc;
    }
    /**
     * Devuelve el numero de cuenta del titular
     * @return 
     */
    public String devolverNumCuenta(){
        return numCuenta;
    }
    /**
     * Asignar el saldo inicial del titular de la cuenta
     * @param s 
     */
    public void saldoInicial (double s){   
        saldo=s;
    }
    /**
     * Devolver saldo del titular de la cuenta
     * @return 
     */
    public double devolverSaldo(){
        return saldo;
    }
    /**
     * Asignamos le numero de DNI del titular de la cuenta
     * @param d 
     */
    public void asignarDNI (String d){
        if (d.length()==9)
            dni=d;
    }
    /**
     * Devuelve el numero de DNI del titular de la cuenta
     * @return 
     */
    public String devolverDNI (){
        return dni;
    }
    /**
     * Define el ingreso que hace el cliente
     * @param i 
     */
    public void ingreso (double i){
        if (i>0)
            saldo+=i;
    }
    /**
     * Define el dinero retirado por el cliente
     * @param r 
     */
    public void reintegro (double r){
        /*if (r>0 && saldo>=r){
            saldo-=r;
        }else
            System.out.println("No tienes suficiente saldo o la cantidad a retirar es negativa");
    }*/
        if (r>0){
            if (saldo>=r){
                saldo-=r;
            }
            else
                System.out.println("Error, no tienes suficiente saldo");    
        }
        else
            System.out.println("Error, no puedes sacar una cantidad negativa");
    } 
    /**
     * Asigna el tipo de interes para el cliente
     * @param t 
     */
    public void asignarTipoInteres(double t){
        tipoInteres=t;
    }
    /**
     * Devuelve el tipo de interes del cliente
     * @return 
     */
    public double devolverTipoInteres(){
        return tipoInteres;
    }
    
    /**
     * Muestra los todos los datos del cliente
     */
    public void mostrarDatos(){
        System.out.println("Nombre del cliente: "+nombre);
        System.out.println("Numero de cuenta del cliente: "+numCuenta);
        System.out.println("Tipo de interes: "+tipoInteres);
        System.out.println("Numero de DNI: "+dni);
        System.out.println("Saldo del cliente: "+saldo);
    }
}
