
// imports

import java.util.*;
import Morse.Morse;
import local.Ideomas;

// fin impports

public class Codigomorse { // inicio de la clase Codigomorse
    // Scanner
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) { // inicio del main
        // llamamos al metoodo getIdeoma para seleccionar el idioma
        getIdeoma();
        // Comstante para saber si es morse o no
        final String morseLine = "-";
        final String morsePoint = "·";

        // inicio para poner codigo morse o natural
        System.out.println(Ideomas.get("Introduccion"));
        scan.nextLine(); // limpiar buffer
        String text = scan.nextLine();
        System.out.println("-------------");
        // fin para poner codigo morse o natural

        // convierte el texto en mayusculas
        text = text.toUpperCase();

        // inicio del if que dice si es codigo morse o natural
        if (text.contains(morseLine)) {
            System.out.println(Ideomas.get("Esmorse"));
            System.out.println("-------------");
        } else if (text.contains(morsePoint)) {
            System.out.println(Ideomas.get("Esmorse"));
            System.out.println("-------------");
        } else {
            System.out.println(Ideomas.get("Noesmorse"));
            System.out.println("-------------");
            // llama al metodo getmorse para convertir el texto a morse
            System.out.println(getMorse(text));
        }
        // fin del if que dice si es morse o natural

    } // fin del main

    // metodo para seleccionar el idioma
    public static void getIdeoma() {
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
                    default:
                        System.out.println("-------------");
                        System.out.println("Error, please select a valid option.");
                        System.out.println("-------------");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("-------------");
                System.out.println("Error, please select a valid option.");
                System.out.println("-------------");
                scan.nextLine(); // limpiar buffer
            }
        } while (!valid); // fin del menu de seleccion ideoma

        Ideomas.cargar(tag); // carga idioma segun seleccion
    }

    public static String getMorse(String text) { // inicio del metodo getMorse
        // crea una instancia de la clase Morse para acceder al mapa de caracteres
        Morse morseconvert = new Morse();
        // obtiene el mapa de caracteres y sus representaciones en Morse
        Map<Character, String> morseMap = morseconvert.getMorseMap();
        // StringBuilder para almacenar el resultado en Morse
        StringBuilder morseResult = new StringBuilder();
        // convertir cada caracter del texto a Morse
        for (char c : text.toCharArray()) {
            if (morseMap.containsKey(c)) {
                morseResult.append(morseMap.get(c)).append(" "); // agregar espacio entre letras
            } else {
                morseResult.append("? "); // si el caracter no esta en el mapa, usar un marcador
            }
        }
        // convertir el resultado a String y agregar el texto en morse
        String textf = (Ideomas.get("Textomorse") + morseResult);
        return textf; // devuelve el texto en morse
    } // fin del metodo getMorse
} // fin de la clase Codigomorse
