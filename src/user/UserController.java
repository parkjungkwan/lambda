package user;

public class UserController {

    UserServiceImpl userService;

    public UserController() {
        this.userService = UserServiceImpl.getInstance();
    }

    public String addUsers() {
        String msg = userService.addUsers();
        return msg;
    }
}
