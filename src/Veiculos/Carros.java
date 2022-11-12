
package Veiculos;

public class Carros extends Veiculos implements Comparable{
  
   private int portas;

    public Carros(int qtdPortas, String nome, String tipocombustivel, String placa, double kmlitros) {
        super(nome, tipocombustivel, placa, kmlitros);
        this.portas = qtdPortas;
    }

   
    public int getQuantidadePortas() {
        return portas;
    }

    public void setQuantidadePortas(int portas) {
        this.portas = portas;
    }
    
   
    
    @Override
    public String toString(){
        return "\nNome: " + this.nome + "\nTipo de Combustível: " + this.tipocombustivel + "\nPlaca: " + this.placa    + "\nPortas: " + this.portas + "\nKm por litro: " + this.kmlitros;
             
    }
    
   
}
