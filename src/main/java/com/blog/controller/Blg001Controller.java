package com.blog.controller;

import com.blog.model.User;
import com.blog.service.Blg001Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ログインController
 */
@Controller
public class Blg001Controller {

    /**
     * blg001Service
     */
    @Autowired
    private Blg001Service blg001Service;


    @GetMapping(value = "/")
    public String HelloWorld(){
        return "/blg001.html";
    }

    /**
     * ログイン
     * @param model
     * @param user
     */
    @GetMapping(value = "/b001")
    public String b001(Model model, User user) {
        return blg001Service.b001(model, user);
    }

}
