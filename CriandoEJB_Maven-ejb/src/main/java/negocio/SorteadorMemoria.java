/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;


@TransactionManagement(TransactionManagementType.BEAN)
@Stateful
public class SorteadorMemoria implements SorteadorMemoriaLocal {

    @EJB(name = "sorteadorBean")
    private SorteadoLocal sorteadorBean;
    int resultado;
    List<Integer> sorteados = new ArrayList<Integer>();
    
    @Override
    public List<Integer> listarNumerosSorteados() {
         return sorteados;
    }

    @Override
    public void removeNumeroSorteado(int numero) {
         sorteados.remove(numero);
    }

    @Override
    public void salvaNumeroSorteado(int minimo, int maximo) {
         sorteados.add(sorteadorBean.getNumero(minimo,maximo));
    }
  
}
