package Aula01_20220215;


public class Funcionario {
    private String nome;
    private String sobrenome;
    private String cidade;
    private String estado;
    private int horasTrabalhadas;
    private double vlrHora;

    Funcionario(){}

    Funcionario(String nome, String sobrenome, String cidade, String estado, int horasTrabalhadas, double vlrHora){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cidade = cidade;
        this.estado = estado;
        this.horasTrabalhadas = horasTrabalhadas;
        this.vlrHora = vlrHora;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getVlrHora() {
        return vlrHora;
    }
    public void setVlrHora(double vlrHora) {
        this.vlrHora = vlrHora;
    }

    public void printNomeSobrenome() {
        System.out.println("Funcionario: "+getNome()+" "+getSobrenome());
    }

    public void incrementaHora(int horasTrabalhadas){
        System.out.println("Horas trabalhadas antes: "+getHorasTrabalhadas());
        System.out.println("Horas adicionadas "+horasTrabalhadas);
        this.horasTrabalhadas += horasTrabalhadas;
        System.out.println("Saldo final de Horas: "+getHorasTrabalhadas());
    }

    public void calcSalario(){
        printNomeSobrenome();
        double salario = getHorasTrabalhadas() * getVlrHora();
        System.out.println("Horas trabalhadas: "+getHorasTrabalhadas());
        System.out.println("Valor hora: R$"+getVlrHora());
        System.out.println("Salario final: R$"+salario);
    }
}
