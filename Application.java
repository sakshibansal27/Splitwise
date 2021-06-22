import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Application {

    public static void main(String args[]) {
        Person p1 = new Person("1", "vishal");
        Person p2 = new Person("2", "Akash");
        Person p3 = new Person("3", "Deepak");

        ArrayList personListGroup1 = new ArrayList<Person>();
        personListGroup1.add(p1);
        personListGroup1.add(p2);
        Group group1 = new Group("1", "Group 1", personListGroup1);

        ArrayList contributors1 = new ArrayList();
        contributors1.add("1");
        contributors1.add("2");
        contributors1.add("3");

        ArrayList shareList1 = new ArrayList();
        shareList1.add(new Share(Double.valueOf("200"), "1"));
        shareList1.add(new Share(Double.valueOf("100"), "2"));

        Bill bill = new Bill("b1", "Bill 1", Double.valueOf("300"), "1", contributors1, shareList1);

        System.out.println(BillManager.getGroupWiseBillSplit("1"));


        ArrayList personListGroup2 = new ArrayList<Person>();
        personListGroup2.add(p2);
        personListGroup2.add(p3);
        Group group2 = new Group("2", "Group 2", personListGroup2);

        ArrayList contributors2 = new ArrayList();
        contributors1.add("2");
        contributors1.add("3");


        ArrayList shareList2 = new ArrayList();
        shareList2.add(new Share(Double.valueOf("250"), "2"));
        shareList2.add(new Share(Double.valueOf("150"), "3"));

        Bill bill2 = new Bill("b2", "Bill 2", Double.valueOf("400"), "2", contributors2, shareList2);

        System.out.println(BillManager.getGroupWiseBillSplit("2"));



        HashMap<String, Double> netBalancePerPerson = new HashMap<>();
        for (Person person: Person.personHashMap.values()) {
            netBalancePerPerson.put(person.id, Double.valueOf("0"));
        }
        for (Group group: Group.groupHashMap.values()) {
            HashMap<String, Double> personBalancePerGroup = BillManager.getGroupWiseBillSplit(group.id);
            for (Map.Entry<String, Double> entry : personBalancePerGroup.entrySet()) {
                netBalancePerPerson.put(entry.getKey(), netBalancePerPerson.get(entry.getKey()) + entry.getValue());
            }
        }

        System.out.println(netBalancePerPerson);

    }
}
