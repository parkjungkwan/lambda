package com.bitcamp.api.enums;

import com.bitcamp.api.user.User;
import com.bitcamp.api.user.UserController;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public enum UserRouter {
    Join("1",(i)->{
        System.out.println("회원가입");
        UserController.getInstance().save(i);
        return true;}),
    login("2",(i)->{
        System.out.println("로그인");
        UserController.getInstance().login(i);
    return true;}),
    IdSearch("3",(i)->{
        System.out.println("ID검색");
        UserController.getInstance().findById(i);
        return true;}),
    PasswordChange("4",(i)->{
        System.out.println("비번변경");
        UserController.getInstance().updatePassword(i);
        return true;}),
    Withdraw("5",(i)->{
        System.out.println("탈퇴");
        UserController.getInstance().delete(i);
        return true;}),
    MemberList("ls",(i)->{
        System.out.println("회원목록");
        UserController.getInstance().findAll();
        return true;}),
    NameSearch("7",(i)->{
        System.out.println("이름검색");
        UserController.getInstance().findById(i);
        return true;}),
    JobSearch("8",(i)->{
        System.out.println("직업검색");
        UserController.getInstance().findUsersByJob(i);
        return true;}),
    MemberCount("9",(i)->{
        System.out.println("회원수");
        UserController.getInstance().count();
        return true;}),
    CreateTable("touch",(i)->{
        System.out.println("테이블생성");
        try {
            UserController.getInstance().createUsers();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return true;}),
    dereateTable("rm",(i)->{
        System.out.println("테이블삭제");
        return true;}),
    exit("0",(i)->{
        System.out.println("종료");
        return false;})
    ;

    private final  String name;
    private final Predicate<Scanner> predicate;

    UserRouter(String name, Predicate<Scanner> predicate) {
        this.name = name;
        this.predicate = predicate;
    }

    public static boolean execute(Scanner sc) {
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
        String menu = sc.next();
        return Stream.of(values())
                .filter(i->i.name.equals(menu))
                .findAny()
                .orElseGet(()->exit)
                .predicate.test(sc);
    }
}
