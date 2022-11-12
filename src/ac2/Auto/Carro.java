
package ac2.Auto;

public class Carro extends VeiculoClasse implements Comparable{
  
   private int qtdPortas;

    public Carro(int qtdPortas, String nome, String combustivel, String placa, double consumo) {
        super(nome, combustivel, placa, consumo);
        this.qtdPortas = qtdPortas;
    }

   
    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }
    
   
    
    @Override
    public String toString(){
        return "\nNome: " + this.nome + "\nTipo de Combustível: " + this.combustivel + "\nPlaca: " + this.placa
                + "\nPortas: " + this.qtdPortas + "\nKm por litro: " + this.consumo;
    }
    
   
}
