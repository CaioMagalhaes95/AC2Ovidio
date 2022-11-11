package FolhaDePagamento;
import Condutor.Condutor;
import java.util.List;

public class FolhaDePagamento {
    
    public String mes;
    public int ano;
    List <Condutor> condutores;
    
    public FolhaDePagamento(List<Condutor> c){
        this.condutores = c;
    }
    
    public double totalAPagar(){
        double total = 0;
        for(Condutor c : condutores){
            total = total + c.getSalario();
        }
        return total;
    }
    
    public void imprimir(){
        for(Condutor c : condutores){
            System.out.println(c.getNome() + " " + c.getSalario());
        }
        totalAPagar();
    }
}
