package ac2.Auto;

public interface Veiculo {
     
    
     public abstract double consumo(double distanciaPercorrida, double valorCombustivel);
     
     public abstract String getNome();
     public abstract String getCombustivel();
     public abstract String getPlaca();
     public abstract double getConsumo();
     
     public abstract void setNome(String nome);
     public abstract void setCombustivel(String combustivel);
     public abstract void setPlaca(String placa);
     public abstract void setConsumo(double consumo);
     
     
}
