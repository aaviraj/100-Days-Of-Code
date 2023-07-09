import java.util.*;

class Solution {
    public long makeSimilar(int[] nums, int[] target) {
        Arrays.sort(nums);
        Arrays.sort(target);
        List<Integer> even1 = getEven(nums, true);
        List<Integer> odd1 = getEven(nums, false);
        List<Integer> even2 = getEven(target, true);
        List<Integer> odd2 = getEven(target, false);
        long diff = 0;
        for (int i = 0 ; i < even1.size(); i++) {
            if (even1.get(i) > even2.get(i)) {
                diff += even1.get(i) - even2.get(i);
            }
        }
        for (int i = 0 ; i < odd1.size(); i++) {
            if (odd1.get(i) > odd2.get(i)) {
                diff += odd1.get(i) - odd2.get(i);
            }
        }
        
        
        return diff / 2;
    }
    
    private List<Integer> getEven(int[] nums, boolean flag) {
        List<Integer> list = new ArrayList<>();
        for (int n : nums) {
            if (flag) {
                if (n % 2 == 0) {
                    list.add(n);                
                }   
            } else {
                if (n % 2 != 0) {
                    list.add(n);                
                }
            }
        }
        return list;
    }
}