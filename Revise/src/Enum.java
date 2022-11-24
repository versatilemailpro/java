enum Gender {
    mail, femail, shemail
}

public class Enum {
    public static void main(String[] args) {

        Human hu = new Human();
        hu.gender = Gender.mail;

        System.out.println("Gender of a human is " + hu.gender);

        for (Gender gen : Gender.values()) {
            System.out.println(gen);
        }

    }
}
