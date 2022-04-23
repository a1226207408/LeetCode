package 数组;

import java.util.*;

public class 两个数组的交集II350 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for (int j : nums1) {
            map1.put(j, map1.getOrDefault(j, 0) + 1);
        }
        for (int j : nums2) {
            map2.put(j, map2.getOrDefault(j, 0) + 1);
        }
        for(Integer val:map1.keySet()){
            if(map2.containsKey(val) ){
                while(map2.get(val) != 0 && map1.get(val) != 0){
                    res.add(val);
                    map2.put(val,map2.get(val) - 1);
                    map1.put(val,map1.get(val) - 1);
                }
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();

    }

    public static int[] intersect2(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] arr = new int[Math.min(nums1.length,nums2.length)];
        int index = 0;
        int i=0,j=0;
        int size1 = nums1.length - 1,size2 = nums2.length - 1;
        while(i<=size1 && j <=size2){
            if(nums1[i] == nums2[j]){
                arr[index++] = nums1[i];
                i++;
                j++;
            } else if(nums1[i] > nums2[j]){
                j++;
            }else{
                i++;
            }
        }
        return Arrays.copyOfRange(arr, 0, index);
    }

    public static void main(String[] args) {
        int[] arr1 = {4,9,5};
        int[] arr2 = {9,4,9,8,4};
        intersect2(arr1,arr2);
    }
}
