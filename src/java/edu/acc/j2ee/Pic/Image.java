package edu.acc.j2ee.Pic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.io.FilenameUtils;

//@WebServlet("/images")
public class Image extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

     
       
        String filename = "C:/uploads/";
    
       String name = FilenameUtils.getBaseName(filename);
        String extension = FilenameUtils.getExtension(filename);
        String path = filename + name + "." + extension;
     
 
        File file = new File(path);
        response.setContentLength((int) path.length());
        
        
        
        

        try (FileInputStream in = new FileInputStream(file); OutputStream out = response.getOutputStream()) {

            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) >= 0) {
                out.write(buffer, 0, length);
            }
            
            out.close();
            in.close();

        } catch (Exception e) {
            request.setAttribute("message", e);
        }

    }

}
