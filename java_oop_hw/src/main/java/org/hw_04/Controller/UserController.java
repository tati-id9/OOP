package org.hw_03.Controller;

import org.hw_03.Model.Student;
import org.hw_03.Model.Teacher;
import org.hw_03.Model.User;
import org.hw_03.Service.UserService;
import org.hw_03.Service.impls.UserServiceImpl;

public class UserController<T extends User> {

    private UserService userService = new UserServiceImpl();
    public void addStudent(String name, float grade, int year, Teacher teacher){
        userService.add(new Student(name, grade, year, new Teacher(teacher.getName())));
    }

    public void addTeacher(String name) {
        userService.add(new Teacher(name));
    }

    public void remove(T user){
        userService.remove(user);
    }

    public User get(T user){
        return userService.get(user);
    }

    public void updateUser(T user, T updatedUser) {
        remove(user);
        userService.add(updatedUser);
    }
}