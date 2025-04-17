package local;

import java.util.Locale;
import java.util.ResourceBundle;

public class Ideomas { // inicio clase ideomas
    // atributo estatica accesible desde todo el programa
    private static ResourceBundle idiomas;

    /**
     * @param tag
     */
    // metodo puvlica y estatica para cargar el ideoma
    // esto para poder llamarlo en cualquier archivo de forma cencilla
    public static void cargar(String tag) {
        Locale locale = Locale.forLanguageTag(tag);
        idiomas = ResourceBundle.getBundle("local.mensajes", locale);
    }// fin de la metodo para cargar ideomas

    /**
     * @param clave
     * @return String
     */
    // metodo publica estatica
    /*
     * Lo que hac esta metodo es retornar
     * idiomas, es el atributo,
     * getStrig es la forma de obtener la clave
     * esto hace que, cuando pongamos
     * Ideomas.get("Clave del archivo ejemp("Introduccion")")
     * pondra dependiado del idioma seleccionado
     * la cadeda de texto que tiene la clave Introduccion
     */

    public static String get(String clave) {
        return idiomas.getString(clave);
    }
} // fin clase ideomas
