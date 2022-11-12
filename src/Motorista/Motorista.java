package Motorista;


public class Motorista implements Comparable
{

    protected String nome;
    protected double cpf;
    protected String data;
    protected double pagamento;

    public Motorista(String nome, double cpf, String data, double pagamento) 
    {
        this.nome = nome;
        this.cpf = cpf;
        this.data = data;
        this.pagamento = pagamento;
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getPagamento() {
        return pagamento;
    }

    public void setPagamento(double pagamento) {
        this.pagamento = pagamento;
    }

    @Override
    public int compareTo(Object t) 
    {
        
        Motorista um = (Motorista) t;
        return (int) (this.cpf - um.cpf);
    }
    
    
    public String toString()
    {
        return "\nNome: " + this.nome + "\nCPF: " + this.cpf + 
                "\nNascimento: " + this.data + "\nPagamento: " + this.pagamento;
    }
    
    
}
