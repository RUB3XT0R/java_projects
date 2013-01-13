
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class MyFirstTag extends TagSupport implements java.io.Serializable{

    public MyFirstTag() {
        System.out.println("My Fist Tag Created !!!");
    }

    @Override
    public int doEndTag() throws JspException {
        System.out.println("My Tag has DONE !!!!");
        return super.doEndTag();
    }

    @Override
    public int doStartTag() throws JspException {
        JspWriter jspw = pageContext.getOut();
        try {
            jspw.write("<h1> Here is My Example from Tag !</h1>");
            jspw.write("<script>");
            jspw.write("alert(\'Hello from TagJavaScript\');");
            jspw.write("</script>");
        } catch (IOException ex) {
            Logger.getLogger(MyFirstTag.class.getName()).log(Level.SEVERE, null, ex);
        }

        return (SKIP_BODY);
    }



}
