package modelo.primitivos;

import java.io.Serializable;
import javax.swing.JOptionPane;
import modelo.Ponto;

public class Quadrado extends Quadrilatero implements Serializable {

    public float getLado() {
        return largura;
    }

    public void setLado(float lado) {
        this.largura = lado;
        this.altura = lado;
    }

    @Override
    public void solicitarDados() {
        setNome(JOptionPane.showInputDialog(null, "Entre com o nome do quadrado:", "Criando o Quadrado", JOptionPane.QUESTION_MESSAGE));
        String val = JOptionPane.showInputDialog(null, "Entre com o lado do quadrado:", "Criando o Quadrado", JOptionPane.QUESTION_MESSAGE);
        this.largura = Float.parseFloat(val);
        this.altura = Float.parseFloat(val);
    }
}
