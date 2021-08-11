package 二分查找;

import java.util.Arrays;

public class BinarySearch {

    public int binarySearch(int[] q,int x){
        int low = 0,high = q.length - 1;
        while (low <= high){
            int mid = low + (high - low >> 1);
            if (q[mid] == x) return mid;
            else if (q[mid] > x) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }

    public int binarySearchWithDuplicatedDataReturnFirst(int[] q,int x){
        int low = 0,high = q.length - 1;
        while (low <= high){
            int mid = low + (high - low >> 1);
            if (q[mid] == x){
                if (mid == 0 || q[mid - 1] != x) return mid;
                else high = mid - 1;
            }
            else if (q[mid] > x) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }
    public int binarySearchWithDuplicatedDataReturnLast(int[] q,int x){
        int low = 0,n = q.length - 1,high = n;
        while (low <= high){
            int mid = low + (high - low >> 1);
            if (q[mid] == x){
                if (mid == n || q[mid + 1] != x) return mid;
                else low = mid + 1;
            }
            else if (q[mid] > x) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }

    public int binarySearchReturnFirstEqualOrBiggerNum(int[] q,int x){
        int low = 0,n = q.length - 1,high = n;
        while (low <= high){
            int mid = low + (high - low >> 1);
            if (q[mid] >= x){
                if (mid == 0 || q[mid - 1] < x) return mid;
                else high = mid - 1;
            }
            else low = mid + 1;
        }
        return -1;
    }

    public int binarySearchReturnLastEqualOrSmallerNum(int[] q,int x){
        int low = 0,n = q.length - 1,high = n;
        while (low <= high){
            int mid = low + (high - low >> 1);
            if (q[mid] <= x){
                if (mid == n || q[mid + 1] > x) return mid;
                else low = mid + 1;
            }
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] q = new int[]{1,3,3,3,4,7,8,9,99};
        System.out.println(binarySearch.binarySearchWithDuplicatedDataReturnFirst(q,3));
        System.out.println(binarySearch.binarySearchWithDuplicatedDataReturnLast(q,3));
        System.out.println(binarySearch.binarySearchReturnFirstEqualOrBiggerNum(q,4));
        System.out.println(binarySearch.binarySearchReturnLastEqualOrSmallerNum(q,10));


    }
}
