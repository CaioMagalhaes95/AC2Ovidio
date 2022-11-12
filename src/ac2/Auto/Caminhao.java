package ac2.Auto;

public class Caminhao extends VeiculoClasse{
  
    private int qtdEixos;

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

     @Override
    public String toString(){
        return "\nNome: " + this.nome + "\nTipo de Combustível: " + this.combustivel + "\nPlaca: " + this.placa
                + "\nEixos: + " + this.qtdEixos + "\nKm por litro: " + this.consumo;
    }
}
