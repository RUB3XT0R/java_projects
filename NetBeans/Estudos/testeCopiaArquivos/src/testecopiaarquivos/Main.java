

package testecopiaarquivos;


import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.RenderedImage;
import java.io.*;
import javax.imageio.ImageIO;
public class Main {
public static void main(String[] args) throws Exception {
       byte[] foto = null;
       BufferedImage imagem = ImageIO.read(new File("C:/Users/Lucas Biason/Pictures/teste.jpg"));
       ImageIO.write(imagem,"JPG",new File("G:/Lucky Biason Files/Trabalhos/Java/testeCopiaArquivos/src/imagens/teste.jpg"));
    }

}
