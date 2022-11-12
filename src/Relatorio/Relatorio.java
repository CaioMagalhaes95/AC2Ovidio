package Relatorio;
import Motorista.Motorista;
import Veiculos.Veiculos;
import Viagem.Viagem;

import java.util.*;

public class Relatorio {

  
    
    public static void Motorista(List<Motorista> motoristas)
    {
        
    Collections.sort(motoristas);
    for(Motorista m : motoristas)
            System.out.println(m);
    }
    
  public static void Viagens(List<Viagem> viagens)
  {
      Collections.sort(viagens);
      for(Viagem v: viagens)
          System.out.println(v);
  }
  
  public static void Veiculos(List<Veiculos> veiculos)
  {
      Collections.sort(veiculos);
      for(Veiculos c: veiculos)
          System.out.println(c);
  }

    
   
}
