package abstractClass._exercises.entities;

public abstract class TaxPayer {
    private String name;
    private Double anualIncome;

    public TaxPayer(String name, Double anualcome) {
        this.name = name;
        this.anualIncome = anualcome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }

    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }

    public abstract double tax();
}
