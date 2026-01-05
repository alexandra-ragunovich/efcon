package Collection1.task2;

public class HeavyBox {
    private  int length;
    private int weight;
    private int height;

    HeavyBox(int length, int height, int weight) {
        this.length = length;
        this.height = height;
        this.weight = weight;
    }
    int getSize() {
        return length * height;
    }

    int getWeight() {
        return weight;
    }

    void setSize(int length, int height) {
        this.length = length;
        this.height = height;
    }

    void setWeight(int weight) {
        this.weight = weight;
    }

}
