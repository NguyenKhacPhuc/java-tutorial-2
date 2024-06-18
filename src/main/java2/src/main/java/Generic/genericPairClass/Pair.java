package Generic.genericPairClass;

public class Pair<K, V> {
    private K id;
    private V name;

    public Pair(K id, V name) {
        this.id = id;
        this.name = name;
    }

    public K getId() {
        return id;
    }

    public void setId(K id) {
        this.id = id;
    }

    public V getName() {
        return name;
    }

    public void setName(V name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}
