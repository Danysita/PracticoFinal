import java.util.Scanner;
import java.util.ArrayList;

    
public class PracticoFinal { 
    public static void main(String[] args) {
   Scanner Escaner = new Scanner(System.in);
   ArrayList<String> Servicios = new ArrayList<>();
      

  

  try{
   Recursos.titulo();
   
   if (Recursos.verificaCredenciales()) {
    System.out.println("*****************************");
    System.out.println("** Credenciales Correctas! **");
    System.out.println("*****************************");
    System.out.println("Presione enter para ingresar al sistema");
    Escaner.nextLine();

            String menu ="";    
       do{
       Recursos.LimpiarPantalla();
       Recursos.titulo();
        
       System.out.println("\n+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
       System.out.println("\n+-+-+-+-+-+   Menu Principal    +-+-+-+-+");
       System.out.println("\n+-+       1)Gestion de clientes       +-+");
       System.out.println("\n+-+       2) Gestion de Servicio      +-+");
       System.out.println("\n+-+       3) Reportes                 +-+");
       System.out.println("\n+-+       x) Salir                    +-+");
       System.out.println("\n+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
       System.out.println("+-+     ingrese la opcion deseada     +-+");
       System.out.println("+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        menu = Escaner.nextLine();

       switch(menu) {
           case "1":
               GestionClientes.Clientes();
               
               break;

           case "2":
                GestionServicios Gestion = new GestionServicios();
                Gestion.Servicios(Servicios);
              

               break;

           case "3":
               Reportes.reportes(Servicios);
          
               break;
            
           default:
           if(!menu.equalsIgnoreCase("x")){
            System.out.println("===============================================");
            System.out.println("= Opcion no valida. Por Favor intente de nuevo=");
            System.out.println("===============================================");
            System.out.println("Ingrese Enter para continuar..");
            Escaner.nextLine();
          }
       }
   } while (!menu.equalsIgnoreCase("x"));

   } else {
    System.out.println("************************************************");
    System.out.println("** hubo un error, Verifique sus credenciales! **");
    System.out.println("************************************************");
       System.out.println("Presione enter para ingresar al sistema");
    Escaner.nextLine();
}

   


  

   
 }catch(Exception e) {System.out.println("Ha ocurrido un error inesperado");
}finally{System.out.println("Cerrando Programa..." );  Escaner.close();}


}
}
