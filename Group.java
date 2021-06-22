import java.util.ArrayList;
import java.util.HashMap;

public class Group {

    String id;
    String name;
    ArrayList<Person> members;

    static HashMap<String, Group> groupHashMap = new HashMap<>();

    public Group() {}

    public Group(String id, String name, ArrayList<Person> members) {
        this.id = id;
        this.name = name;
        this.members = members;
        this.groupHashMap.put(id, this);
    }

    public static Group getGroupById(String id) {
        return groupHashMap.get(id);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Person> getMembers() {
        return members;
    }
}
