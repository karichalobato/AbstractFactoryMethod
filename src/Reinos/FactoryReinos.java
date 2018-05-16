package Reinos;

import Orcos.Orcos;
import Elfos.Elfos;
import abastracfactorymethod.AbstractFactory;

/**
 *
 * @author Karicha Valesska Romero Lobato 00002517
 */
public class FactoryReinos implements AbstractFactory {

    @Override
    public Orcos getOrcos(char type) {
        return null;
    }

    @Override
    public Elfos getElfos(char type) {
        return null;
    }

    @Override
    public Reinos getReinos(char type) {
        return new Reino();
    }

}
