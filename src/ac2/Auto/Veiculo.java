package ac2.Auto;

public interface Veiculo {
     
    //Retornar o gasto com combustível, dado a distância e o valor do combustível.
     public abstract double consumo(double distanciaPercorrida, double valorCombustivel);
     
     public abstract String getCombustivel();
     public abstract String getPlaca();
     public abstract double getConsumo();
     
     
}
