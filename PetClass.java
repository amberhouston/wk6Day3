//question 1

public class PetClass {
    

    private String name;
    private String type;
    private String location;
    private int age;

    public PetClass(){

    }

    public PetClass(String name, String type, int age, String location)
    {
        this.name = name;
        this.type = type;
        this.location = location;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }
}
