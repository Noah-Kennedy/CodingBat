import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public List<Integer> doubling(List<Integer> nums) {
        return nums
                .stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
    }

    public List<Integer> square(List<Integer> nums) {
        return nums
                .stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
    }

    public List<String> addStar(List<String> strings) {
        return strings
                .stream()
                .map(s -> s + "*")
                .collect(Collectors.toList());
    }

    public List<String> copies3(List<String> strings) {
        return strings
                .stream()
                .map(s -> s + s +s)
                .collect(Collectors.toList());
    }

    public List<String> moreY(List<String> strings) {
        return strings
                .stream()
                .map(s -> "y" + s + "y")
                .collect(Collectors.toList());
    }

    public List<Integer> math1(List<Integer> nums) {
        return nums
                .stream()
                .map(n -> (n + 1) * 10)
                .collect(Collectors.toList());
    }

    public List<Integer> rightDigit(List<Integer> nums) {
        return nums
                .stream()
                .map(n -> n % 10)
                .collect(Collectors.toList());
    }

    public List<String> lower(List<String> strings) {
        return strings
                .stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
    }

    public List<String> noX(List<String> strings) {
        return strings
                .stream()
                .map(s -> s.replaceAll("x",""))
                .collect(Collectors.toList());
    }

    public List<Integer> noNeg(List<Integer> nums) {
        return nums
                .stream()
                .filter(n -> n >= 0)
                .collect(Collectors.toList());
    }

    public List<Integer> no9(List<Integer> nums) {
        return nums
                .stream()
                .filter(n -> n % 10 != 9)
                .collect(Collectors.toList());
    }

    public List<Integer> noTeen(List<Integer> nums) {
        return nums
                .stream()
                .filter(n -> n < 13 || n > 19)
                .collect(Collectors.toList());
    }

    public List<String> noLong(List<String> strings) {
        return strings
                .stream()
                .filter(s -> s.length() < 4)
                .collect(Collectors.toList());
    }

    public List<String> noZ(List<String> strings) {
        return strings
                .stream()
                .filter(s -> !s.contains("z"))
                .collect(Collectors.toList());
    }

    public List<String> no34(List<String> strings) {
        return strings
                .stream()
                .filter(s -> s.length() != 3 && s.length() != 4)
                .collect(Collectors.toList());
    }

    public List<String> noYY(List<String> strings) {
        return strings
                .stream()
                .map(s -> s + "y")
                .filter(s -> !s.contains("yy"))
                .collect(Collectors.toList());
    }

    public List<Integer> two2(List<Integer> nums) {
        return nums
                .stream()
                .map(n -> n * 2)
                .filter(n -> n % 10 != 2)
                .collect(Collectors.toList());
    }

    public List<Integer> square56(List<Integer> nums) {
        return nums
                .stream()
                .map(n -> n * n + 10)
                .filter(n -> n % 10 != 5 && n % 10 != 6)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

    }
}
