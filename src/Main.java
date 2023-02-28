import company.dao.UserDao;
import company.model.User;
import company.service.impl.UserServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        User user = new User();
        User user1 = new User();
        User user3= new User();
        User user2 = new User();
        UserDao userDao = new UserDao(user);
        UserDao userDao1 = new UserDao(user1);
        UserDao userDao2 = new UserDao(user2);
        UserDao userDao3 = new UserDao(user3);
        userService.addUser(userDao);
        userService.addUser(userDao1);
        userService.addUser(userDao2);
        userService.addUser(userDao3);













      //  Double[] array = {100.0,200.0,300.0,400.0};

        Student [] student =  {
                new Student(1,"Оля",5),
                new Student(2,"Юля",4),
                new Student(3,"Оля",3),
                new Student(4,"Юля",2),
                new Student(5,"Оля",1),
                new Student(6,"Юля",3),
        };
        List<Integer> list = new ArrayList<>();
        Arrays.stream(student).filter(x-> x.getBaa()>=4).forEach(System.out::println);
        long s = Arrays.stream(student).filter(x -> x.getBaa() == 2).count();
        //баалардын максимальное чыгарып берет

        Optional<Student> optionalStudent = Stream.of(student).max((x,y)->Integer.compare(x.getBaa(),y.getBaa()));
//
//        System.out.println(s);
//        System.out.println(Arrays.stream(student).filter(x -> x.getBaa() >= 4).count());
        System.out.println(optionalStudent);

       // long c =list.stream().filter(x-> x.ge)







        // Arrays.stream(array).map(x-> x/(100/10)).forEach(System.out::println);


        // Arrays.stream(array).forEach(x-> System.out.println(x*x));




    }
}