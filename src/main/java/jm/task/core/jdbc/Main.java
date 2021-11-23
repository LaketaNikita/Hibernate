package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Stas", "Dimin", (byte) 3);
        userService.saveUser("HDDF", "hFDH", (byte) 6);
        userService.saveUser("WEREW", "Dimin", (byte) 32);
        userService.saveUser("Sjfg", "VZXZ", (byte) 12);
        System.out.println(userService.getAllUsers());
    }
}
