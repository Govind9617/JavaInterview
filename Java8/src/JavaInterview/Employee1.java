package JavaInterview;

public class Employee1 {
    private String name;
    private String id;
    private String city;

    public Employee1(String name, String id, String city) {
        this.name = name;
        this.id = id;
        this.city = city;
    }

    public Employee1() {

    }

    @Override
    public String toString() {
        return "Empl{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
