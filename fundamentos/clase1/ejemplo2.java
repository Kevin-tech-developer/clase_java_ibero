package fundamentos.clase1;

import java.util.Scanner;

public class ejemplo2 {
    public static void main(String[] args) {
        //scanner para tomar datos
        Scanner entrada = new Scanner(System.in);
        //opcion para usuario
        int opcion;

        //do-while= mostrar el contenido del do si se cumple la condicion
        do {
            //menu
        System.out.println("=====MENU=====");
        System.out.println("1. saludar");
        System.out.println("2. tipos de clases Wrapper");
        System.out.println("3. mostrar tipos de datos");
        System.out.println("4. tipos condicionales");
        System.out.println("0. salir");
        System.out.print("DIGITE UNA OPCION DEL MENU: ");
        //tomamamos la opcion del usuario
        opcion = entrada.nextInt();
        //limpiamos el buffer
        entrada.nextLine();
        
        //estrucutura de analisis de caso
        switch (opcion) {
            case 1: //tipos de cassos
                System.out.println("digite su nombre: ");
                String nombre = entrada.nextLine();
                System.out.println("==============================");
                System.out.printf("hola buen dia %s %n",nombre);
                //romper estructura
                break;
            case 2:
                System.out.println("======topos de clases wrapper========");
                System.out.println("Integer, Boolean, Float, Double, String");
                break;
            case 3:
                System.out.println("=========Tipos de datos ========");
                System.out.println("int, double, String, boolean, float, char");
                break;
            case 4:
                System.out.println("=======tipos de condicionales=======");
                System.out.println("if, else if, else, switch");
                break;
            case 0:
                System.out.println("gracias por usar el sistema");
                entrada.close();
                break;
            default:
                System.out.println("opcion invalidad");
                break;
        }
        //condicion a evaluar (clave de que se muestre de nuevo el menu o el contenido)
        } while (opcion !=0);
        

    }
}
