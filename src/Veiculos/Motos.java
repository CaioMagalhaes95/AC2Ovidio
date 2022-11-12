package Veiculos;

public class Motos extends Veiculos implements Comparable{
    
   private int cilindrada;

    public Motos(int cilindrada, String nome, String tipocombustivel, String placa, double kmlitros) {
        super(nome, tipocombustivel, placa, kmlitros);
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
        return "\nNome: " + this.nome + "\nTipo de Combustível: " + this.tipocombustivel + "\nPlaca: " + this.placa + "\nCilindradas: " + this.cilindrada + "\nKm por litro: " + this.kmlitros;
                
    }
    
}
