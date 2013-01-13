/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.Color;
import java.awt.Graphics;
import java.io.Serializable;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Imagem implements Serializable {

    private JPanel painel;
    private Map<String, FiguraGeometrica> figuras = new HashMap<>();
    private FiguraGeometrica atual;

    public Imagem(JPanel panel) {
        painel = panel;
    }

    public Imagem() {
    }

    public void add(String classe) {
        try {
            atual = (FiguraGeometrica) Class.forName("modelo.primitivos." + classe).newInstance();
            figuras.put(atual.getNome(), atual);
            //atual.draw(painel.getGraphics());
            draw();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro, tente novamente", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void remove() {
        int n = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja deletar " + atual.getNome() + " ?",
                "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (n == 1) {
            return;
        }
        figuras.remove(atual);
        draw();
    }

    public void draw() {
        painel.getGraphics().clearRect(0, 0, 1000, 1000);
        for (FiguraGeometrica f : figuras.values()) {
            f.draw(painel.getGraphics());
        }
    }

    public void escala(float ex, float ey, Ponto pRef) {
        atual.escala(ex, ey, pRef);
    }

    public void translacao(float tx, float ty) {
        atual.translacao(tx, ty);
    }

    public void rotacao(double angulo, Ponto pRef) {
        atual.rotacao(angulo, pRef);
    }

    public FiguraGeometrica getAtual() {
        return atual;
    }

    public void setAtual(FiguraGeometrica atual) {
        this.atual = atual;
    }

    public void setAtual(String index) {
        this.atual = figuras.get(index);
    }

    public Map<String, FiguraGeometrica> getFiguras() {
        return figuras;
    }

    public void setFiguras(Map<String, FiguraGeometrica> figuras) {
        this.figuras = figuras;
    }

    public JPanel getPainel() {
        return painel;
    }

    public void setPainel(JPanel painel) {
        this.painel = painel;
    }

    public void calculaPontos() {
        if (atual == null) {
            return;
        }
        atual.calculaPontos();
    }

    public void solicitarDados() {
        if (atual == null) {
            return;
        }
        atual.solicitarDados();
    }

    public void draw(Graphics g) {
        for (FiguraGeometrica f : figuras.values()) {
            f.draw(g);
        }
    }
}
