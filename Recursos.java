import java.util.Scanner;

public class Recursos {
    public static void titulo(){

        System.out.println("#############################################################################################################");
        System.out.println("#######################################     PyME ADMIN       ################################################");
        System.out.println("#############################################################################################################");    
     

    }
    


   public static String Barrios() {
    Scanner Escaner = new Scanner(System.in);

    System.out.println("Eliga uno de los siguientes barrios");
    System.out.println("++++++++++++++++++++++++");
    System.out.println("+++     BARRIOS      +++");
    System.out.println("-------------------------");
    System.out.println("+++ 1) Centro        +++");
    System.out.println("+++ 2) Maria Isabel  +++");
    System.out.println("+++ 3) Los Arrayanes +++");
    System.out.println("+++ 4) Benteveo      +++");
    System.out.println("++++++++++++++++++++++++");
    String Barrios = Escaner.nextLine();
    String Barrio = "";
     switch(Barrios){
        case "1":
          Barrio = "Centro";
         break;
        case "2":
          Barrio = "Maria Isabel";
         break;
        case "3":
          Barrio = "Los Arrayanes";
         break;
       case "4":
          Barrio = "Benteveo";
         break;
          default:
              System.out.println("Opcion incorrecta, intente de nuevo");
     }
 return Barrio;
  

}

    public static boolean verificaCredenciales(Scanner scanner) {
     System.out.println("Usuario:");
     String usuario = scanner.nextLine();
     System.out.println("Contrase\u00F1a:");
     String contrasenia = scanner.nextLine();
     return usuario.equals("cursojava") && contrasenia.equals("1234");
 }

    public static final void LimpiarPantalla(){
                 try {
                    new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();
                 } catch (Exception e) {
                    e.printStackTrace();
                 }


    }

}