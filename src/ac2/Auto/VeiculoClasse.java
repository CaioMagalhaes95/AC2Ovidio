
package ac2.Auto;

public abstract class VeiculoClasse implements Veiculo, Comparable {
   protected String nome;
   protected String combustivel;
   protected String placa;
   protected double consumo;

    public VeiculoClasse(String nome, String combustivel, String placa, double consumo) {
        this.nome = nome;
        this.combustivel = combustivel;
        this.placa = placa;
        this.consumo = consumo;
    }
 
   @Override
    public String getNome(){
        return nome;
    }
    
   @Override
    public void setNome(String nome){
        this.nome = nome;
    }
    
   @Override
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

   @Override
    public void setPlaca(String placa) {
        this.placa = placa;
    }

   
    @Override
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

    @Override
    public double consumo(double distanciaPercorrida, double valorCombustivel) {
        double consumoViagem = (distanciaPercorrida / this.consumo) * valorCombustivel;
     return consumoViagem;
    }

    @Override
    public int compareTo(Object t) {
     return nome.compareTo(nome);
    }
   
}
