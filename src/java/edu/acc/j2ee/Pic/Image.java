package edu.acc.j2ee.Pic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/images")
public class Image extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String filename = "C:/uploads/" + request.getParameter("image");

        File file = new File(filename);

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
