package Basic.Task10;

public class Building {
    private String material;

    public Building(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        if (material != null && material.matches("^[a-zA-Z0-9 ]*$") && material.equals(material.trim())) {
            this.material = material;
        } else {
            System.out.println("Invalid");
        }
    }

    @Override
    public String toString() {
        return "Building{" +
                "material='" + material + '\'' +
                '}';
    }
}
