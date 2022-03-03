package Metodos;

public class Livro {
    private String pessoaLeitor;
    private String titulo;
    private int pagTotal;
    private int pagLida;

    public Livro(){}

    public Livro(String pessoaLeitor, String titulo, int pagTotal){
        this.pessoaLeitor = pessoaLeitor;
        this.titulo = titulo;
        this.pagTotal = pagTotal;
    }

    public String getPessoaLeitor() {
        return pessoaLeitor;
    }
    public void setPessoaLeitor(String pessoaLeitor) {
        this.pessoaLeitor = pessoaLeitor;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPagTotal() {
        return pagTotal;
    }
    public void setPagTotal(int pagTotal) {
        this.pagTotal = pagTotal;
    }

    public int getPagLida() {
        return pagLida;
    }
    public void setPagLida(int pagLida) {
        this.pagLida = pagLida;
    }

    public float getProgressoLivro(int pagLida){
        setPagLida(pagLida);
        System.out.println("Paginas do livro: "+getPagTotal());
        System.out.println("Pagina atual: "+getPagLida());
        return ((float)getPagLida() / (float)getPagTotal())*100;
    }
}
