package com.cavisson.eserv;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;



@WebServlet(urlPatterns = "/asyncExample", asyncSupported = true)
public class DAsyncServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        
        AsyncContext asyncContext = request.startAsync();
        
       
        asyncContext.setTimeout(5000);

        
        asyncContext.start(() -> {
            try {
                
                Thread.sleep(3000);  
                
                
                String host = request.getServerName();
                int port = request.getServerPort();

               
                PrintWriter out = asyncContext.getResponse().getWriter();
                out.println("Async response from servlet after delay!");
                out.println("Host: " + host);
                out.println("Port: " + port);
                
                
                asyncContext.complete();
                
                System.out.println("==================================");
                
            } catch (Exception e) {	
                e.printStackTrace();
                asyncContext.complete();
            }
        });
        
        
    }
}