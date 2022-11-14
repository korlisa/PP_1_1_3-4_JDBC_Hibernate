package jm.task.core.jdbc;


import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import java.util.ArrayList;
import java.util.List;



public class Main {

    public static void main(String[] args) {

//        Session session = Util.getSessionFactory().openSession();

        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
//        userService.saveUser("ivan", "ivanov", (byte) 20);
//        userService.saveUser("ivan2", "ivanov2", (byte) 20);
//        userService.saveUser("ivan3", "ivanov3", (byte) 20);
//        userService.saveUser("ivan4", "ivanov4", (byte) 20);
//        userService.saveUser("ivan5", "ivanov5", (byte) 20);
        List<User> users = new ArrayList<>();
        users.add(new User("Ivan", "Ivanov", (byte) 20));
        users.add(new User("Ivan", "Ivanov", (byte) 20));
        users.add(new User("Ivan", "Ivanov", (byte) 20));
        users.add(new User("Ivan", "Ivanov", (byte) 20));
        users.add(new User("Ivan", "Ivanov", (byte) 20));
        for (User user : users) {
            userService.saveUser(user.getName(), user.getLastName(), user.getAge());
            System.out.println("User с именем " + user.getName() + " добавлен в базу данных");
        }
        for (User user : userService.getAllUsers()) {
            System.out.println(user);
        }
        userService.removeUserById(3L);
        System.out.println(userService.getAllUsers().toString());
        userService.cleanUsersTable();
        userService.dropUsersTable();


    }
}
