package student;
import java.util.*;

class Per {
    String name;
    int height;

    public Per(String name, int height) {
        this.name = name;
        this.height = height;
    }
}

public class person {

    public String[] sortpeople(String[] name, int[] height) {
        List<Per> s = new ArrayList<>();

        
        for (int i = 0; i < name.length; i++) {
            s.add(new Per(name[i], height[i]));
        }

        
        return s.stream()
                .sorted(Comparator.comparingInt((Per p) -> p.height).reversed())
                .map(p -> p.name)
                .toArray(String[]::new);
    }

    public static void main(String[] args) {
        String[] name = {"mary", "emma", "john"};
        int[] height = {180, 165, 170};

        person p = new person();
        String[] result = p.sortpeople(name, height);

        
        System.out.println(Arrays.toString(result));
    }
}
