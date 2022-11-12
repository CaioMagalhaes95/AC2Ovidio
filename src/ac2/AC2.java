package ac2;
import Viagem.Viagem;
import Relatorios.Relatorios;
import FolhaDePagamento.FolhaDePagamento;
import Condutor.Condutor;
import ac2.Auto.*;
import java.util.*;


public class AC2 {

    public static void main(String[] args) {
       List<Viagem> viagens = new ArrayList<>();
       List<Condutor> condutores = new ArrayList<>();
       List<VeiculoClasse> veiculos = new ArrayList<>();

              
      viagens.add(new Viagem("Sao Roque", "Sorocaba", 70.0, "Caio", "Fiestinha", 20));
      viagens.add(new Viagem("Capela do Alto", "Sorocaba", 47.0, "Gabriel", "Renegade", 15));
       
       condutores.add(new Condutor("Caio", 456456456.89, "10081995", 60000));
       condutores.add(new Condutor("Gabriel", 789789789.12, "16032001", 78000));
       
       veiculos.add(new Carro(4, "Fiestinha", "Gasolina", "CN0P234", 12.4));
       veiculos.add(new Carro(4, "Renegade", "Flex", "cnpq0123", 10.0));
       veiculos.add(new Caminhao(2, "truck", "Diesel", "EpL3Q12", 4.0));
       veiculos.add(new Moto(160, "CG", "Gasolina", "BCM2Q123", 32.1));
       veiculos.add(new Moto(200, "F", "Eletrica", "DDD3D333", 40.0));
       
       
       VeiculoClasse vc = new Carro(2, "Fusquinha", "Gasolina", "FDX3R189", 12.0);
       VeiculoClasse mt = new Moto(160, "CB", "Gasolina", "BXMt234", 32.0);
       VeiculoClasse cm = new Caminhao(4, "Scania", "Diesel", "EPL3E23", 3.86);
       
        System.out.println("Valor da viagem: " + vc.consumo(70, 4.59));
        System.out.println("Valor da Viagem: " + mt.consumo(160, 4.17));
        System.out.println("Valor da Viagem: " + cm.consumo(200, 7.78));
       
       Viagem vg = new Viagem("Campinas", "Flores", 2000.0, "Thiagão", "Golzinho", 20);
       System.out.println("Custo da viagem: " + vg.custo(70, 15));
        
       Relatorios.imprimeVeiculo(veiculos);
       Relatorios.imprimeViagem(viagens);
       Relatorios.imprimeCondutores(condutores);
       
       FolhaDePagamento.imprimir(condutores);
       
        
    }
    
}
