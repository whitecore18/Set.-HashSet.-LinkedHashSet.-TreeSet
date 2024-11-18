import java.util.HashSet;
import java.util.Set;

class ColorSets {
    public static void main(String[] args) {
        Set<String> colorsSet1 = new HashSet<>();
        colorsSet1.add("красный");
        colorsSet1.add("синий");
        colorsSet1.add("зеленый");
        colorsSet1.add("желтый");

        Set<String> colorsSet2 = new HashSet<>();
        colorsSet2.add("синий");
        colorsSet2.add("желтый");
        colorsSet2.add("фиолетовый");
        colorsSet2.add("черный");

        Set<String> commonColors = compareSets(colorsSet1, colorsSet2);
        System.out.println("Общие цвета: " + commonColors);

        Set<Integer> numbersSet = new HashSet<>();
        numbersSet.add(10);
        numbersSet.add(15);
        numbersSet.add(20);
        numbersSet.add(22);
        numbersSet.add(25);
        numbersSet.add(30);
        numbersSet.add(5);
        numbersSet.add(8);

        System.out.println("Элементы больше 15 и четные:");
        for (Integer number : numbersSet) {
            if (number > 15 && number % 2 == 0) {
                System.out.println(number);
            }
        }

        System.out.println("Остальные числа, разделенные на 2:");
        for (Integer number : numbersSet) {
            if (!(number > 15 && number % 2 == 0)) {
                System.out.println(number / 2.0);
            }
        }
    }

    public static Set<String> compareSets(Set<String> set1, Set<String> set2) {
        Set<String> common = new HashSet<>(set1);
        common.retainAll(set2);
        return common;
    }
}