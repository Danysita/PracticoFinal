import java.util.Scanner;
import java.util.ArrayList;

public class GestionServicios {
public  void Servicios(ArrayList<String> Servicios) {

Scanner escaner = new Scanner (System.in);
boolean Salir = false;

  Scanner Escaner = new Scanner(System.in);
  String menu = "";
do {
  Recursos.titulo();
  Recursos.LimpiarPantalla();
 String Fecha = ""; 
 String Servicio = "";
 String Cliente = "";
 String Monto ="";
 String Descripcion ="";
 String barrioelejido ="";
  
	    Recursos.titulo();
	    System.out.println("+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
			System.out.println("\n+-+-+-+-+-+ Menu de Servicios +-+-+-+-+");
			System.out.println("\n+-+     1)Agregar Servicio          +-+");
			System.out.println("\n+-+     2) Listar Servicios         +-+");
			System.out.println("\n+-+     3) Buscar Servicios         +-+");
			System.out.println("\n+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
      System.out.println("+-+     ingrese la opcion deseada     +-+");
      System.out.println("+-+         o x para regresar         +-+");
      System.out.println("+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
			menu  = Escaner.nextLine();	
	
        switch (menu){
     case "1":{
      Recursos.LimpiarPantalla();
       Recursos.titulo();
     System.out.println("Gestion de Servicios-> Ingresar Nuevo Servicio");

                while (!Fecha.contains("/")) {
                    System.out.println("Ingrese Fecha de Realizacion del servicio");
                    System.out.println("Por favor ingrese la fecha en el siguiente formato dd/mm/aaaa");
                    Fecha = Escaner.nextLine();
                    if(!Fecha.contains("/")){System.out.println("Ingrese la fecha en un formato valido!!");}
                   } 

               while (Servicio.length() < 1) {
                    System.out.println("Ingrese Tipo de Servicio");
                    Servicio = Escaner.nextLine();
                    if(Servicio.length() < 1){System.out.println("Debe ingresar al menos un servicio!!");}
                   } 

                 while (Cliente.length() < 8) {
                    System.out.println("Ingrese Cedula de identidad del cliente en el siguiente formato: 36779481");
                     System.out.println("Ej: 53768942");
                    Cliente = Escaner.nextLine();
                    if(Cliente.length() < 8){System.out.println("Ingrese una Cedula valida por favor!");}
                    if(Cliente.contains("-.")){System.out.println("Ingrese la Cedula sin puntos ni guion!");}
                   } 
                 
                   while(barrioelejido.equals("")){
                    System.out.println("Ingrese un barrio");
                    barrioelejido = Recursos.Barrios();
                         if(barrioelejido.equals("")){System.out.println("Por favor ingrese un Barrio!!");}
                   }

              
              while (Monto.length() < 1) {
                    System.out.println("Ingrese El monto cobrado por el servicio");
                    Monto = Escaner.nextLine();
                    if(Monto.length() < 1){System.out.println("Ingrese un monto por favor!!");}
                   } 
                   
           
              while (Descripcion.length() < 1) {
                    System.out.println("Ingrese Una Descripcion sobre el servicio");
                    Descripcion = Escaner.nextLine();
                    if(Descripcion.length() < 1){System.out.println("Ingrese una descripcion por favor!!");}
                   } 
                   
                      
                  
                               Recursos.titulo();
                              Recursos.LimpiarPantalla();
     System.out.println("Gestion de Servicios-> Ingresar Nuevo Servicio");

   System.out.println("Fecha: " + Fecha + "\nTipo de servicio: " + Servicio + "\nCliente: " + Cliente + "\nBarrio: " + barrioelejido + "\nMonto:" + Monto + "\nDescripcion: " + Descripcion);
         
        Servicios.add(Fecha + "," + Servicio + "," + Cliente + "," + barrioelejido + "," + Monto + "," + Descripcion );
       System.out.println("Servicio Agregado con exito!");
                   System.out.println("Ingrese Enter para continuar..");    
              
                   Escaner.nextLine();
                   
		  break;
     }

     case "2" : {
       Recursos.titulo();
      Recursos.LimpiarPantalla(); 

     System.out.println("Gestion de Servicios-> Listar Servicio");

			System.out.println("IDENTIFICADOR - FECHA - TIPO DE SERVICIO - CLIENTE - MONTO - DESCRIPCION");
      System.out.println("-------------------------------------------------------------------------");
			for (int i = 0; i < Servicios.size(); i++) {
				System.out.println(i + ") " + Servicios.get(i));
				System.out.println("\n---------------------------------------------------------------------");
	
                  
			}
      	   System.out.println("Ingrese Enter para continuar..");    
                   Escaner.nextLine();
         break;
    }
    case "3" : {
       Recursos.titulo();
      Recursos.LimpiarPantalla();

     System.out.println("Gestion de Servicios-> Buscar Servicio");

        System.out.println("Ingrese una palabra clave para buscar un servicio");
        String Busqueda = Escaner.nextLine();
		 
        for(String servicio : Servicios){
        if (servicio != null && servicio.contains(Busqueda)) {
              
              Recursos.titulo();
           System.out.println("Gestion de Servicios -> Buscar Servicio");
        System.out.println("***************************************");
        System.out.println("*** se encontraron estos servicios: ***" );
        System.out.println("***************************************");
        System.out.println( servicio);
       System.out.println("\n--------------------------------------------------");	
                 System.out.println( "ingrese Enter para continuar");
                Escaner.nextLine();
        
         }else{ System.out.println("No se encontro ningun cliente por: " + Busqueda );
        System.out.println("Ingrese Enter para continuar..");
        Escaner.nextLine();
        }
            
      } 
        
         

    }
	break;
  
		  default:
		  if(!menu.equalsIgnoreCase("X")){
		  System.out.println("===============================================");
		  System.out.println("= Opcion no valida. Por Favor intente de nuevo=");
		  System.out.println("===============================================");
      System.out.println("Ingrese Enter para continuar..");
      Escaner.nextLine();
		}
	}

 
		
	}while (!menu.equalsIgnoreCase("x"));
   
	   } 
      }
    