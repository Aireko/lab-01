import java.util.Date;

public class Pet {
    private String name;
    private Date birthDate;

    public Pet(String name) {
        this.name = name;
        this.birthDate = new Date(); // this will set birthdate to current date
    }

    public Pet(String name, Date birthDate) {
        this.name = name;
        this.birhtDate = birthDate;
    }
}
