import java.util.HashMap;

public class Person {

    String id;
    String name;

    static HashMap<String, Person> personHashMap = new HashMap<>();

    Person(String id, String name) {
        this.id = id;
        this.name = name;
        this.personHashMap.put(id, this);
    }

    public static Person getPersonById(String id){
        return personHashMap.get(id);
    }

    public int getId() {
        return this.getId();
    }

    public String getName(){
        return this.getName();
    }
}
