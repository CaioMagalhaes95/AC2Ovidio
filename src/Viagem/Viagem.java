package Viagem;


public class Viagem implements Comparable {
     private String condutor;
     private String veiculo;
     private String cidadeOrigem;
     private String cidadeDestino;
     private double distancia;
     private double diariasCondutor;

    public Viagem(String cidadeOrigem, String cidadeDestino, double distancia, String condutor, String veiculo) {
        this.cidadeOrigem = cidadeOrigem;
        this.cidadeDestino = cidadeDestino;
        this.distancia = distancia;
        this.condutor = condutor;
        this.veiculo = veiculo;
       
         
    }

    public double getDiariasCondutor() {
        return diariasCondutor;
    }

    public void setDiariasCondutor (double diariasCondutor){
       
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
    
    public double calcularDiarias(double distancia){
        double numerodiarias = distancia / 700;
        return numerodiarias;
    }

     public String custo(double consumoporkm, double valorCombustivel, double distancia){
         
         double resultado = (distancia / consumoporkm) * valorCombustivel;
         return "Custo de viagem: " + resultado + " Diarias: " + calcularDiarias(distancia);
     }
     

    @Override
    public int compareTo(Object t) {
        Viagem um = (Viagem) t;
        return (int)(this.diariasCondutor - um.diariasCondutor);
    }
     
   
   public String toString(){
       return "\nViagens:\nCondutor: " + this.condutor + "\nVeiculo: " + this.veiculo
               + "\nOrigem: " + this.cidadeOrigem + "\nDestino: " + this.cidadeDestino + "\nDistancia: " + this.distancia;
   }    
}
