package letras;

import letra.Letra;
import letra.Printable;


/**
 * Class A
 * Es la clase correspondiente a un objeto de tipo letra A
 */
public class A extends Letra implements Printable {

    //
    // Fields
    //
    //
    // Constructors
    //
    //Herrera improvement public A () { };
    /**
     * Es el constructor de la clase A
     *
     * @param letra Paramtro que recibe el constructor de la clase A
     */
    public A(char letra) {
        super(letra);
    }

    //
    // Methods
    //
    //
    // Accessor methods
    //
    //
    // Other methods
    //
    /**
     * Implementacion del metodo Print de la interface Printable
     */
    @Override
    public void print() {
    }

}
