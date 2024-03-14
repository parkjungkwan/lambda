package com.bitcamp.api;

import com.bitcamp.api.account.AccountView;
import com.bitcamp.api.board.BoardView;
import com.bitcamp.api.enums.NavigationOfFunction;
import com.bitcamp.api.enums.NavigationOfConsumer;
import com.bitcamp.api.enums.NavigationOfSupplier;
import com.bitcamp.api.enums.NavigationOfPredicate;
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
        NavigationOfConsumer.select(sc);
        // while ();
        boolean booleanFlag = NavigationOfPredicate.select(sc);
        //while (booleanFlag);
        String stringFlag = NavigationOfSupplier.select(sc);
        //while (stringFlag.equals("x"));
        String stringFlag2 = NavigationOfFunction.select(sc);
        while (!stringFlag2.equals("x"));



//        while (true){
//            System.out.println("= Select Model =");
//            switch (sc.next()){
//                case "exit":  return;
//                case "user": UserView.main(sc);break;
//                case "board": BoardView.main(); break;
//                case "account": AccountView.main(sc); break;
//                case "crawler": CrawlerView.main(sc);  break;
//                case "article": ArticleView.main(sc);  break;
//            }
//        }

    }
}
















