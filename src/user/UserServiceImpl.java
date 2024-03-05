package user;
import common.UtilService;
import common.UtilServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class UserServiceImpl implements UserService {

    UserRepository userRepository;
    Map<String, User> users;

    public UserServiceImpl() {
        userRepository = new UserRepository();
        users = new HashMap<>();
    }

    @Override
    public String addUsers() {
        Map<String, User> map = new HashMap<>();
        UtilService util = UtilServiceImpl.getInstance();

        for(int i=0; i<5; i++){
            String username = util.createRandomUsername();
            map.put(username, User.builder()
                            .username(username)
                            .password("1")
                            .name(util.createRandomName())
                            .build());
        }
        users = map;
        return users.size()+" 개 더미값 추가";
    }
}
