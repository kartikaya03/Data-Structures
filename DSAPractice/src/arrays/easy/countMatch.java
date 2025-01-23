package arrays.easy;

import java.util.List;

public class countMatch {

    public static void main(String[] args) {
        List<List<String>> items = List.of(List.of("phone", "blue", "pixel"), List.of("computer", "silver", "lenovo"), List.of("phone", "gold", "iphone"));

        String ruleKey = "color";
        String ruleValue = "silver";

        System.out.println(countMatches(items, ruleKey, ruleValue));



    }

          static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
                int index = switch (ruleKey) {
                    case "color" -> 1;
                    case "name" -> 2;
                    default -> 0;
                };

                // Count matches using streams
                return (int) items.stream()
                        .filter(item -> item.get(index).equals(ruleValue))
                        .count();
            }

        }
