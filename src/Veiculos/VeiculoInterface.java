package Veiculos;

public interface VeiculoInterface {
     
    
     public abstract double consumodeviagem (double distancia, double valorLitro);
     
     public abstract String getNome();
     public abstract String getTipoCombustivel();
     public abstract String getPlaca();
     public abstract double getKmLitros();
     
     public abstract void setNome(String nome);
     public abstract void setTipoCombustivel(String combustivel);
     public abstract void setPlaca(String placa);
     public abstract void setKmLitros(double consumo);
     
     
}
