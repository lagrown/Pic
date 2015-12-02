package edu.acc.j2ee.Pic;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import java.util.List;

import javax.servlet.ServletConfig;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;

import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class Upload extends HttpServlet {

    private final String UPLOAD_DIRECTORY = "C:/uploads";

    @Override

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        File fileSaveDir = new File(UPLOAD_DIRECTORY);
        if (!fileSaveDir.exists()) {
            fileSaveDir.mkdir();
        }

        if (ServletFileUpload.isMultipartContent(request)) {

            try {

                List<FileItem> multiparts = new ServletFileUpload(
                        new DiskFileItemFactory()).parseRequest(request);

                for (FileItem photo : multiparts) {

                    if (!photo.isFormField()) {

                        String name = new File(photo.getName()).getName();

                        photo.write(new File(UPLOAD_DIRECTORY + File.separator + name));

                        getServletContext().getInitParameter("UPLOAD_DIRECTORY");
                        request.setAttribute("filename", name);

                    }

                    request.setAttribute("message", "Photo Uploaded Successfully");

                }
            } catch (Exception ex) {

                request.setAttribute("message", "Photo Upload Failed due to " + ex);
            }

        } else {

            request.setAttribute("message",
                    "Upload for photos");

        }
        request.getRequestDispatcher("/result.jsp").forward(request, response);
    }

}
