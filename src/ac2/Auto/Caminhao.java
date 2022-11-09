package ac2.Auto;

public class Caminhao implements Veiculo{
   String combustivel;
   String placa;
   double consumo;
   int qtdEixos;

    public Caminhao(String combustivel, String placa, double consumo, int qtdEixos) {
        this.combustivel = combustivel;
        this.placa = placa;
        this.consumo = consumo;
        this.qtdEixos = qtdEixos;
    }

    public int getQtdEixos() {
        return qtdEixos;
    }

    public void setQtdEixos(int qtdEixos) {
        this.qtdEixos = qtdEixos;
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
    public double consumo(double distanciaPercorrida, double valorCombustivel){
        return 0;
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
