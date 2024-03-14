package com.bitcamp.api.user;

import com.bitcamp.api.enums.UserRouter;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserView {
    public static void main(Scanner scanner) throws SQLException {
        // String res = execute(scanner);
        while (UserRouter.execute(scanner));
    }

    /*private static String execute(Scanner scanner) throws SQLException {
        String msg;
        Scanner scan = scanner;
        while(true){
            System.out.println("[사용자메뉴] 0-종료\n " +
                    "1-회원가입\n " +
                    "2-로그인\n " +
                    "3-ID검색\n " +
                    "4-비번변경\n" +
                    "5-탈퇴\n " +
                    "ls-회원목록\n " +
                    "7-이름검색\n" +
                    "8-직업검색\n" +
                    "9-회원수\n" +
                    "touch-테이블생성\n" +
                    "rm-테이블삭제" +
                    "");
            switch (scanner.next()){
                case "0":
                    System.out.println("종료");
                    return "";
                case "1":
                    System.out.println("1-회원가입");
                    msg = UserController.getInstance().save(scanner);
                    System.out.println("회원가입 결과 : "+msg);
                    break;
                case "2":
                    System.out.println("2-로그인");
                    msg = UserController.getInstance().login(scanner);
                    System.out.println("로그인 결과 : "+msg);
                    break;
                case "3":
                    System.out.println("3-ID 검색");
                    //System.out.println(controller.getOne(scanner));
                    // User u = findOne(scanner.next());

                    break;
                case "4":
                    System.out.println("4-비번변경");
                    System.out.println(UserController.getInstance().updatePassword(scanner));
                    break;
                case "5":
                    System.out.println("5-탈퇴");
                    System.out.println(UserController.getInstance().delete(scanner));
                    break;
                case "ls":
                    System.out.println("회원목록");
                    List<?> users = UserController.getInstance().findUsers();
                   //users.forEach(i -> System.out.println(i));

                    break;
                case "7":
                    System.out.println("7-이름검색");
                    UserController.getInstance().findUsersByName(scanner).forEach((i)->{
                        System.out.println(i);
                    });
                    break;
                case "8":
                    System.out.println("8-직업검색");
                    UserController.getInstance().findUsersByJob(scanner).forEach((i)->{
                        System.out.println(i);
                    });
                    break;
                case "9":
                    System.out.println("9-회원수");
                    String numberOfUsers = UserController.getInstance().count();
                    System.out.println("회원수 "+numberOfUsers);
                    break;
                case "touch":
                    System.out.println("테이블생성");
                    System.out.println(UserController.getInstance().createUsers());
                    break;
                case "rm":
                    System.out.println("테이블삭제");

                    System.out.println("회원테이블 삭제 성공");
                    break;


            }

        }*/
    }

