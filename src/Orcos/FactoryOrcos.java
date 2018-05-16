
package Orcos;
import Elfos.Elfos;
import abastracfactorymethod.AbstractFactory;
import Reinos.Reinos;
/**
 *
 * @author Karicha Valesska Romero Lobato 00002517
 */
public class FactoryOrcos implements AbstractFactory {

    @Override
    public Orcos getOrcos(char type) {
        switch (type) {
            case 'A':
                return new Lanzador();
            case 'B':
                return new Hechicero();
            case 'C':
                return new BestiaMayor();
        }
        return null;
    }

    @Override
    public Elfos getElfos(char type) {
        return null;
    }

    @Override
    public Reinos getReinos(char type) {
        return null;
    }
    
}
