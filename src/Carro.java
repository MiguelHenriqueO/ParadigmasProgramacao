public class Carro{
    //Variaveis ou propriedades ou atributos
    public String marca, modelo; // String é um tipo de dado do tipo classe
    public float velocidade; // float é um tipo primitivo de dado
    public boolean motor; // boolean também é um tipo primitivo de dado

    //metodo que converte o objeto em String
    // this. representa o objeto que chama o metodo
    public String toString(){
        return "Marca: " + this.marca + " Modelo: " + this.modelo + " Velocidade: " + this.velocidade + " Motor: " + this.motor;
    }
}