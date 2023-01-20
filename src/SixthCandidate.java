public class SixthCandidate extends Candidate {
    private final boolean haveAnimals;
    private final boolean studentStatus;

    public SixthCandidate(String firstName, String lastName, int age, int height, int weight) {
        super(firstName, lastName, age, height, weight);
        this.haveAnimals = true;
        this.studentStatus = true;
    }

    public boolean isHaveAnimals() {
        return haveAnimals;
    }

    public boolean isStudentStatus() {
        return studentStatus;
    }


    @Override
    public String toString() {
        String one;
        String two;

        if (haveAnimals) {
            one = "I have one cat and one dog";
        } else {
            one = "I do not have animals";
        }

        if (studentStatus) {
            two = "I am student";
        } else {
            two = "I work in corporation";
        }

        return super.toString() + "\n" + one + "\n" + two;
    }
}
