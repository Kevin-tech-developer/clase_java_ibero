package fundamentos.clase1;

import java.util.Scanner;

public class ejemploDatos {
    


    public static void main(String[] args) {
        //scanner
        Scanner entrada = new Scanner(System.in);

        //menu
        System.out.println("=====MENU=====");
        System.out.println("1. saludar");
        System.out.println("2. tipos de clases Wrapper");
        System.out.println("3. mostrar tipos de datos");
        System.out.println("4. tipos condicionales");
        System.out.print("DIGITE UNA OPCION DEL MENU: ");
        int opcion = entrada.nextInt();
        entrada.nextLine();

        if(opcion == 1){
            System.out.println("digite su nombre: ");
            String nombre = entrada.nextLine();
            System.out.println("==============================");
            System.out.printf("hola buen dia %s",nombre);
            
        }
        else if(opcion == 2){
            System.out.println("======topos de clases wrapper========");
            System.out.println("Integer, Boolean, Float, Double, String");
        }
        else if(opcion == 3){
            System.out.println("=========Tipos de datos ========");
            System.out.println("int, double, String, boolean, float, char");
        }
        else if(opcion == 4){
            System.out.println("=======tipos de condicionales=======");
            System.out.println("if, else if, else, switch");
        }
        else{
            System.out.println("opcion invalida");
        }
        


    }
}
