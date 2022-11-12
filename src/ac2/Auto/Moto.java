package ac2.Auto;

public class Moto extends VeiculoClasse implements Comparable{
    
   private int cilindrada;

    public Moto(int cilindrada, String nome, String combustivel, String placa, double consumo) {
        super(nome, combustivel, placa, consumo);
        this.cilindrada = cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
   
    
  
    public int getCilindrada(){
        return cilindrada;
    }
    
  
 
    @Override
    public String toString(){
        return "\nNome: " + this.nome + "\nTipo de Combustível: " + this.combustivel + "\nPlaca: " + this.placa
                + "\nCilindradas: " + this.cilindrada + "\nKm por litro: " + this.consumo;
    }
    
}
