package edu.acc.j2ee.Pic;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;

public class View extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String file = "C:/uploads/";

        List imageList = new ArrayList();
        File uploads = new File(file);
        for (File imageFile : uploads.listFiles()) {
            String imagefileName = imageFile.getName();

            imageList.add(imagefileName);
          

        }
        request.setAttribute("imageList", imageList);

        request.getRequestDispatcher("/view.jsp").forward(request, response);

    }
}


