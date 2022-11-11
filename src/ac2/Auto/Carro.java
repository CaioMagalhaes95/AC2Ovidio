
package ac2.Auto;

public class Carro extends VeiculoClasse{
  
   int qtdPortas;

    public Carro(int qtdPortas, String nome, String combustivel, String placa, double consumo) {
        super(nome, combustivel, placa, consumo);
        this.qtdPortas = qtdPortas;
    }

   

    
    
    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }
   
}
