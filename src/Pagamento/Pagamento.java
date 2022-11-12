package Pagamento;
import Motorista.Motorista;
import java.util.*;


public class Pagamento{
    
  
    List <Motorista> motoristas;
    

    public Pagamento(List<Motorista> motoristas)
    {
        this.motoristas = motoristas;
       
    }

   

    public List<Motorista> getMotoristas() 
    {
        return motoristas;
    }

    public void setMotorista(List<Motorista> motoristas)
    {
        this.motoristas = motoristas;
    }
    
    
    
    public static double total(List<Motorista> motoristas)
    {
        double total = 0;
        for(Motorista m : motoristas){
            total = total + m.getPagamento();
        }
        return total;
    
    }
    
    public static void print(List<Motorista> motoristas)
    {
        
        for(Motorista c : motoristas)
        {
            System.out.println(c.getNome() + " " + c.getPagamento());
            
        }
            System.out.println("Total:" + total(motoristas));
    }

  
}
