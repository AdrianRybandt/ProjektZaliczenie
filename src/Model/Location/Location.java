package Model.Location;

public abstract class Location{
    private String name;
    private String description;

    public Location(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Location(){}

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }
}
