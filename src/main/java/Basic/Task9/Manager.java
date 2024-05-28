package Basic.Task9;

public class Manager extends Employee {
    public Manager(String name, int age, String programmingLanguage) {
        super(name, age, programmingLanguage);
    }

    @Override
    public String work() {
        return super.work() + ", Detail: IT Manager is the person responsible for managing the systems and information " +
                "of the entire organization and business.";
    }
}
