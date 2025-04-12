package natural;

// inicio imports

import java.util.HashMap;
import java.util.Map;

// fin imports

public class Natural { // inicio clase Natural
        // atributo privado Natural
    // es un mapa que relaciona un caracter con su representacion en Natural
    private Map<String, Character> natural;

    // constructor de la clase Natural
    // inicializa el mapa Natural con los caracteres y sus representaciones en Natural
    public Natural() {
        natural = new HashMap<>();
        natural.put(".-", 'A');
        natural.put("-...", 'B');
        natural.put("-.-.", 'C');
        natural.put("-..", 'D');
        natural.put(".", 'E');
        natural.put("..-.", 'F');
        natural.put("--.", 'G');
        natural.put("....", 'H');
        natural.put("..", 'I');
        natural.put(".---", 'J');
        natural.put("-.-", 'K');
        natural.put(".-..", 'L');
        natural.put("--", 'M');
        natural.put("-.", 'N');
        natural.put("---", 'O');
        natural.put(".--.", 'P');
        natural.put("--.-", 'Q');
        natural.put(".-.", 'R');
        natural.put("...", 'S');
        natural.put("-", 'T');
        natural.put("..-", 'U');
        natural.put("...-", 'V');
        natural.put(".--", 'W');
        natural.put("-..-", 'X');
        natural.put("-.--", 'Y');
        natural.put("--..", 'Z');
    } // fin constructor

    // metodo que devuelve el mapa Natural
    // devuelve un mapa que relaciona un caracter con su representacion en Natural
    public Map<String, Character> getNaturalMap() {
        return natural;
    } //fin metodo
} // fin clase Natural
