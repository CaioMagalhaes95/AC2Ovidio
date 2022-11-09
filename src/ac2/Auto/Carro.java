
package ac2.Auto;

public class Carro implements Veiculo{
   String combustivel;
   String placa;
   double consumo;
   int qtdPortas;

    public Carro(String combustivel, String placa, double consumo, int qtdPortas) {
        this.combustivel = combustivel;
        this.placa = placa;
        this.consumo = consumo;
        this.qtdPortas = qtdPortas;
    }

      @Override
    public double consumo(double distanciaPercorrida, double valorCombustivel){
        return 0;
    }
    
    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
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
