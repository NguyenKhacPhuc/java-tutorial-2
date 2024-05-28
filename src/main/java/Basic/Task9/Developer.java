package Basic.Task9;

public class Developer extends Employee {
    public Developer(String name, int age, String programmingLanguage) {
        super(name, age, programmingLanguage);
    }

    @Override
    public String work() {
        return super.work() + ", Detail: People doing this job are often responsible for writing source code to build and " +
                "develop applications, websites, systems, or other software.";
    }
}
