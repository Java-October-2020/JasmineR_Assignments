public class Project{
    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }
    public String getName(){
        return this.name; 
    }
    public String getDescription(){
        return this.description;
    }
    public void setName (String name){
        this.name = name; 
    }
    public void setDescription (String description){
        this.description = description;
    }
}