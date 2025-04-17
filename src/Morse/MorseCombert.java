package Morse;

import java.util.Map;

import local.Ideomas;

public class MorseCombert {

    /**
     * @param text.toCharArray()
     * @return String
     */
    public static String getMorse(final String text) { // inicio del metodo getMorse
        // crea una instancia de la clase Morse para acceder al mapa de caracteres
        final Morse morseconvert = new Morse();
        // obtiene el mapa de caracteres y sus representaciones en Morse
        final Map<Character, String> morseMap = morseconvert.getMorseMap();
        // StringBuilder para almacenar el resultado en Morse
        final StringBuilder morseResult = new StringBuilder();
        // convertir cada caracter del texto a Morse
        for (final char c : text.toCharArray()) {
            if (morseMap.containsKey(c)) { // append = concatenar consume menos memoria
                morseResult.append(morseMap.get(c)).append(" "); // agregar espacio entre letras
            } else {
                morseResult.append("? "); // si el caracter no esta en el mapa, usar un marcador
            }
        }
        // convertir el resultado a String y agregar el texto en morse
        final String textf = (Ideomas.get("Textomorse") + morseResult);
        return textf; // devuelve el texto en morse
    } // fin del metodo getMorse
}
