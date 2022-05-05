package letra;


/**
 * Class Letra
 */
public class Letra {

    //
    // Fields
    //
    /**
     * "Es un caracter que almacena una letra"
     */
    public char letra;

    //
    // Constructors
    //
    //Herrera improvement public Letra () { };
    /**
     * "Es el constructor de la clase Letra"
     *
     * @param letra "El parametro letra sirve para asignar un valor al atributo
     * letra de la clase letra, es de tipo char"
     */
    public Letra(char letra) {
    }

    //
    // Methods
    //
    //
    // Accessor methods
    //
    /**
     * Fija el valor de letra "Es un caracter que almacena una letra"
     *
     * @param newVar el nuevo valor de letra
     */
    public void setLetra(char newVar) {
        letra = newVar;
    }

    /**
     * Devuelve el valor de letra "Es un caracter que almacena una letra"
     *
     * @return el valor de letra
     */
    public char getLetra() {
        return letra;
    }

    //
    // Other methods
    //
}
