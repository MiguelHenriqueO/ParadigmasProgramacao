import javax.swing.*;

public class TestaCarro {
    public static void main(String[] args) {

        String marca = JOptionPane.showInputDialog(null, "Marca do carro: ");
        String modelo = JOptionPane.showInputDialog(null, "Modelo do carro: ");
        float velocidade = Float.parseFloat(JOptionPane.showInputDialog(null, "Velocidade do carro: "));
        boolean motor = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "Motor ligado: "));

        Carro carro = new Carro(marca, modelo, velocidade, motor);
        carro.mostrarModelo();



        /*System.out.println("Hello World");


        // instanciar objeto obj1
        Carro obj1 = new Carro();
        obj1.marca = "Fiat";
        obj1.modelo = "Uno";
        obj1.velocidade = 0;
        obj1.motor = false;
        System.out.println(obj1.toString());

        //instanciar objeto obj2
        Carro obj2 = new Carro();
        obj2.marca = "GM";
        obj2.modelo = "Onix";
        obj2.velocidade = 0;
        obj2.motor = false;
        System.out.println(obj2.toString());*/

    }
}
