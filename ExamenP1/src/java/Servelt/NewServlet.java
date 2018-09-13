/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servelt;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.http.HTTPException;

/**
 *
 * @author Alumno
 */
@WebServlet(name = "NewServlet", urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {
    private float num1;
    private float num2;
    private String con;
    
    public void doPost(ServletRequest peticion, ServletResponse respuesta)
            throws IOException, HTTPException
    {
        num1=Float.parseFloat(peticion.getParameter("Pesos"));
        con=peticion.getParameter("Cambio");
        
        if(con.equals("Dolares")){
            num2=num1/20;
        }
        else
            num2=num1*20;
        
        PrintWriter out= new PrintWriter(respuesta.getOutputStream());
        out.println("<html>");
        out.println("<head><title>Dame todo tu dinero</title></head><body>");
        out.println("<h2>Tu dinero en"+ con + "es: " + num2 + "</h2>");
        out.println("¡Gracias por gastar Dinero con nosotros!");
        out.println("</body");
        out.println("</html>");
    }

  

}
