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
    Join("1",scanner->{
        System.out.println("회원가입");
        UserController.getInstance().save(scanner);
        return true;}),
    login("2",scanner->{
        System.out.println("로그인");
        UserController.getInstance().login(scanner);
    return true;}),
    IdSearch("3",scanner->{
        System.out.println("ID검색");
        UserController.getInstance().findById(scanner);
        return true;}),
    PasswordChange("4",scanner->{
        System.out.println("비번변경");
        UserController.getInstance().updatePassword(scanner);
        return true;}),
    Withdraw("5",scanner->{
        System.out.println("탈퇴");
        UserController.getInstance().delete(scanner);
        return true;}),
    MemberList("ls",scanner->{
        System.out.println("회원목록");
        UserController.getInstance().findAll();
        return true;}),
    NameSearch("7",scanner->{
        System.out.println("이름검색");
        UserController.getInstance().findById(scanner);
        return true;}),
    JobSearch("8",scanner->{
        System.out.println("직업검색");
        UserController.getInstance().findUsersByJob(scanner);
        return true;}),
    MemberCount("9",scanner->{
        System.out.println("회원수");
        UserController.getInstance().count();
        return true;}),
    CreateTable("touch",scanner->{
        System.out.println("테이블생성");
        try {
            UserController.getInstance().createUsers();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return true;}),
    dereateTable("rm",scanner->{
        System.out.println("테이블삭제");
        return true;}),
    exit("0",scanner->{
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
