package com.laioffer.laimarket;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.laioffer.laimarket.entity.User;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/json");
        ObjectMapper mapper = new ObjectMapper();
        User customer = new User();
        customer.setEmail("y19976122010@gmail.com");
        customer.setPassword("123456");
        // Hello
        response.getWriter().print(mapper.writeValueAsString(customer));
    }

    public void destroy() {
    }
}