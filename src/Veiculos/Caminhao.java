package Veiculos;

public class Caminhao extends Veiculos{
  
    private int Eixo;
    

    public Caminhao(int qtdEixos, String nome, String tipocombustivel, String placa, double kmlitros) {
        super(nome, tipocombustivel, placa, kmlitros);
        this.Eixo = Eixo;
    }

    

    public int getEixo() {
        return Eixo;
    }

    public void setEixo(int Eixo) {
        this.Eixo = Eixo;
    }

     @Override
    public String toString()
    {
        return "\nNome: " + this.nome + "\nTipo de Combustível: " + this.tipocombustivel + "\nPlaca: " + this.placa
              + "\nKm por litro: " + this.kmlitros   + "\nEixos: + " + this.Eixo;
    }
}
