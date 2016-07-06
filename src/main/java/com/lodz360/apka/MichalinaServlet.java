package com.lodz360.apka;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by michalina on 06/07/16.
 */
public class MichalinaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServletOutputStream outputStream = resp.getOutputStream();
        outputStream.println("<bold>Michalina Bartosik</bold>");




    }
}
