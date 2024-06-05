public class Person2 {

    private String name;
    
    public Person2(String name)
    {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (this.name != null) {
            this.name = name;
        } else {
            System.out.println("Invalid name");
        }
    }

    public String getDetails() {
        return "Name: " + name;
    }
}
