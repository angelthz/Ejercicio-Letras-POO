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
    //Herrera improvement
    /**
     * "Es el constructor por defecto (vacio) la clase Letra"
     *  Añadido por ANGELTH
     */
    public Letra () { };
    /**
     * "Es el constructor de la clase Letra"
     *
     * @param letra "El parametro letra sirve para asignar un valor al atributo
     * letra de la clase letra, es de tipo char"
     * Angel TH añadio el constructor de la superclase Letra
     */
    public Letra(char letra) {
        this.letra = letra;
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
