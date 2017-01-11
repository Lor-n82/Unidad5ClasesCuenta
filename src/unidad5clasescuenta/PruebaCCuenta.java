package unidad5clasescuenta;

/**
 *
 * @author admin1
 */
public class PruebaCCuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //crear cuenta c1
        CCuenta c1;
        c1=new CCuenta();
        
        c1.asignarNombre("Loren");
        c1.asignarNumCuenta("14253562154125325641");
        c1.asignarDNI("45623886m");
        c1.asignarTipoInteres(1.5);
        c1.saldoInicial(500);
        c1.ingreso(100);
        c1.reintegro(50);
        
        c1.mostrarDatos();  
        
        System.out.println();
        
        CCuenta c2=new CCuenta();
        
        c2.asignarNombre("Javier");
        c2.asignarNumCuenta("14253562154125555641");
        c2.asignarDNI("45698452m");
        c2.asignarTipoInteres(5.5);
        c2.saldoInicial(1500);
        c2.ingreso(400);
        c2.reintegro(550);
        
        c2.mostrarDatos();
        
        System.out.println();
        
        CCuenta c3=new CCuenta("Julen","44466688g","00000000000000000000");
        c3.mostrarDatos();
        
        System.out.println();
        
        CCuenta c4=new CCuenta("Jokin","44455666h","12345678987456321456",2000);
        c4.mostrarDatos();
    }
    
}
