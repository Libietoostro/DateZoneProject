public class firstCandidate extends Candidate {
    private final boolean ownBusiness;
    private final boolean loveAnimals;


    public firstCandidate(String firstName, String lastName, int age, int height, int weight) {
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

}
