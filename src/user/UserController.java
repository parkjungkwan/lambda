package user;

public class UserController {

    UserService userService;

    public UserController() {
        this.userService = new UserServiceImpl();
    }

    public String addUsers() {
        String msg = userService.addUsers();
        return msg;
    }
}
