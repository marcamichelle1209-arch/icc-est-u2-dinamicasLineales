import java.util.ArrayDeque;

public class Ejercicio1 {
 
    ///
    /// Metodo que devuleve una cadena de
    /// texto invertida
    /// texto -> COMPUTACION
    /// return -> NOICATUPMOC
    /// USANDO SOLO PILAS
    public String invertString(String texto) {

        ArrayDeque<Character> pila = new ArrayDeque<>();
        texto.charAt(5);
 
        for (char letra : texto.toCharArray()) {
            pila.push(letra);
        } 
 
        String invertido = "";
 
        while (!pila.isEmpty()) {
            invertido += pila.pop();
        }
 
        return invertido;
    }
}
 
//que devuelva una cadena de texto invertida usando pilas