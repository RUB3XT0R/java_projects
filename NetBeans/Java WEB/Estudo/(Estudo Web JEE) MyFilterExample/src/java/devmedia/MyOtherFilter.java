/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package devmedia;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrador
 */
public class MyOtherFilter implements Filter {

    private static final boolean debug = true;

    public MyOtherFilter() {
    } 

    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain)
	throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        System.out.println("The image is "+req.getRequestURL());
        if (req.getRequestURL().toString().contains("aaa.jpg")) {
            res.sendRedirect("image.jsp");
        } else {
            chain.doFilter(request, response);
        }

    }
    
    /**
     * Destroy method for this filter 
     */
    public void destroy() { 
    }

    /**
     * Init method for this filter 
     */
    public void init(FilterConfig filterConfig) { 
    }


}
