package top.zywork.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Wang Genshen on 2017-08-30.
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping(value = "index")
    public String index(Model model) {
        return "index";
    }

    @RequestMapping(value = "index1", produces = "text/plain;charset=utf-8")
    public String index1() {
        return "spring boot!";
    }
}
