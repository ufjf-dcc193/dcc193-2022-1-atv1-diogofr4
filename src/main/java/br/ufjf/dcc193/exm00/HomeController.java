package br.ufjf.dcc193.exm00;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("index.html")
    public String home(){
        return "index.jsp";
    }
}
