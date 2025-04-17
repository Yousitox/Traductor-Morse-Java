package Menus;

// imports
import java.util.InputMismatchException;
import java.util.Scanner;

import local.Ideomas;

// fin de imports
public class MenuIdeoma {
    /**
     * @param Scanner(System.in
     */
    // clase MenuIdeoma
    // metodo para seleccionar el idioma
    public static void getIdeoma() { // inicio del metodo getIdeoma
        // Atributo scanner para leer la entrada del usuario
        final Scanner scan = new Scanner(System.in);
        // Atributo string para que el usuario seleccione el idioma
        String tag = "";
        boolean valid = false;
        // inicio del menu de seleccion ideoma
        do {
            try {
                System.out.println("Select");
                System.out.println("1. English");
                System.out.println("2. Español");
                System.out.println("3. Francais");
                System.out.println("4. Portugues");
                System.out.println("5. Italiano");
                System.out.println("6. Neerlandes");
                System.out.println("-------------");
                switch (scan.nextInt()) {
                    case 1:
                        System.out.println("------------");
                        tag = "en-EN";
                        valid = true;
                        break;
                    case 2:
                        System.out.println("------------");
                        tag = "es-ES";
                        valid = true;
                        break;
                    case 3:
                        System.out.println("------------");
                        tag = "fr-FR";
                        valid = true;
                        break;
                    case 4:
                        System.out.println("------------");
                        tag = "pt-PT";
                        valid = true;
                        break;
                    case 5:
                        System.out.println("------------");
                        tag = "it-IT";
                        valid = true;
                        break;
                    case 6:
                        System.out.println("------------");
                        tag = "nl-NL";
                        valid = true;
                        break;
                    default:
                        System.out.println("-------------");
                        System.out.println("Error, please select a valid option.");
                        System.out.println("-------------");
                        break;
                }
            } catch (final InputMismatchException e) {
                System.out.println("-------------");
                System.out.println("Error, please select a valid option.");
                System.out.println("-------------");
                scan.nextLine(); // limpiar buffer
            }
        } while (!valid); // fin del menu de seleccion ideoma

        Ideomas.cargar(tag); // carga idioma segun seleccion
    } // fin del metodo getIdeoma
} // fin de la clase MenuIdeoma
