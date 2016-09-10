package web;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;


@Named
@SessionScoped
public class PaginaDaSorteBean  implements Serializable {

    @EJB(name = "sorteadorMemoriaBeans")
    private negocio.SorteadorMemoriaLocal sorteadorMemoriaBeans;

    private int num1;
    private int num2;
    private int resultado;
    private List<Integer>sorteados;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public void sortear() {
     
       sorteadorMemoriaBeans.salvaNumeroSorteado(num1, num2);
       resultado = sorteadorMemoriaBeans.listarNumerosSorteados().get(sorteadorMemoriaBeans.listarNumerosSorteados().size()-1);
       
    }

    public int getResultado() {
        return resultado;
    }
   
    public void removerNumeroSorteado(int numero){
     sorteadorMemoriaBeans.removeNumeroSorteado(numero);
    }

    public List<Integer> getSorteados() {
        sorteados = sorteadorMemoriaBeans.listarNumerosSorteados();
        return sorteados;
    }
        
}