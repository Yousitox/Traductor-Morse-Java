
// imports

import java.util.*;

import Menus.MenuIdeoma;
import Morse.MorseCombert;
import local.Ideomas;
import natural.NaturalCombert;

// fin impports

/**
 * Codigomorse es la clase principal del programa.
 * Esta clase se encarga de convertir texto natural a morse y viceversa.
 * 
 * @author Yousitox
 * @version 1.0
 */
public class Codigomorse { // inicio de la clase Codigomorse
    // Scanner
    public static Scanner scan = new Scanner(System.in);
    // atributo para añadir texto
    public static String text = ""; // atributo para añadir texto

    /**
     * @param text.contains(morsePoint)
     */
    public static void main(final String[] args) { // inicio del main
        // llamamos al metoodo getIdeoma para seleccionar el idioma
        MenuIdeoma.getIdeoma();

        // llamamos al metodo ponerTexto para poner el texto
        ponerTexto();

        // llamamos al metodo getNaturalMorse para saber si es morse o no
        getNaturalMorse(text);

    } // fin del main

    /**
     * @param text.contains(morsePoint)
     */
    private static void getNaturalMorse(String text) { // inicio del metodo getNaturalMorse
        // Comstante para saber si es morse o no
        final String morseLine = "-";
        final String morsePoint = "·";

        // convierte el texto en mayusculas
        text = text.toUpperCase();

        // inicio del if que dice si es codigo morse o natural
        if (text.contains(morseLine) || text.contains(morsePoint)) {
            System.out.println(Ideomas.get("Esmorse"));
            // llama al metodo getNatural para convertir el morse a texto natural
            System.out.println(NaturalCombert.getNatural(text));
        } else {
            System.out.println(Ideomas.get("Noesmorse"));
            // llama al metodo getmorse para convertir el texto a morse
            System.out.println(MorseCombert.getMorse(text));
        } // fin del if que dice si es morse o natural
    } // fin del metodo getNaturalMorse

    private static void ponerTexto() { // inicio del metodo ponerTexto
        // inicio para poner codigo morse o natural
        System.out.println(Ideomas.get("Introduccion"));
        text = scan.nextLine();
        System.out.println("-------------");
        // fin para poner codigo morse o natural
    } // fin del metodo ponerTexto
} // fin de la clase Codigomorse
