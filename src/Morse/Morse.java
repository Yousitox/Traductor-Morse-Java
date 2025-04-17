package Morse;

// inicio imports

import java.util.*;

import local.Ideomas;

// fin imports

public class Morse {
    // atributo privado morse
    // es un mapa que relaciona un caracter con su representacion en morse
    private final Map<Character, String> morse;

    // constructor de la clase Morse
    // inicializa el mapa morse con los caracteres y sus representaciones en morse
    public Morse() {
        morse = new HashMap<>();
        morse.put('A', ".-");
        morse.put('B', "-...");
        morse.put('C', "-.-.");
        morse.put('D', "-..");
        morse.put('E', ".");
        morse.put('F', "..-.");
        morse.put('G', "--.");
        morse.put('H', "....");
        morse.put('I', "..");
        morse.put('J', ".---");
        morse.put('K', "-.-");
        morse.put('L', ".-..");
        morse.put('M', "--");
        morse.put('N', "-.");
        morse.put('Ñ', Ideomas.get("Novalor"));
        morse.put('O', "---");
        morse.put('P', ".--.");
        morse.put('Q', "--.-");
        morse.put('R', ".-.");
        morse.put('S', "...");
        morse.put('T', "-");
        morse.put('U', "..-");
        morse.put('V', "...-");
        morse.put('W', ".--");
        morse.put('X', "-..-");
        morse.put('Y', "-.--");
        morse.put('Z', "--..");
    } // fin constructor

    /**
     * @return Map<Character, String>
     */
    // metodo que devuelve el mapa morse
    // devuelve un mapa que relaciona un caracter con su representacion en morse
    public Map<Character, String> getMorseMap() {
        return morse;
    } // fin metodo
}
