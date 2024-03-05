package user;

import common.AbstractService;
import common.UtilService;
import common.UtilServiceImpl;

import java.util.*;
import java.util.stream.Collectors;

public class UserServiceImpl extends AbstractService<User> implements UserService {

    private static UserServiceImpl instance = new UserServiceImpl();
    Map<String, User> users;

    private UserServiceImpl(){
        this.users = new HashMap<>();
    }
    public static UserServiceImpl getInstance(){return instance;}
    @Override
    public String save(User user) {
        users.put(user.getUsername(), user);
        return "회원가입 성공";
    }

    @Override
    public List<User> findAll() {
        return  new ArrayList<>(users.values());
    }

    @Override
    public String login(User user) {
        return users.getOrDefault(user.getUsername(), User.builder().password("").build())
                .getPassword()
                .equals(user.getPassword()) ?
                "로그인 성공" : "로그인 실패";
    }

    @Override
    public Optional<User> findById(Long id) {
        Optional<User> u = Optional.of(users.get(id));
        return Optional.of(users.get(id));
    }

    @Override
    public String updatePassword(User user) {
        users.get(user.getUsername()).setPassword(user.getPassword());

        return "비번 변경 성공";
    }

    @Override
    public String delete(User user) {
        users.remove(user.getUsername());
        return "회원삭제";
    }

    @Override
    public Boolean existsById(Long id) {
        return users.containsKey(id);
    }



    @Override
    public List<?> findUsersByName(String name) {
        return users
                .values()
                .stream()
                .filter(i -> i.getName().equals(name))
                .collect(Collectors.toList());
    }

    @Override
    public Map<String, ?> findUsersByNameFromMap(String name) {
        return users
                .entrySet()
                .stream()
                .filter(i -> i.getKey().equals(name))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))
                ;
    }

    @Override
    public List<?> findUsersByJob(String job) {

        return users
                .values()
                .stream()
                .filter(i -> i.getName().equals(job))
                .collect(Collectors.toList());
    }

    @Override
    public Map<String, ?> findUsersByJobFromMap(String job) {
        return users
                .entrySet()
                .stream()
                .filter(i -> i.getKey().equals(job))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))
                ;
    }

    @Override
    public String count() {
        return users.size()+"";
    }

    @Override
    public Optional<User> getOne(String id) {
        return Optional.empty();
    }

    @Override
    public Map<String, ?> getUserMap() {
        return users;
    }

    @Override
    public String addUsers() {
        Map<String, User> map = new HashMap<>();
        UtilService util = UtilServiceImpl.getInstance();

        for(int i=0; i<5; i++){
            String username = util.createRandomUsername();
            map.put(username,
                    User.builder()
                            .username(username)
                            .password("1")
                            .name(util.createRandomName())
                            .build());
        }
        users = map;
        return users.size()+"개 더미값 추가";

    }
}
