package Relatorios;
import Condutor.Condutor;
import ac2.Auto.VeiculoClasse;
import Viagem.Viagem;
import java.util.*;

public class Relatorios {

    
    List<Condutor> condutores;
    List<VeiculoClasse> veiculos;
    
    public void imprimeCondutores(){
     for(Condutor c : condutores){
            System.out.println(c.getNome());
        }
    }
    
    public  void imprimeVeiculos(){
        for(VeiculoClasse vc : veiculos){
            System.out.println(vc.getNome());
        }
    }
    
    public  void imprimeViagens(List<Viagem> v){
        
    }
    
}
