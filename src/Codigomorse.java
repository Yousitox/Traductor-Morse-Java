
// imports

import java.util.*;

import Menus.MenuIdeoma;
import Morse.MorseCombert;
import local.Ideomas;

// fin impports

public class Codigomorse { // inicio de la clase Codigomorse
    // Scanner
    public static Scanner scan = new Scanner(System.in);
    // atributo para añadir texto
    public static String text = ""; // atributo para añadir texto

    public static void main(String[] args) { // inicio del main
        // llamamos al metoodo getIdeoma para seleccionar el idioma
        MenuIdeoma.getIdeoma();
        // Comstante para saber si es morse o no
        final String morseLine = "-";
        final String morsePoint = "·";

        // inicio para poner codigo morse o natural
        System.out.println(Ideomas.get("Introduccion"));
        text = scan.nextLine();
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
            System.out.println(MorseCombert.getMorse(text));
        }
        // fin del if que dice si es morse o natural

    } // fin del main
} // fin de la clase Codigomorse
