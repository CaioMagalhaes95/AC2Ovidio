package Viagem;


import ac2.Auto.Carro;
import ac2.Auto.VeiculoClasse;
import Condutor.Condutor;

public class Viagem implements Comparable {

     String cidadeOrigem;
     String cidadeDestino;
     double distancia;
     
     public void custo(double consumo, int diariasCondutor){
         double resultado = consumo + diariasCondutor;
     }
     
     VeiculoClasse v = new Carro(4, "Fiestinha", "Flex", "AQ0J84", 12.3);
     Condutor c = new Condutor("Caio", 456456456, "1995-08-10", 2000);
     
       
}
