package ac2;

import Veiculos.Carros;
import Veiculos.Caminhao;
import Veiculos.Motos;
import Viagem.Viagem;
import Relatorio.Relatorio;
import Pagamento.Pagamento;
import Motorista.Motorista;
import Veiculos.Veiculos;
import java.util.*;


public class AC2 {

    public static void main(String[] args) {
       List<Viagem> viagens = new ArrayList<>();
       List<Motorista> motoristas = new ArrayList<>();
       List<Veiculos> veiculos = new ArrayList<>();

              
      viagens.add(new Viagem("", "", , "", "", ));
      viagens.add(new Viagem("Capela do Alto", "Sorocaba", 47.0, "Gabriel", "Renegade", 15));
       
       motoristas.add(new Motorista("", , "", ));
       motoristas.add(new Motorista("Gabriel", 789789789.12, "16032001", 78000));
       
       veiculos.add(new Carros(4, "Fiestinha", "Gasolina", "CN0P234", 12.4));
       veiculos.add(new Carros(4, "Renegade", "Flex", "cnpq0123", 10.0));
       veiculos.add(new Caminhao(2, "truck", "Diesel", "EpL3Q12", 4.0));
       veiculos.add(new Motos(160, "CG", "Gasolina", "BCM2Q123", 32.1));
       veiculos.add(new Motos(200, "F", "Eletrica", "DDD3D333", 40.0));
       
       
       Veiculos vc = new Carros(2, "Fusquinha", "Gasolina", "FDX3R189", 12.0);
       Veiculos mt = new Motos(160, "CB", "Gasolina", "BXMt234", 32.0);
       Veiculos cm = new Caminhao(4, "Scania", "Diesel", "EPL3E23", 3.86);
       
        System.out.println("Valor da viagem: " + vc.consumodeviagem(70, 4.59));
        System.out.println("Valor da Viagem: " + mt.consumodeviagem(160, 4.17));
        System.out.println("Valor da Viagem: " + cm.consumodeviagem(200, 7.78));
       
       Viagem vg = new Viagem("Campinas", "Flores", 2000.0, "Thiagão", "Golzinho", 20);
       System.out.println("Custo da viagem: " + vg.custo(70, 15));
        
       Relatorio.Veiculos(veiculos);
       Relatorio.Viagens(viagens);
       Relatorio.Motorista(motoristas);
       
       Pagamento.print(motoristas);
       
        
    }
    
}
