import java.util.ArrayList;
import java.util.HashMap;

public class Bill {
    String  id;
    String description;
    Double totalAmount;
    String groupId;
    ArrayList<String> contributors;
    ArrayList<Share> paidBy;

    static HashMap<String, Bill> billHashMap = new HashMap<>();

    public Bill(String  id, String description, Double totalAmount, String groupId,
                ArrayList<String> contributors, ArrayList<Share> paidBy) {
        this.id = id;
        this.description = description;
        this.totalAmount = totalAmount;
        this.groupId = groupId;
        this.contributors = contributors;
        this.paidBy = paidBy;
        this.billHashMap.put(id, this);
    }

    public static Bill getBillById(String id) {
        return billHashMap.get(id);
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public String getGroupId() {
        return groupId;
    }

    public ArrayList<String> getContributions() {
        return contributors;
    }

    public ArrayList<Share> getPaidBy() {
        return paidBy;
    }
}
