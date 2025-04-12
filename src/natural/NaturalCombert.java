package natural;

import java.util.Map;

import local.Ideomas;

public class NaturalCombert {
    public static String getNatural(String text) { // inicio del metodo getNatural
        // crea una instancia de la clase Natural para acceder al mapa de caracteres
        Natural naturalconvert = new Natural();
        // obtiene el mapa de caracteres y sus representaciones en Natural
        Map<String, Character> naturalMap = naturalconvert.getNaturalMap();
        // stringBuilder para almacenar el resultado en texto natural
        StringBuilder naturalResult = new StringBuilder();

        // divide el texto Morse en palabras (separadas por " ")
        String[] palabras = text.trim().split("\\s+"); // \\s+ = a sin limite de espacios
        // trim = elimina espacios en blanco al principio y al final del texto
        // split = divide el texto en partes usando un delimitador (en este caso, tres espacios)
        // split = devuelve un array de cadenas (String[])
        // iterar sobre cada palabra en Morse
        for (String palabra : palabras) {
            // divide la palabra en letras (separadas por un espacio)
            String[] letras = palabra.split(" ");

            // iterar sobre cada letra en Morse
            for (String letra : letras) {
                if (naturalMap.containsKey(letra)) {
                    // si la letra esta en el mapa, agregar su representacion en texto natural
                    naturalResult.append(naturalMap.get(letra));
                } else {
                    // si la letra no esta en el mapa agregar un marcador
                    naturalResult.append("?");
                }
            }
            // agregar un espacio entre palabras
            naturalResult.append(" ");
        }

        // convertir el resultado a String y agregar el texto en Natural
        String textf = Ideomas.get("Textonatural") + naturalResult;
        return textf; // devuelve el texto en Natural
    } // fin del metodo getNatural
}
