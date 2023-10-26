package com.blog.service;

import com.blog.model.User;
import com.blog.repository.UserRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

/**
 *
 */
@Service
public class Blg001Service {

    @Autowired
    UserRepository userRepository;
    /**
     *
     * @param model
     * @param user
     */
    public String b001(Model model, User user) {

        //１．データ取得
        //（１）ユーザ情報を取得する。
        User u = userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());

        // ２．ユーザ存在チェック
        //（１）「１．（１）」ユーザが存在しない場合
        if(u == null) {
            // ①モデル設定
            model.addAttribute("error", "message");

            // ②エラーページへ遷移する。TODO
            return "";
        }

        // ３．データ設定
        //（１）ユーザ情報設定
        User outUser = new User();
        outUser.setId(u.getId());
        outUser.setAge(u.getAge());
        outUser.setUsername(u.getUsername());
        outUser.setName(u.getName());
        outUser.setCreateDate(u.getCreateDate());
        outUser.setUpdateDate(u.getUpdateDate());

        //（２）セッション登録

        //（３）モデル設定
        model.addAttribute("user", outUser);

        //４．掲示板一覧画面へ遷移する。
        return "/blg002.html";



    }
}
