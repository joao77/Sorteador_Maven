/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.Random;
import javax.ejb.Stateless;

@Stateless
public class Sorteado implements SorteadoLocal {

    @Override
    public int getNumero(int minimo, int maximo) {
        Random gerador = new Random();
        return gerador.nextInt((maximo - minimo)+1)+ minimo;
    }

   
}
