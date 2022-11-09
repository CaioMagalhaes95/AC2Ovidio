package ac2.Auto;

public class Moto implements Veiculo{
   int cilindrada;
   String combustivel;
   String placa;
   double consumo;

    public Moto(int cilindrada, String combustivel, String placa, double consumo) {
        this.cilindrada = cilindrada;
        this.combustivel = combustivel;
        this.placa = placa;
        this.consumo = consumo;
    }
    
   
   
    @Override
    public double consumo(double distanciaPercorrida, double valorCombustivel){
        return 0;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
    
    
    
    
    public int getCilindrada(){
        return cilindrada;
    }
    
   @Override
    public String getCombustivel(){
        return combustivel;
    }
    
    @Override
    public String getPlaca(){
        return placa;
    }
    
    @Override
    public double getConsumo(){
        return consumo;
    }
    
}
