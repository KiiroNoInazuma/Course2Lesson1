package Homework1;

public class Human {
    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    Human(int yearOfBirth, String name, String town, String jobTitle) {

        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.town = town;
        this.jobTitle = jobTitle;

        if (yearOfBirth < 0) {
            System.out.print("Возраст не может быть отрицательным значением! ");
        }


    }

    @Override
    public String toString() {
        String ending;
        if (name.charAt(name.length() - 1) == 'я') {
            ending = "ась";
        } else {
            ending = "ся";
        }
        if (yearOfBirth >= 0) {
            return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родил" + ending + " в "
                    + yearOfBirth + " году. Я работаю на должности - " + jobTitle + ". Будем знакомы!";
        }
        return "Ошибка";
    }
}
