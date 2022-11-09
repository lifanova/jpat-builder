import ru.lifanova.domain.Person;
import ru.lifanova.domain.PersonBuilder;

public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Мария")
                .setSurname("Васильева")
                .setAge(31)
                .setAddress("Екатеринбург")
                .build();

        mom.happyBirthday();
        mom.setAddress("Москва");

        Person son = mom.newChildBuilder()
                .setName("Иван")
                .build();

        System.out.println("У " + mom + " есть сын, " + son);

    }
}
