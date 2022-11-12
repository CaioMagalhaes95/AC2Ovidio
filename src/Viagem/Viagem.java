package Viagem;


public class Viagem implements Comparable {
     private String condutor;
     private String veiculo;
     private String cidadeOrigem;
     private String cidadeDestino;
     private double distancia;
     private int diariasCondutor;

    public Viagem(String cidadeOrigem, String cidadeDestino, double distancia, String condutor, String veiculo, int diariasCondutor) {
        this.cidadeOrigem = cidadeOrigem;
        this.cidadeDestino = cidadeDestino;
        this.distancia = distancia;
        this.condutor = condutor;
        this.veiculo = veiculo;
        setDiariasCondutor(diariasCondutor);
         
    }

    public int getDiariasCondutor() {
        return diariasCondutor;
    }

    public void setDiariasCondutor (int diariasCondutor){
        
    if (diariasCondutor > 29)
            throw new RuntimeException("Tempo de trabalho excedido pela CLT");
        this.diariasCondutor = diariasCondutor;

    }


    
    public String getCidadeOrigem() {
        return cidadeOrigem;
    }

    public void setCidadeOrigem(String cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }

    public String getCidadeDestino() {
        return cidadeDestino;
    }

    public void setCidadeDestino(String cidadeDestino) {
        this.cidadeDestino = cidadeDestino;
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
        Viagem um = (Viagem) t;
        return (int)(this.diariasCondutor - um.diariasCondutor);
    }
     
   
   public String toString(){
       return "\nViagens:\nCondutor: " + this.condutor + "\nVeiculo: " + this.veiculo + "\nOrigem: " + this.cidadeOrigem + "\nDestino: " + this.cidadeDestino + "\nDistancia: " + this.distancia;
   }    
}
