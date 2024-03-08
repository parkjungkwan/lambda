package com.bitcamp.api;

import com.bitcamp.api.account.AccountView;
import com.bitcamp.api.board.BoardView;
import com.bitcamp.api.user.UserView;
import com.bitcamp.api.crawler.CrawlerView;
import com.bitcamp.api.article.ArticleView;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, SQLException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("=== x-Exit " +
                    "u-User " +
                    "a-Article " +
                    "b-Board " +
                    "m-Account " +
                    "c-Crawler " +
                    "===");
            switch (sc.next()){
                case "x":  return;
                case "u": UserView.main(sc);break;
                case "b": BoardView.main(); break;
                case "m": AccountView.main(sc); break;
                case "c": CrawlerView.main(sc);  break;
                case "a": ArticleView.main(sc);  break;
            }
        }

    }
}