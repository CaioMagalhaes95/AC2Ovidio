package Viagem;


public class Viagem implements Comparable {
    
     private String condutor;
     private String veiculo;
     private String origem;
     private String destino;
     private double distancia;
     private int diarias;

    public Viagem(String origem, String destino, double distancia, String condutor, String veiculo, int diarias) {
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
        this.condutor = condutor;
        this.veiculo = veiculo;
        setDiarias(diarias);
         
    }

    public int getDiarias() {
        return diarias;
    }

    public void setDiarias (int diarias){
        
    if (diarias > 29)
            throw new RuntimeException("Tempo de trabalho excedido pela CLT");
        this.diarias = diarias;

    }


    
    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getCondutor() {
        return condutor;
    }

    public void setCondutor(String condutor) {
        this.condutor = condutor;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

     public double custo(double consumo, int diariasCondutor){
         double resultado = consumo + diariasCondutor;
         return resultado;
     }
     

    @Override
    public int compareTo(Object t) {
        Viagem primeiro = (Viagem) t;
        return (int)(this.diarias - primeiro.diarias);
    }
     
   
   public String toString(){
       return "\nViagens:\nCondutor: " + this.condutor + "\nVeiculo: " + this.veiculo + "\nOrigem: " + this.origem + "\nDestino: " + this.destino + "\nDistancia: " + this.distancia;
   }    
}
