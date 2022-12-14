package Homework1;

public class Human {
    private int yearOfBirth;
    String name;
    private String town;
    String jobTitle;

    Human(int yearOfBirth, String name, String town, String jobTitle) {

        this.name = name;
        if (town == null || town.isBlank()) {
            this.town = "<<Информация не указана>>";
        } else {
            this.town = town;
        }
        this.jobTitle = jobTitle;
        if (yearOfBirth < 0) {
            System.out.println("Возраст не может быть отрицательным значением!");
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }

    Human(String name) {
        this(0, name, "<<Информация не указана>>", "безработный");
    }

    @Override
    public String toString() {
        String ending;
        if (name.charAt(name.length() - 1) == 'я') {
            ending = "ась";
        } else {
            ending = "ся";
        }
        if (yearOfBirth > 0 && !jobTitle.equals("безработный")) {
            return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родил" + ending + " в "
                    + yearOfBirth + " году. Я работаю на должности - " + jobTitle + ". Будем знакомы!";
        } else if (jobTitle.equals("безработный")) {
            return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родил" + ending + " в "
                    + yearOfBirth + " году. Я не работаю. Будем знакомы!";
        }
        return "Ошибка";
    }


    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == null || town.isBlank()) {
            this.town = "<<Информация не указана>>";
            return;
        }
        this.town = town;
    }
}
