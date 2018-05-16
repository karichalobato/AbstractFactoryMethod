
package Elfos;

import abastracfactorymethod.AbstractFactory;
import Orcos.Orcos;
import Reinos.Reinos;

/**
 *
 * @author Karicha Valesska Romero Lobato 00002517
 */
public class FactoryElfos implements AbstractFactory{

    @Override
    public Orcos getOrcos(char type) {
        return null;
    }

    @Override
    public Elfos getElfos(char type) {
        switch (type) {
            case 'K':
                return new Arquero();
            case 'V':
                return new Mago();
            case 'L':
                return new ReyElfo();
        }
        return null;
    }

    @Override
    public Reinos getReinos(char type) {
        return null;
    }
    
}
