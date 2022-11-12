package Relatorios;
import Condutor.Condutor;
import ac2.Auto.VeiculoClasse;
import Viagem.Viagem;

import java.util.*;

public class Relatorios {

  
    
    public static void imprimeCondutores(List<Condutor> condutores){
        
    Collections.sort(condutores);
    for(Condutor c : condutores)
            System.out.println(c);
    }
    
  public static void imprimeViagem(List<Viagem> viagens){
      Collections.sort(viagens);
      for(Viagem v: viagens)
          System.out.println(v);
  }
  
  public static void imprimeVeiculo(List<VeiculoClasse> veiculos){
      Collections.sort(veiculos);
      for(VeiculoClasse vc: veiculos)
          System.out.println(vc);
  }

    
   
}
