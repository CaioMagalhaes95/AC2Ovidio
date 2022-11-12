package Condutor;


public class Condutor implements Comparable{

    protected String nome;
    protected double cpf;
    protected String datanasc;
    protected double salario;

    public Condutor(String nome, double cpf, String datanasc, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.datanasc = datanasc;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    public String getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(String datanasc) {
        this.datanasc = datanasc;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public int compareTo(Object t) {
        
        Condutor um = (Condutor) t;
        return (int) (this.cpf - um.cpf);
    }
    
    
    public String toString(){
        return "\nCondutores:\nNome: " + this.nome + "\nCPF: " + this.cpf + 
                "\nData de Nascimento: " + this.datanasc + "\nSalario: " + this.salario;
    }
    
    
}
