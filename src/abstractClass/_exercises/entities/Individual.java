package abstractClass._exercises.entities;

public class Individual extends TaxPayer {

    private Double healthExpenditures;

    public Individual(String name, Double anualcome, Double healthExpenditures) {
        super(name, anualcome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        if (getAnualIncome() < 20000) {
            return getAnualIncome() * 0.15 - healthExpenditures * 0.05;
        } else {
            return getAnualIncome() * 0.25 - healthExpenditures * 0.5;
        }
    }
}
