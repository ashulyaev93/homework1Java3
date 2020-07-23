package homework1Java3;

public abstract class Fruit { //возвращаем вес;
    protected float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }
}