package abastracfactorymethod;
import Elfos.FactoryElfos;
import Orcos.FactoryOrcos;
import Reinos.FactoryReinos;

/**
 *
 * @author Karicha Valesska Romero Lobato 00002517
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(char type) {
        switch (type) {
            case 'E':
                return new FactoryElfos();
            case 'O':
                return new FactoryOrcos();
            case 'R':
                return new FactoryReinos();
        }
        return null;
    }
}
