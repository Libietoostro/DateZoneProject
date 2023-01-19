import java.util.Scanner;

public class Candidate {
    private static final Scanner scanner = new Scanner(System.in);
    private final String firstName;
    private final String lastName;
    private final int age;
    public String gender;
    private final int height;
    private final int weight;
    private String hairColor;
    private String hobby;


    public Candidate(String firstName, String lastName, int age, int height, int weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }


    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }


    public String genderCandidate() {
        System.out.println("Please specify gender for " + getFirstName() + " " + getLastName());
        System.out.println("""
                Please select number from 1 to 2, where:
                1 - Female,
                2 - Male
                    """);
        int numberOfOption = 2;
        int option = scanner.nextInt();
        scanner.nextLine();
        option = Validation.correctOption(option, numberOfOption);

        return switch (option) {
            case 1 -> "Female";
            case 2 -> "Male";
            default -> "";
        };
    }


    public String hairColorCandidate() {
        System.out.println("Please specify hair color for " + getFirstName() + " " + getLastName());
        return User.hairColor();
    }


    public String hobbyCandidate() {
        System.out.println("Please specify hobby for " + getFirstName() + " " + getLastName());
        return User.hobby();
    }

    @Override
    public String toString() {
        return "Hello my name is " + this.firstName + " " + this.lastName + ".\n" + "I am " + this.age + "years old. \n"
                + "General information:\n" + "gender: " + this.gender + "\n" + "height: " + this.height + "cm \n" + "weight: " + this.weight + "kg \n" + "hair color: " + this.hairColor + "\n"
                + "hobby: " + this.hobby + ".\n" + "Additional information: ";
    }
}
