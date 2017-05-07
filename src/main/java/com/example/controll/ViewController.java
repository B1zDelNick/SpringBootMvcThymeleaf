package com.example.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
public class ViewController
{
    private static final String INDEX_VIEW = "index";

    @GetMapping("/")
    public ModelAndView index(ModelAndView view)
    {
        view.setViewName(INDEX_VIEW);
        view.addObject("datetime", new Date());
        view.addObject("username", "B1zDelNick");
        view.addObject("mode", "dev");

        return view;
    }
}
