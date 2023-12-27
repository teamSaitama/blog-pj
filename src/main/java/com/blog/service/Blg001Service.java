package com.blog.service;

import com.blog.model.Board;
import com.blog.model.User;
import com.blog.repository.BoardRepository;
import com.blog.repository.UserRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

/**
 *
 */
@Service
public class Blg001Service {

    @Autowired
    UserRepository userRepository;

    @Autowired
    BoardRepository boardRepository;

    /**
     *
     * @param model
     * @param user
     */
    public String b001(Model model, User user) {

        //１．データ取得 데이터 취득
        //（１）ユーザ情報を取得する。 유저정보를 취득한다.
        User u = userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());

        // ２．ユーザ存在チェック 유저 존재를 체크
        //（１）「１．（１）」ユーザが存在しない場合 유저가 존재하지 않는 경우.
        if(u == null) {
            // ①モデル設定 모델 설정
            model.addAttribute("error", "message");

            // ②エラーページへ遷移する。에러 페이지로 이동한다.
            return "/error.html";
        }

        // ３．データ設定  데이터 설정
        //（１）ユーザ情報設定 유저정보설정
        User outUser = new User();
        outUser.setId(u.getId());
        outUser.setAge(u.getAge());
        outUser.setUsername(u.getUsername());
        outUser.setName(u.getName());
        outUser.setCreateDate(u.getCreateDate());
        outUser.setUpdateDate(u.getUpdateDate());

        /**
         * SELECT *
         * FROM BOARD
         */
        List<Board> boardList = boardRepository.findAll();

        //（２）セッション登録 세션등록

        //（３）モデル設定 모델 설정
        model.addAttribute("user", outUser);
        model.addAttribute("boardList", boardList);

        //４．掲示板一覧画面へ遷移する。 게시판 목록 화면으로 이동한다.
        return "/blg002.html";

    }
}
