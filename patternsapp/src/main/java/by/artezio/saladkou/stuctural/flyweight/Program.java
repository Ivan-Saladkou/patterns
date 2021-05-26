package by.artezio.saladkou.stuctural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<UnitType> types = new ArrayList<>();
        types.add(new UnitType("foot soldier", 100, 100, 100));
        types.add(new UnitType("archer", 100, 50, 120));
        types.add(new UnitType("magician", 200, 50, 20));

        List<Unit> soldiers = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            soldiers.add(new Unit(types.get(0)));
        }

//        List<NotRefactoredUnit> units = new ArrayList<>();
//        for (int i = 0; i < 1000000; i++) {
//            units.add(new NotRefactoredUnit());
//        }

        System.out.println((Runtime.getRuntime().totalMemory()
                - Runtime.getRuntime().freeMemory()) / Math.pow(1024, 2) + " MB");

    }
}
