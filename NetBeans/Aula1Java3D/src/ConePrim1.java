import com.sun.j3d.utils.geometry.Cone;
import javax.media.j3d.*;

public class ConePrim1 {
    public BranchGroup grafoDeCena(){
        BranchGroup bg = new BranchGroup(); // grupo de objetos
        Appearance app = new Appearance(); //descreve a aparencia
        app.setMaterial( new Material() );
        Material m = app.getMaterial(); //material da appearance
        m.setDiffuseColor(1.0f,0.0f,0.0f); // trocando a cor para rgb 1 0 0
        m.setShininess(10.f);  //brilho de 100%
        
        bg.addChild( new Cone(0.5f,0.2f, app) ); //new Cone(raio, altura, aparencia)
        
        return bg;
    }
    
}
