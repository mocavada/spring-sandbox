package moc.app.Generics_Advance.C_SubstitionPrinciple;

import java.util.List;

public class Main {
    public static void build(Building building) {
        System.out.println("Constructing a new " + building.toString());
    }

    // Using WildCard
    public static void printBuildings(List<? extends Building> buildings) {
        for(int i = 0; i < buildings.size(); i++) {
            System.out.println(i + 1 + ": " + buildings.get(i).toString());
        }
    }

    static void addHouseToList(List<? super House> buildings) {
        buildings.add(new House());
        System.out.println(buildings);
    }

}

