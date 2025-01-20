import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        int [] nums = new int[3];
        nums[0]=1;
        nums[1]=2;
        nums[2]=3;
        int k;

            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            }
            for(var entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }

            ArrayList<Integer> list = map.entrySet().stream()
                    .filter(x -> x.getValue()>=k)
                    .collect(Collectors.toUnmodifiableList());


        }


        
        
    }


