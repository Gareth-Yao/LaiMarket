package com.laioffer.laimarket.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * com.laioffer.laimarket.controller
 *
 * @author Gareth Yao
 * @User y1997
 * @date 2021/12/17
 * <p>Description: </p>
 */

@Controller
public class SignInController {
    private final ObjectMapper objectMapper = new ObjectMapper();

    @RequestMapping(value = "/login")
    public void login(@RequestParam(value="error") String error, HttpServletResponse response) throws
            IOException {
        response.setStatus(HttpStatus.UNAUTHORIZED.value());
        Map<String, Object> data = new HashMap<>();
        data.put("message", "bad credentials");
        response.getOutputStream().println(objectMapper.writeValueAsString(data));
    }
}
