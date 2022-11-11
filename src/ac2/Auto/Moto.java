package ac2.Auto;

public class Moto extends VeiculoClasse{
    
   int cilindrada;

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
    
 
    
}
