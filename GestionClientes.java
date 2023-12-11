import java.util.Scanner;
import java.util.ArrayList;

public class GestionClientes  {
public static void Clientes() {

   ArrayList<String> Clientes = new ArrayList<>();
    Scanner Escaner = new Scanner(System.in);

       String menu ="";
    
    Clientes.add("54550275,Dany,Guillermo,092487656,Centro");




do {
    Recursos.titulo();
    Recursos.LimpiarPantalla();

      String barrioelejido ="";
      String cedula = "";                
      String Nombre = "";
      String Apellido = "";
      String telefono = "";

                       Recursos.titulo();

	        System.out.println("+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
			System.out.println("\n+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
			System.out.println("\n+-+-+      Menu de Clientes     +-+-+");
			System.out.println("\n+-+    1)Agregar cliente          +-+");
			System.out.println("\n+-+    2) Listar cliente          +-+");
			System.out.println("\n+-+    3) Eliminar Cliente        +-+");
			System.out.println("\n+-+    4) Buscar Cliente          +-+");
            System.out.println("\n+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
            System.out.println("+-+    ingrese la opcion deseada   +-+");
            System.out.println("+-+         o x para regresar      +-+");
            System.out.println("+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+-+");
			menu  = Escaner.nextLine();	
	
        switch (menu){
     case "1":{  
           Recursos.titulo();
         Recursos.LimpiarPantalla();
     System.out.println("Gestion de Clientes -> Ingresar Nuevo Cliente");

     while (cedula.length() < 8) {
        System.out.println("Ingrese Cedula de identidad del cliente en el siguiente formato: 36779481");
         System.out.println("Ej: 53768942");
        cedula = Escaner.nextLine();
        if(cedula.length() < 8){System.out.println("Ingrese una Cedula valida por favor!");}
        if(cedula.contains("-.")){System.out.println("Ingrese la Cedula sin puntos ni guion");}
       } 
		 
        while (Nombre.length() < 1) {
		System.out.println("Ingrese su Nombre");
         Nombre = Escaner.nextLine();        
         if(Nombre.length() < 1){System.out.println("Debe ingresar al menos un Nombre!");}
        }

        while (Apellido.length() < 1) {
		System.out.println("Ingrese su Apelldio");
         Apellido = Escaner.nextLine();
         if(Apellido.length() < 1){System.out.println("Debe ingresar al menos un apellido!");}
        }
			
        while (telefono.length() < 7) {
		System.out.println("Ingrese su Numero");
        telefono = Escaner.nextLine();
         if(telefono.length() < 7){System.out.println("ingrese un numero de telefono valido!");}
        }

        while(barrioelejido.equals("")){
            System.out.println("Ingrese un barrio");
            barrioelejido = Recursos.Barrios();
           if(barrioelejido.equals("")){System.out.println("Por favor ingrese un Barrio!");}
           }

             Recursos.LimpiarPantalla();

             Recursos.titulo();
            System.out.println("Gestion de Clientes -> Ingresar Nuevo Cliente");

        System.out.println("Cedula de Identidad: " + cedula + "\nNombre: " + Nombre + "\nApellido: " + Apellido + "\nTelefono: "+ telefono + "\nBarrio: " + barrioelejido);
        System.out.println("Cliente Agregado con exito!");

        String DatosCliente = cedula + "," + Nombre + "," + Apellido + "," + telefono + "," + barrioelejido;
        Clientes.add(DatosCliente);
		System.out.println("Ingrese Enter para continuar..");
        Escaner.nextLine();
    }
 break;
     
     case "2" : {
        Recursos.titulo();
         Recursos.LimpiarPantalla();
    
     System.out.println("Gestion de Clientes -> Listar Clientes");

	  System.out.println("CEDULA - NOMBRE - APELLIDO - TELEFONO - BARRIO");
      System.out.println("-------------------------------------------------------------------------");
        for (int indice = 0; indice < Clientes.size(); indice++) {
            System.out.println(indice + ") " + Clientes.get(indice));
            System.out.println("-------------------------------------------------------------------------");
            
    }
    System.out.println("Ingrese Enter para continuar..");
            Escaner.nextLine();
    break;
}
    case "3" : {
         Recursos.titulo();
         Recursos.LimpiarPantalla();
          String Busqueda = "";
                                         
        System.out.println("Gestion de Clientes -> Eliminar Cliente");
           
        
            while (Busqueda.length() < 7) {
        System.out.println("Ingrese la Cedula del cliente que desea eliminar en el siguiente formato: 36779481");
         System.out.println("Ej: 53768942");
        Busqueda = Escaner.nextLine();
        if(Busqueda.length() < 7){System.out.println("Ingrese una Cedula valida por favor!");}
        if(Busqueda.contains("-.")){System.out.println("Ingrese la Cedula sin puntos ni guion");}
       } 
		 
      

        boolean clienteEncontrado = false; 
        
        for (int indice = 0; indice < Clientes.size(); indice++) {
            if (Clientes.get(indice).contains(Busqueda)) {
                Clientes.remove(indice);
                System.out.println("Cedula de identidad: " + Busqueda);
                System.out.println("Cliente eliminado con exito!");
                System.out.println("Ingrese enter para continuar");
                Escaner.nextLine();
                clienteEncontrado = true;
                break; 
            }
        }
        
        if (!clienteEncontrado) {
            System.out.println("No se encontro ningun usuario con la cedula: " + Busqueda);
              System.out.println("Ingrese enter para continuar");
                Escaner.nextLine();
        }

    
    break;
}
	case "4": {
                                        Recursos.titulo();
                                        Recursos.LimpiarPantalla();
       
         System.out.println("************************************************");
		 System.out.println("*** Gestion de Clientes -> Buscar Cliente    ***");
		 System.out.println("************************************************");
	                                                                                                                   
	       System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-++-+-+");
		   System.out.println("+-+ ingrese una palabra clave para buscar el cliente +-+");
		   System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
		    
          
	     String Busqueda = Escaner.nextLine();
		 
		  for(String contacto : Clientes){
		  if (contacto != null && contacto.contains(Busqueda)) {
            
            Recursos.titulo();
         System.out.println("Gestion de Clientes -> Buscar Cliente");
		  System.out.println("***************************************");
		  System.out.println("*** se encontraron estos Clientes: ***" );
		  System.out.println("***************************************");
		  System.out.println( contacto);
		 System.out.println("\n--------------------------------------------------");	
               System.out.println( "ingrese Enter para continuar");
              Escaner.nextLine();
		  
		      }else{System.out.println("No se encontro ningun cliente por: " + Busqueda );
                    System.out.println("Ingrese Enter para continuar..");
                    Escaner.nextLine();
            
            }
			  
	      }
       break;
	}
	
		  default:
		  if(!menu.equalsIgnoreCase("x")){
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
      




 
