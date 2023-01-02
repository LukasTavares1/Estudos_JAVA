package entidades;

public class Pessoa {
    
    private float peso;
    private float altura;
    
    public float calcularIMC(){
        float imc = getPeso() / (getAltura() * getAltura());
        return imc;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
}
