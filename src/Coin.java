import java.util.Objects;

public class Coin implements Comparable<Coin>{
    private Integer value;
    private String country;
    private Double diameter;
    private Integer cost;

    public Coin(Integer value, String country, Double diameter, Integer cost) {
        this.value = value;
        this.country = country;
        this.diameter = diameter;
        this.cost = cost;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Double getDiameter() {
        return diameter;
    }

    public void setDiameter(Double diameter) {
        this.diameter = diameter;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "value=" + value +
                ", country='" + country + '\'' +
                ", diameter=" + diameter +
                ", cost=" + cost +
                '}';
    }

    @Override
    public int compareTo(Coin o) {
        if(!o.cost.equals(this.cost)) {
            return o.cost - this.cost;
        }
        if (!o.diameter.equals(this.diameter)) {
            return (int) (o.diameter - this.diameter);
        }
        if (!o.country.equals(this.country)) {
            return this.country.compareTo(o.country);
        }

        return o.value - this.value;
    }
}