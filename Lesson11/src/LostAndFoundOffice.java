import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LostAndFoundOffice {

    List<Object> things = new ArrayList<>();

    public void put(Object object) {
        things.add(object);
    }

    public boolean check(Object target) {
        if(target == null) {
            return false;
        }
        for (Object object : things) { // логика проверки вещи в списке
            if (object.equals(target)) {
                return true;
            }
        }
        return false;
    }
}

    // создайте список things

    // реализуйте метод put()

    // реализуйте метод check()


