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
            System.out.println("= Select Model =");
            switch (sc.next()){
                case "halt":  return;
                case "usr": UserView.main(sc);break;
                case "board": BoardView.main(); break;
                case "account": AccountView.main(sc); break;
                case "crawler": CrawlerView.main(sc);  break;
                case "article": ArticleView.main(sc);  break;
            }
        }

    }
}
















