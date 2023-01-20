public class FifthCandidate extends Candidate {
    private final boolean smoking;
    private final boolean italianCuisine;


    public FifthCandidate(String firstName, String lastName, int age, int height, int weight) {
        super(firstName, lastName, age, height, weight);
        this.smoking = true;
        this.italianCuisine = true;
    }

    public boolean isSmoking() {
        return smoking;
    }

    public boolean isItalianCuisine() {
        return italianCuisine;
    }


    @Override
    public String toString() {
        String one;
        String two;

        if (smoking) {
            one = "I smoke cigarettes";
        } else {
            one = "I do not smoke";
        }

        if (italianCuisine) {
            two = "I love Italian cuisine";
        } else {
            two = "I do not like Italian cuisine";
        }

        return super.toString() + "\n" + one + "\n" + two;
    }
}

