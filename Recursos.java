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

    public static boolean verificaCredenciales() {
         String usuario ="";
         String contrasenia ="";
         boolean loginok = false;
         Scanner scanner = new Scanner(System.in);
         
     System.out.println("Verifique sus credenciasles..");
     System.out.println("Usuario:");
      usuario = scanner.nextLine();
     System.out.println("Contrase\u00F1a:");
      contrasenia = scanner.nextLine();
      System.out.println("Presione enter para continuar");
      scanner.nextLine();
     
      loginok = usuario.equals("cursojava") && contrasenia.equals("proyectofinal");
         if(!loginok){ System.out.println("Credenciales incorrectas, intente de nuevo..");}

     return loginok;
 }

    public static final void LimpiarPantalla(){
                 try {
                    new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();
                 } catch (Exception e) {
                    e.printStackTrace();
                 }


    }

}