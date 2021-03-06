package komendant.age.of.empires;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AgeOfEmpires {

    List<Civilizations> civilizations;
    List<Unit> units;
    List<Structure> structures;
    List<Technology> technologies;

    static class Civilizations{
        int id;
        String name;
        String expansion;
        @SerializedName("army_type")
        String armyType;
        @SerializedName("unique_unit")
        String[] uniqueUnit;
        @SerializedName("unique_tech")
        String[] uniqueTech;
        @SerializedName("team_bonus")
        String teamBonus;
        @SerializedName("civilization_bonus")
        String[] civBonus;


        @Override
        public String toString() {
            return name;
        }

    }

    class Unit{
        int id;
        String name;
        String expansion;
        String age;
        @SerializedName("created_in")
        String createdIn;
        Cost cost;
        @SerializedName("build_time")
        int buildTime;
        @SerializedName("movement_rate")
        double movementRate;
        @SerializedName("line_of_sight")
        int lineOfSight;
        @SerializedName("hit_points")
        int hitPoints;
        int attack;
        String armor;

        @Override
        public String toString() {
            return name;
        }

    }

    class Structure{
        int id;
        String name;
        String expansion;
        String age;
        Cost cost;
        @SerializedName("build_time")
        int buildTime;
        @SerializedName("hit_points")
        int hitPoints;
        @SerializedName("line_of_sight")
        int lineOfSight;
        String armor;

        @Override
        public String toString() {
            return name;
        }
    }

    class Technology{
        int id;
        String name;
        String expansion;
        String age;
        @SerializedName("develops_in")
        String developsIn;
        Cost cost;
        @SerializedName("build_time")
        int buildTime;

        @Override
        public String toString() {
            return name;
        }
    }

    static class NotFoundError{
        String message;
    }

    class Cost{
        @SerializedName("Wood")
        int wood;
        @SerializedName("Food")
        int food;
        @SerializedName("Stone")
        int stone;
        @SerializedName("Gold")
        int gold;
    }
}
