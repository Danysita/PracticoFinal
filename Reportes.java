import java.util.ArrayList;
import java.util.Scanner;
public class Reportes {
    public static void reportes(ArrayList<String> servicios) {
        

             Scanner escaner = new Scanner(System.in);
            

             Recursos.titulo();
             Recursos.LimpiarPantalla();
              

            System.out.println("\n+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
             System.out.println("\n+-+-+    Menu Reportes         +-+-+");
             System.out.println("\n+-+   1) Ingresos por mes        +-+");
             System.out.println("\n+-+   2) Servicios por Barrio    +-+"); 
             System.out.println("\n+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
             System.out.println("+-+   ingrese la opcion deseada   +-+");
             System.out.println("+-+        o x para regresar      +-+");
             System.out.println("+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+-");
             String menu = escaner.nextLine();


    do{
         switch (menu) {
            case "1":
            Recursos.titulo();
            Recursos.LimpiarPantalla();

            ArrayList<String> montos = new ArrayList<>();
           String MesIngresado = "";
          while(!MesIngresado.contains("/")){
              System.out.println("Ingrese un mes en el formato mm/yyyy");
                MesIngresado = escaner.nextLine();
            if (!MesIngresado.contains("/")) { System.out.println("Ingrese el mes en un formato valido ej: mm/yyyy");   }
            
        }
              
    
        Recursos.titulo();
        Recursos.LimpiarPantalla();
            System.out.println("Reportes -> Ingresos por mes");
    
            for (String Servicio : servicios) {
                String[] dividido = Servicio.split(",");
                String[] fecha = dividido[0].split("/");
    
                String mesymontos = fecha[1] + "/" + fecha[2] + "-" + dividido[4];
                montos.add(mesymontos);
            }
    
      
    
            int sumaMontos = 0;
    
            for (String reporte : montos) {
                String[] Mesmonto = reporte.split("-");
                String mesReporte = Mesmonto[0];
    
                if (mesReporte.equals(MesIngresado)) {
                    int monto = Integer.parseInt(Mesmonto[1]);
                    sumaMontos += monto;
                }
            }
    
            System.out.println("El monto Acumulado para el Mes: " + MesIngresado + " es de: " + sumaMontos);
        
    
        
       
        System.out.println("Ingrese enter para continuar");    
         escaner.nextLine();
                
                break;

          case "2":
          Recursos.titulo();
         Recursos.LimpiarPantalla(); 
          System.out.println("Reportes -> Servicios por barrio:");
       int Centro = 0;
        int MariaIsabel = 0;
        int LosArrayanes= 0;
        int Benteveo = 0;

        for (String cadena : servicios) {
            String nombreBarrio = cadena.split(",")[3];

            switch (nombreBarrio) {
                case "Centro":
                    Centro++;
                    break;
                case "Maria Isabel":
                    MariaIsabel++;
                    break;
                case "Los Arrayanes":
                    LosArrayanes++;
                    break;
                case "Benteveo":
                    Benteveo++;
                    break;
            }
        }

        
        System.out.println("Centro.................." + Centro);
        System.out.println("Maria Isabel............" + MariaIsabel);
        System.out.println("Los Arrayanes..........." + LosArrayanes);
        System.out.println("Benteveo................" + Benteveo);
        System.out.println("Ingrese enter para continuar");    
         escaner.nextLine();
    break;
          

            default: 
            if(!menu.equalsIgnoreCase("x")){
               System.out.println("===============================================");
               System.out.println("= Opcion no valida. Por Favor intente de nuevo=");
               System.out.println("===============================================");
              System.out.println("Ingrese Enter para continuar..");
                       escaner.nextLine();
            }
                break;
         }
       
         } while(menu.equalsIgnoreCase("x"));



        }

        }





















                 

     
