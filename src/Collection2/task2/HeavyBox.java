package Collection2.task2;

public class HeavyBox implements Comparable<HeavyBox> {
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
    @Override
    public int compareTo(HeavyBox other) {

         int cmp = Integer.compare(this.weight, other.weight);
         if (cmp == 0) {

             return Integer.compare(this.getSize(), other.getSize());
         }
         return cmp;
    }
    @Override public String toString() {
        return "weight=" + weight + ", size=" + getSize();
    }
}
