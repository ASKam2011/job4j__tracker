package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (User user : users) {
            if (login.equals(user.getUsername())) {
                rsl = user;
                System.out.println(rsl);
                break;
            }
        }
            if (rsl == null) {
                throw new UserNotFoundException("Пользователь не найден.");
            }
        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean rsl = true;
        if (!user.isValid() && user.getUsername().length() < 3) {
            throw new UserInvalidException("Пользователь не валидный.");
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            User[] users = {
                    new User("Анастасия", true)
            };
            User user = findUser(users, "Анастасия");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ui) {
            ui.printStackTrace();
        } catch (UserNotFoundException un) {
            un.printStackTrace();
        }
    }
}
