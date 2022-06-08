package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ContadorVisitasServlet")
public class ContadorVisitasServlet extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //Declaramos variable contador
        
        int contador = 0;
        
        //Revisar en el arreglo de cookies si existe contadorVisitas
        Cookie[] cookies = request.getCookies();
        if(cookies != null){
            for(Cookie c : cookies){
                if(c.getName().equals("contadorVisitas")){
                    contador = Integer.parseInt(c.getValue());
                }
            }
        }
        
        //Increentar el contador en 1
        contador++;
        
        //Agregar la respuesta al navegador
        Cookie c = new Cookie("contadorVisitas", Integer.toString(contador));
        //la cookie se almacenara en el cliente por una hora(3600 seg)
        
        c.setMaxAge(3600);
        response.addCookie(c);
        
        //Mandamos el mensaje al navegador
        
        response.setContentType("text/html; charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        
        out.print("Contador de visitas de cada cliente: " + contador);
    }
}
