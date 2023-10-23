package com.blog.controller;

import com.blog.model.User;
import com.blog.service.Blg001Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

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

    /**
     * ログイン
     * @param model
     * @param user
     */
    public void b001(Model model, User user) {

        blg001Service.b001(model, user);

    }
}
