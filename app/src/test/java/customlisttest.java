import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import java.util.ArrayList;

public class customlisttest {
    private CustomList customList;

    public void createList(){
        customList = new CustomList(null, new ArrayList<City>());
    }

    public void addCityTest(){
        int listSize = customList.getCount();
        customList.addCity(new City("Halifax", "NS"));
        assertEquals(customList.getCount(), listSize+1);
    }
}
