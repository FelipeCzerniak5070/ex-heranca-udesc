package geometria_v1;

public class Quadrado extends FormaGeometrica {
    private int lado;

    public Quadrado(){}

    public Quadrado(int lado){
        this.lado = lado;
    }

    @Override
    public void identificar(){
        System.out.println("Eu sou um Quadrado");
        System.out.println("Minha cor é "+cor);
        System.out.println("Minha descrição é "+descricao);
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
}
