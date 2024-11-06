package geometria_v1;

public class FormaGeometrica {
    protected String cor;
    protected String descricao;

    public FormaGeometrica(){}

    public FormaGeometrica(String cor, String descricao) {
        this.cor = cor;
        this.descricao = descricao;
    }
    public void identificar(){
        System.out.println("Eu sou uma Forma Geométrica");
        System.out.println("Minha cor é "+cor);
        System.out.println("Minha descrição é "+descricao);
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
