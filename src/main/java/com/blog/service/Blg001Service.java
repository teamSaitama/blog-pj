package com.blog.service;

import com.blog.model.User;
import com.blog.repository.UserRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
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
    public void b001(Model model, User user) {

        //１．データ取得
        userRepository.findByUsernameAndPassword(user.getUserName(), user.getPassword());

        //（１）ユーザ情報を取得する。

        // ２．ユーザ存在チェック

        //（１）「１．（１）」ユーザが存在しない場合

        // ①モデル設定

        // ３．データ設定

        //（１）ユーザ情報設定

        //（２）セッション登録

        //（３）モデル設定

        //４．掲示板一覧画面へ遷移する。


    }
}
