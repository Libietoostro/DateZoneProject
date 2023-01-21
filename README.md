
![DateZone_Project (2)](https://user-images.githubusercontent.com/116492421/213841382-87f5a0f1-1bd1-4d6f-a641-650d55446ef1.png)






# Introduction

In this project I have wanted to show that knowing the basics of object-oriented programming, we are able to create a console application.   
The application was created with the use:
-	loops,
-	conditional statements,
-	switch statement,
-	primitive types,
-	arrays,
-	lists,
-	static methods,
-	inheritance,
-	encapsulation,
-	polymorphism,
-	Scanner class.

# Description

The application enables the user to find the perfect candidate by matching his preferences with the characteristics of the candidates who have applied for the dating program. The candidate who meets the most criteria and scores the most points, wins!!!

# Creation Process

Initially I have created class called Candidate and fields which describe the characteristic each candidate.
Please find below these fields:
-	First name and last name,
-	age,
-	gender,
-	height,
-	weight,
-	hair color.


```java
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
 ```  
 All fields have private access modifier so the next crucial step was to create a constructor as well as getters and setters for the fields.   
```java
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
```

Also there are three methods to define gender, hair color and hobby for each candidate.
```java
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
```
Candidate characteristics will be compared with the preferences of the application user. For this reason, methods from the Scanner class and the switch statement are used there. The introduction of these methods will avoid unnecessary errors (typos).

The two methods use a functions from the another "User" class because the user is also forced to specify a hobby and a preferred hair color. The similar functionality of these methods allows them to be used in this case. In this way we can avoid unnecessary code duplication.

In the Candidate class there is also an override toString method, which was created to display an exact description for each of the candidates.
```java
@Override
    public String toString() {
        return "Hello my name is " + this.firstName + " " + this.lastName + ".\n" + "I am " + this.age + "years old. \n"
                + "General information:\n" + "gender: " + this.gender + "\n" + "height: " + this.height + "cm \n" + "weight: " + this.weight + "kg \n" + "hair color: " + this.hairColor + "\n"
                + "hobby: " + this.hobby + ".\n" + "Additional information: ";
    }
```

The next step was to create six classes representing six candidates extended by the Candidate class.    
Classes representing candidates:
-	FirstCandidate,
-	SecondCandidate,
-	ThirdCandidate,
-	FourthCandidate,
-	FifthCandidate,
-	SixthCandidate.

In each class, two additional fields assigned to a concrete candidate were created, as well as a constructor and getters related to the fields visible below.
```java 
public class FirstCandidate extends Candidate {
    private final boolean ownBusiness;
    private final boolean loveAnimals;


    public FirstCandidate(String firstName, String lastName, int age, int height, int weight) {
        super(firstName, lastName, age, height, weight);
        this.ownBusiness = true;
        this.loveAnimals = true;
    }


    public boolean isOwnBusiness() {
        return ownBusiness;
    }

    public boolean isLoveAnimals() {
        return loveAnimals;
    }
```

The toString method was overwritten again and supplemented with information directly related to the fields in a specific class describing a specific candidate in order to present its characteristics in more detail.
```java
@Override
    public String toString() {
        String one;
        String two;

        if (ownBusiness) {
            one = "I run my own business";
        } else {
            one = "I am full-time employee";
        }

        if (loveAnimals) {
            two = "I love animals";
        } else {
            two = "I don't like animals";
        }

        return super.toString() + "\n" + one + "\n" + two;
    }
```

The next stage was to create the User class and fields to assign preferences to the user. Getters was created for fields as well. 
```java
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
```

Methods orientation, range, hairColor, hobby and additionalPoints were used to determine user preferences.
```java 
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


    public static int[] range(String rangeName, int lowerLimit, int upperLimit) {
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
```

Preferences were assigned to the fields of the User class by a survey method. The method survey allows us to get to know the user better.
```java
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
        this.age = range(nameAge, lowerAgeLimit, upperAgeLimit);
        System.out.println("The age range you have selected is: " + age[0] + "-" + age[1] + "\n");


        System.out.println("Please specify the height range you prefer: ");
        int lowerHeightLimit = 100;
        int upperHeightLimit = 260;
        String nameHeight = "height";
        this.height = range(nameHeight, lowerHeightLimit, upperHeightLimit);
        System.out.println("The height range you have selected is: " + this.height[0] + "-" + this.height[1] + "\n");


        System.out.println("Please specify the weight range you prefer: ");
        int lowerWeightLimit = 30;
        int upperWeightLimit = 500;
        String nameWeight = "weight";
        this.weight = range(nameWeight, lowerWeightLimit, upperWeightLimit);
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
```

In the User class, there is also an overwritten toString method from the Object class.
```java
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
```

Validation methods in a separate Validation class were applied to methods such as range, hobby or orientation. These methods were created to protect against possible user error or exceeding the assumed ranges.
```java
public static int correctLowerBorder(int lowerBorder, int lowerLimit, int upperLimit) {
        while (lowerBorder < lowerLimit || lowerBorder > upperLimit) {
            System.out.println("The lower limit must be greater than " + lowerLimit + " and must be lower than " + upperLimit);
            lowerBorder = scanner.nextInt();
            scanner.nextLine();
        }
        return lowerBorder;
    }
    
public static int correctUpperBorder(int upperBorder, int upperLimit, int lowerBorder) {
        while (upperBorder > upperLimit || upperBorder <= lowerBorder) {
            System.out.println("The upper limit must be lower than " + upperLimit + " and must be greater than " + lowerBorder);
            upperBorder = scanner.nextInt();
            scanner.nextLine();
        }
        return upperBorder;
    }

    public static int correctOption(int option, int numberOfOption) {
        while (option < 1 || option > numberOfOption) {
            System.out.println("Number must be within the range 1-" + numberOfOption + " inclusive.");
            System.out.println("Please enter correct number:");
            option = scanner.nextInt();
            scanner.nextLine();
        }
        return option;
    }
```

The most important methods in the Main class, which also contains the main method, include:   
refillingCandidates (A method to complete data on candidates in terms of gender, hobbies and hair color).
```java
public static CandidatesList refillingCandidates(ArrayList<Candidate> candidatesList) {
        CandidatesList listCandidates = addingCandidates(candidatesList);
        String gender;
        String hairColor;
        String hobby;

        for (int i = 0; i < 6; i++) {
            gender = listCandidates.getCandidatesList().get(i).genderCandidate();
            listCandidates.getCandidatesList().get(i).setGender(gender);

            hairColor = listCandidates.getCandidatesList().get(i).hairColorCandidate();
            listCandidates.getCandidatesList().get(i).setHairColor(hairColor);

            hobby = listCandidates.getCandidatesList().get(i).hobbyCandidate();
            listCandidates.getCandidatesList().get(i).setHobby(hobby);
        }

        return listCandidates;
    }
```

presentationOfCandidates (A method of presenting all candidates).
```java
public static CandidatesList presentationOfCandidates(ArrayList<Candidate> candidatesList) {
        CandidatesList listCandidates = refillingCandidates(candidatesList);

        for (int i = 0; i < 6; i++) {
            System.out.println(listCandidates.getCandidatesList().get(i));
            System.out.println();
        }


        return listCandidates;
    }
```

scoringSystem (A method that assigns points to each candidate based on matching user preferences with candidate characteristics).
```java
public static int scoringSystem(CandidatesList listCandidates, User user, int candidateNumber, ArrayList<Boolean> additionalInformation) {
        int[] ageRange = user.getAge();
        int points = 0;
        Candidate candidate = listCandidates.getCandidatesList().get(candidateNumber);


        if (candidate.getAge() >= ageRange[0] && candidate.getAge() <= ageRange[1]) {
            points++;
        }

        int[] heightRange = user.getHeight();

        if (candidate.getHeight() >= heightRange[0] && candidate.getHeight() <= heightRange[1]) {
            points++;
        }

        int[] weightRange = user.getWeight();

        if (candidate.getWeight() >= weightRange[0] && candidate.getWeight() <= weightRange[1]) {
            points++;
        }

        String hairColor = user.getHairColor();
        if (candidate.getHairColor().equals(hairColor)) {
            points++;
        }

        String hobby = user.getHobby();
        if (candidate.getHobby().equals(hobby)) {
            points++;
        }


        points = additionalPoints(candidateNumber, points, candidate, user, additionalInformation);

        return points;

    }
```

pointPresentation (A method that presents the number of points that were assigned to each candidate).
```java
private static int[] pointsPresentation(ArrayList<Boolean> additionalInformation, User user, CandidatesList candidatesList) {
        int[] points = new int[6];

        for (int i = 0; i < 6; i++) {
            points[i] = scoringSystem(candidatesList, user, i, additionalInformation);
        }

        for (int j = 0; j < points.length; j++) {
            System.out.println(candidatesList.getCandidatesList().get(j).getFirstName() + " " + candidatesList.getCandidatesList().get(j).getLastName() + " scored: " + points[j] + " points");
        }

        return points;
    }
```

winner (A method that determines the winner(s) based on points earned).
```java
   private static void winner(int[] points, CandidatesList candidatesList) {
        int max = Integer.MIN_VALUE;
        int numberOfMax = 0;
        int arrayPosition = 0;


        for (int point : points) {
            max = Math.max(max, point);
        }


        for (int point : points) {
            if (point == max) {
                numberOfMax++;
            }
        }
        int[] arrayIndex = new int[numberOfMax];
        for (int k = 0; k < points.length; k++) {
            if (points[k] == max) {
                arrayIndex[arrayPosition] = k;
                arrayPosition++;
            }
        }

        System.out.println("""

                We have found the best candidate/candidates for you!!!
                The winner is or winners are:
                """);

        for (int index : arrayIndex) {

            System.out.println(candidatesList.getCandidatesList().get(index).getFirstName() + " " + candidatesList.getCandidatesList().get(index).getLastName() + " with result: " + max + " points");

        }

    }
```

# Running application

## Prerequisite
If you want to run the application, java version 19.01 or later is required.                                             
Please find below link to a tutorial on how to properly install the above java version:                                                 
https://www.youtube.com/watch?v=vFBW6nMcVlU                                                                   
To download, follow the link below:                                                                                                                                                                      
https://www.oracle.com/java/technologies/javase/jdk19-archive-downloads.html                                                    

## Launch process
Download a file named launcher.jar from the DateZoneProject repository located on GitHub.                                                

![thirdImage](https://user-images.githubusercontent.com/116492421/213838445-951ddd34-beec-4ca4-a54f-3efa83f1f0b4.PNG)

Then save it to a specific location on your computer.                                            
On my computer, the file is located in:                                                    
C:\Users\Robert\IdeaProjects\DateZoneProject\src                                       

Open the console by typing cmd at the command line.                                            

![image](https://user-images.githubusercontent.com/116492421/213838763-a28abb59-9ec9-4402-9801-344a4e5116b1.png)

In the next step, type the following command in the console:                                                   
java -jar launcher.jar                                                                   
After typing the command, the program should start in the console.                                              

![carbon](https://user-images.githubusercontent.com/116492421/213839258-2802c72c-d459-4c00-b920-3696805aa747.png)

# Application Development                                                      

## Prerequisite                                                     
If you want to develop the application necessary will be                                                
-	java version 19.01,
-	IntelliJ IDEA Community Edition 2022.1*.


Please find below link to a tutorial on how to properly install the above IntelliJ IDEA version:                                              
https://www.youtube.com/watch?v=S8cVBE4euus                                                          
To download, follow the link below:                                                         
https://www.jetbrains.com/idea/download/#section=windows                                                     

![thirdImage](https://user-images.githubusercontent.com/116492421/213839484-02317d47-3c3c-4e1c-aec6-fa9067d12a4c.PNG)


## Project Openning

Download the zip folder from the DateZoneProject repository with the project files.                                                           

![image](https://user-images.githubusercontent.com/116492421/213839520-4df8eea9-c05b-41ef-9598-f27baecc08c6.png)


Then save and extract project files to a specific location on your computer.                                                       
On my computer, the file is located in:                                                                        
C:\NewProject                                                                                       

![carbon](https://user-images.githubusercontent.com/116492421/213839561-8355aa13-bd94-4edc-8490-91b0c31a145f.png)


The next step is to click open in IntelliJ IDEA.                                                               

![carbon](https://user-images.githubusercontent.com/116492421/213839585-35f9352f-ae52-4ca1-b03a-9747a9d8fc16.png)


Then select the appropriate folder with the project.                                                                        

![carbon](https://user-images.githubusercontent.com/116492421/213839609-4ae90b8a-619c-4111-a6a5-94ba9d86db7b.png)


After selecting the appropriate folder, a project should open.                                                                            
We can start to make changes.                                                                                    


![carbon](https://user-images.githubusercontent.com/116492421/213839656-028c5911-c952-468a-af6b-56b9a558867f.png)








