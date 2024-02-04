import cz.engeto.ja.guests.Guest;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Guest> guest = new ArrayList<>());
        guest.add(new Guest("Adela", "Malikova", "13.3.1993"));
        guest.add(new Guest("Jana", "Dvoracka", "5.5.1995"));

        for (int i = 0; i < 8; i++){
            guest.add(new Guest("" + i, "",));
        }
        for (Guest guest : guest) {
            System.out.println(guest.getName()+guest.getSurname()+guest.getBirthdate());
        }
    }
}