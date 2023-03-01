import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Deque<Person> deque = new ArrayDeque<>();
        deque.addAll(generateClients());
        while (!deque.isEmpty()){
            System.out.println(deque.getFirst().getName() + " "  + deque.getFirst().getSecondName() + " прокатился на атракционе");
            deque.getFirst().setQuanity(deque.getFirst().getQuanity() - 1);
            if(deque.getFirst().getQuanity() == 0){
                deque.removeFirst();
            }else {
                deque.offerLast(deque.pollFirst());
            }
        }
    }
    public static List<Person> generateClients() {
        List<Person> listPerson = new ArrayList<>();
        Person gL = new Person("Gendalf", "the White", 2);
        Person nU = new Person("Naruto", "Uzumaki", 3);
        Person gP = new Person("Garry", "Potter", 4);
        Person jojo = new Person("Jozeph", "Jostar", 5);
        Person bB = new Person("Bilbo", "Baggins", 3);
        listPerson.add(gL);
        listPerson.add(nU);
        listPerson.add(gP);
        listPerson.add(jojo);
        listPerson.add(bB);
        return  listPerson;
    }
}