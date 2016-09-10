/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author João Batista
 */
@Local
public interface SorteadorMemoriaLocal {

    List<Integer> listarNumerosSorteados();

    void removeNumeroSorteado(int numero);

    void salvaNumeroSorteado(int minimo, int maximo);
    
}
