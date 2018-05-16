/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abastracfactorymethod;

import Elfos.Elfos;
import Orcos.Orcos;
import Reinos.Reinos;

/**
 *
 * @author Karicha Valesska Romero Lobato 00002517
 */
public interface AbstractFactory {
    Orcos getOrcos(char type);

    Elfos getElfos(char type);

    Reinos getReinos(char type);
    
}
