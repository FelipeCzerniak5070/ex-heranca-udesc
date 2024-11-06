package geometria_v1;

public class Retangulo extends FormaGeometrica{
    private int base;
    private int altura;

    public Retangulo(){}

    public Retangulo(String cor, String descricao, int base, int altura) {
        this.cor=cor;
        this.descricao=descricao;
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void identificar(){
        System.out.println("Retangulo");
        System.out.println("Cor: "+cor);
        System.out.println("Descricao: "+descricao);
    }


    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
