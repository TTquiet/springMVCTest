package cn.dsscm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author cyf
 * @version 1.0
 */
@Controller
public class MyController {
    @RequestMapping("/test1")
    @ResponseBody
    public String test1(){
        return "HHHHHHH";
    }

    @RequestMapping("/test2")
    public String test2(Model model){
        model.addAttribute("msg","hhhh");
        return "index";
    }
}
