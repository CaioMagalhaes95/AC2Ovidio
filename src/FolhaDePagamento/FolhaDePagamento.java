package FolhaDePagamento;
import Condutor.Condutor;
import java.util.*;


public class FolhaDePagamento{
    
    
  
    List <Condutor> condutores;
    Date data = new Date();

    public FolhaDePagamento(List<Condutor> condutores, Date data) {
        this.condutores = condutores;
       
    }

   

    
   

    public List<Condutor> getCondutores() {
        return condutores;
    }

    public void setCondutores(List<Condutor> condutores) {
        this.condutores = condutores;
    }
    
    
    
    public static double totalAPagar(List<Condutor> condutores){
        double total = 0;
        for(Condutor c : condutores){
            total = total + c.getSalario();
        }
        return total;
    
    }
    
    public static void imprimir(List<Condutor> condutores){
        
        for(Condutor c : condutores){
            System.out.println("\n" + c.getNome() + "\n " + c.getSalario());
            
        }
            System.out.println("Total à pagar: " + totalAPagar(condutores));
    }

  
}
