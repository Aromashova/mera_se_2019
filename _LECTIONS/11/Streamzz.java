import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Streamzz {


    public static class PlantBox {
        public String plant;

        public PlantBox(String plant) {
            this.plant = plant;
        }

        @Override
        public String toString() {
            return "Ящик с " + plant;
        }
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("oranges", "apples", "onions", "carrots", "cabbages");

        boolean allhasS = strings.stream().allMatch(str -> str.contains("s"));
        boolean hasOranges = strings.stream().anyMatch(str -> str.contains("oranges"));
        boolean hasPeach = strings.stream().noneMatch(str -> str.contains("peach"));

        boolean loopBool = false;
        for (String string : strings) {
            if (string.contains("s")) {
                loopBool = true;
                break;
            }
        }

        strings.stream()
               .filter(plant -> plant.startsWith("o"))
               .map(plant -> { return new PlantBox(plant); })
                .forEach(plantBox -> System.out.println(plantBox.toString()));

        for (String string : strings) {
            if (string.startsWith("o")) {
                System.out.println(new PlantBox(string));
            }
        }

        String reduced = strings.stream().reduce("Фрукты:", (s, s2) -> s + s2 + ",");

        System.out.println(reduced);

        List<PlantBox> boxes = strings.stream().map(plant -> new PlantBox(plant)).collect(Collectors.toList());
        Map<String, PlantBox> collect = strings.stream()
                                               .map(plant -> new PlantBox(plant))
                                               .collect(Collectors.toMap(box -> box.plant, box -> box));

        Map<Character, List<String>> grouped = strings.stream().collect(Collectors.groupingBy(fruit -> fruit.toCharArray()[0]));


        System.out.println(collect);
    }
}
