
package Veiculos;


public class Veiculos implements VeiculoInterface, Comparable {
    
   protected String nome;
   protected String tipocombustivel;
   protected String placa;
   protected double kmlitros;

    public Veiculos(String nome, String tipocombustivel, String placa, double kmlitros) {
        this.nome = nome;
        this.tipocombustivel = tipocombustivel;
        this.placa = placa;
        this.kmlitros = kmlitros;
    }
 


    @Override
    public int compareTo(Object t) {
     return nome.compareTo(nome);
    }

    @Override
    public double consumodeviagem(double distancia, double valorLitro) 
    {
        double consumodeviagem = (distancia / kmlitros) * valorLitro;
        return consumodeviagem;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getTipoCombustivel() {
        return tipocombustivel;
    }

    @Override
    public String getPlaca() {
        return placa;
    }

    @Override
    public double getKmLitros() {
       return kmlitros;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setTipoCombustivel(String tipocombustivel) {
        this.tipocombustivel = tipocombustivel;
    }

    @Override
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public void setKmLitros(double kmlitros) {
        this.kmlitros = kmlitros;
    }
   
}
