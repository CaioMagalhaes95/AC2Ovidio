package ac2.Auto;

public class Caminhao extends VeiculoClasse{
  
   int qtdEixos;

    public Caminhao(int qtdEixos, String nome, String combustivel, String placa, double consumo) {
        super(nome, combustivel, placa, consumo);
        this.qtdEixos = qtdEixos;
    }

    

    public int getQtdEixos() {
        return qtdEixos;
    }

    public void setQtdEixos(int qtdEixos) {
        this.qtdEixos = qtdEixos;
    }

    
}
