import java.util.Scanner;

public class User {
    private final static Scanner scanner = new Scanner(System.in);

    private int[] age;
    private String orientation;

    private int[] height;

    private int[] weight;

    private String hairColor;

    private String hobby;

    private String business;

    private String animals;

    private String divorced;
    private String parties;

    private String house;

    private String motivation;

    private String relationship;

    private String children;

    private String smoking;

    private String italianCuisine;

    private String haveAnimals;

    private String studentStatus;


    public void survey() {
        System.out.println("In order to find the best candidate for you, please answer a few questions below: ");
        System.out.println();

        System.out.println("Please specify your orientation: ");
        this.orientation = orientation();
        System.out.println("The orientation you have selected is: " + orientation + "\n");

        System.out.println("Please select the age range you are interested in: ");
        int lowerAgeLimit = 18;
        int upperAgeLimit = 80;
        String nameAge = "age";
        this.age = Range(nameAge, lowerAgeLimit, upperAgeLimit);
        System.out.println("The age range you have selected is: " + age[0] + "-" + age[1] + "\n");


        System.out.println("Please specify the height range you prefer: ");
        int lowerHeightLimit = 100;
        int upperHeightLimit = 260;
        String nameHeight = "height";
        this.height = Range(nameHeight, lowerHeightLimit, upperHeightLimit);
        System.out.println("The height range you have selected is: " + this.height[0] + "-" + this.height[1] + "\n");


        System.out.println("Please specify the weight range you prefer: ");
        int lowerWeightLimit = 30;
        int upperWeightLimit = 500;
        String nameWeight = "weight";
        this.weight = Range(nameWeight, lowerWeightLimit, upperWeightLimit);
        System.out.println("The height range you have selected is: " + this.weight[0] + "-" + this.weight[1] + "\n");


        System.out.println("Please specify the hair color you prefer: ");
        this.hairColor = hairColor();
        System.out.println("The hair color you have selected is: " + this.hairColor + "\n");


        System.out.println("Please specify your hobby: ");
        this.hobby = hobby();
        System.out.println("Your hobby is: " + this.hobby + "\n");

        int topic = 1;
        System.out.println("Do you prefer someone running their own business? ");
        System.out.println();
        this.business = additionalQuestion(topic);
        System.out.println("Your choice is: " + " " + this.business + "\n");
        topic++;

        System.out.println("Do you love animals? ");
        System.out.println();
        this.animals = additionalQuestion(topic);
        System.out.println("You have selected that: " + this.animals + "\n");
        topic++;

        System.out.println("Do you prefer someone is divorced? ");
        System.out.println();
        this.divorced = additionalQuestion(topic);
        System.out.println("Your choice is: " + " " + this.divorced + "\n");
        topic++;

        System.out.println("Do you love party? ");
        System.out.println();
        this.parties = additionalQuestion(topic);
        System.out.println("Your choice is: " + " " + this.parties + "\n");
        topic++;

        System.out.println("If someone has their own house, what would you consider an advantage? ");
        System.out.println();
        this.house = additionalQuestion(topic);
        System.out.println("Your choice is: " + " " + this.house + "\n");
        topic++;

        System.out.println("What is your motivation? Love? ");
        System.out.println();
        this.motivation = additionalQuestion(topic);
        System.out.println("Your choice is: " + " " + this.motivation + "\n");
        topic++;

        System.out.println("Do you desire stable relationship? ");
        System.out.println();
        this.relationship = additionalQuestion(topic);
        System.out.println("Your choice is: " + " " + this.relationship + "\n");
        topic++;

        System.out.println("Do you mind if someone have children? ");
        System.out.println();
        this.children = additionalQuestion(topic);
        System.out.println("Your choice is: " + " " + this.children + "\n");
        topic++;

        System.out.println("Do you mind if someone smokes cigarettes? ");
        System.out.println();
        this.smoking = additionalQuestion(topic);
        System.out.println("Your choice is: " + " " + this.smoking + "\n");
        topic++;

        System.out.println("Do you like Italian cuisine? ");
        System.out.println();
        this.italianCuisine = additionalQuestion(topic);
        System.out.println("Your choice is: " + " " + this.italianCuisine + "\n");
        topic++;

        System.out.println("Do you mind if someone have pets? ");
        System.out.println();
        this.haveAnimals = additionalQuestion(topic);
        System.out.println("Your choice is: " + " " + this.haveAnimals + "\n");
        topic++;

        System.out.println("Do you mind if someone is a student? ");
        System.out.println();
        this.studentStatus = additionalQuestion(topic);
        System.out.println("Your choice is: " + " " + this.studentStatus + "\n");

    }

    public int[] getAge() {
        return age;
    }

    public String getOrientation() {
        return orientation;
    }

    public int[] getHeight() {
        return height;
    }

    public int[] getWeight() {
        return weight;
    }

    public String getHairColor() {
        return hairColor;
    }

    public String getHobby() {
        return hobby;
    }

    public String getBusiness() {
        return business;
    }

    public String getAnimals() {
        return animals;
    }

    public String getDivorced() {
        return divorced;
    }

    public String getParties() {
        return parties;
    }

    public String getHouse() {
        return house;
    }

    public String getMotivation() {
        return motivation;
    }

    public String getRelationship() {
        return relationship;
    }

    public String getChildren() {
        return children;
    }

    public String getSmoking() {
        return smoking;
    }

    public String getItalianCuisine() {
        return italianCuisine;
    }

    public String getHaveAnimals() {
        return haveAnimals;
    }

    public String getStudentStatus() {
        return studentStatus;
    }


    public static String orientation() {
        System.out.println("""
                Please select number from 1 to 3, where:
                1 -I am interested in men,
                2 -I am interested in women,
                3 -I am interested in women and men.

                    """);
        int numberOfOption = 3;
        int option = scanner.nextInt();
        scanner.nextLine();
        option = Validation.correctOption(option, numberOfOption);

        return switch (option) {
            case 1 -> "I am interested in men";
            case 2 -> "I am interested in women";
            case 3 -> "I am interested in women and men";
            default -> "";
        };
    }

    public static String hairColor() {
        System.out.println("""
                Please select number from 1 to 4, where:
                1 - blond,
                2 - black,
                3 - ginger,
                4 - brown

                    """);
        int numberOfOption = 4;
        int option = scanner.nextInt();
        scanner.nextLine();
        option = Validation.correctOption(option, numberOfOption);

        return switch (option) {
            case 1 -> "blond";
            case 2 -> "black";
            case 3 -> "ginger";
            case 4 -> "brown";
            default -> "";
        };
    }


    public static String hobby() {
        System.out.println("""
                Please select number from 1 to 6, where:
                1 - Snowboarding,
                2 - Cooking,
                3 - Swimming,
                4 - Boxing,
                5 - Dancing,
                6 - Singing

                    """);
        int numberOfOption = 6;
        int option = scanner.nextInt();
        scanner.nextLine();
        option = Validation.correctOption(option, numberOfOption);

        return switch (option) {
            case 1 -> "Snowboarding";
            case 2 -> "Cooking";
            case 3 -> "Swimming";
            case 4 -> "Boxing";
            case 5 -> "Dancing";
            case 6 -> "Singing";
            default -> "";
        };
    }


    public static int[] Range(String rangeName, int lowerLimit, int upperLimit) {
        int[] outputArray = new int[2];


        System.out.println("Please specify the lower " + rangeName + " limit:");
        int lowerBorder = scanner.nextInt();
        scanner.nextLine();

        lowerBorder = Validation.correctLowerBorder(lowerBorder, lowerLimit, upperLimit);

        System.out.println("Please specify the upper " + rangeName + " limit: ");
        int upperBorder = scanner.nextInt();
        scanner.nextLine();

        upperBorder = Validation.correctUpperBorder(upperBorder, upperLimit, lowerBorder);

        outputArray[0] = lowerBorder;
        outputArray[1] = upperBorder;

        return outputArray;
    }


    public static String questionTopic(int option) {
        int numberOfOption = 12;
        option = Validation.correctOption(option, numberOfOption);

        return switch (option) {
            case 1 -> "I prefer someone to run their own business";
            case 2 -> "I love animals";
            case 3 -> "I don't mind if someone is divorced, it's even better because I am too";
            case 4 -> "I love party";
            case 5 -> "If someone has their own house it is advantage";
            case 6 -> "My motivation is love";
            case 7 -> "I really want to be in stable relationship";
            case 8 -> "I don't mind if someone has children, it's even better because I have as well";
            case 9 -> "I do not mind. It is even better because I smoke cigarettes as well";
            case 10 -> "I love italian cuisine";
            case 11 -> "I love animals and I have two dogs";
            case 12 -> "I don't mind if someone is a student, it's even better because I am as well";
            default -> "";
        };
    }

    public String additionalQuestion(int topic) {
        String answer = questionTopic(topic);
        System.out.println("Please select number from 1 to 2, where: ");
        System.out.println("1 - " + answer);
        System.out.println("2 - It does not matter");


        int numberOfOption = 2;
        int option = scanner.nextInt();

        option = Validation.correctOption(option, numberOfOption);

        return switch (option) {
            case 1 -> answer;
            case 2 -> "It does not matter";
            default -> "";
        };
    }


    @Override
    public String toString() {
        return "Orientation preferences: " + this.orientation + "\n" +
                "Age preferences: " + this.age[0] + "-" + this.age[1] + "\n" +
                "Height preferences: " + this.height[0] + "-" + this.height[1] + "\n" +
                "Weight preferences: " + this.weight[0] + "-" + this.weight[1] + "\n" +
                "Hair color preferences: " + this.hairColor + "\n" +
                "Your hobby: " + this.hobby + "\n" + "\n" +
                "Answers to question: " + "\n" + "Do you prefer someone running their own business?" + "\n" + this.business + "\n" + "\n" +
                "Do you love animals?" + "\n" + this.animals + "\n" + "\n" +
                "Do you prefer someone is divorced?" + "\n" + this.divorced + "\n" + "\n" +
                "Do you love party?" + "\n" + this.parties + "\n" + "\n" +
                "If someone has their own house, what would you consider an advantage?" + "\n" + this.house + "\n" + "\n" +
                "What is your motivation? Love?" + "\n" + this.motivation + "\n" + "\n" +
                "Do you desire stable relationship?" + "\n" + this.relationship + "\n" + "\n" +
                "Do you mind if someone have children?" + "\n" + this.children + "\n" + "\n" +
                "Do you mind if someone smokes cigarettes?" + "\n" + this.smoking + "\n" + "\n" +
                "Do you like Italian cuisine?" + "\n" + this.smoking + "\n" + "\n" +
                "Do you mind if someone have pets?" + "\n" + this.haveAnimals + "\n" + "\n" +
                "Do you mind if someone is a student?" + "\n" + this.studentStatus + "\n";
    }

}
