public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 8, 7, 9, 0};
        quickSort(arr, 0, 8);
        for (int a : arr) {
            System.out.print(" " + a);
        }
    }

    public static void quickSort(int[]arr, int left, int right) {
        int l = left;  //左
        int r = right; //右
        int midNum = arr[left + (right - left) / 2];  //获取中间位置值
        while (l < r) {
            //在中值左边找寻比它大的值  从第0个位置开始找
            while (arr[l] < midNum){
                l += 1;
            }
            //同理 在右边找比它小的值
            while (arr[r] > midNum) {
                r -= 1;
            }
            if ( l >= r) {
                break;
            }
            //找到了则交换
            //注意 假如一边没找到 一边找到了 那么它一定是一边遍历到了中间位置上
            //此时需要将中值与另一个或大或小（一种情况）的值交换
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            //注意 将使出现刚才说的有一个以及遍历到了中间位置上 那么在交换后  需要将这个指针向前或者向后移动
            if (arr[l] == midNum) {
                r -= 1;
            }

            if (arr[r] == midNum) {
                l += 1;
            }
        }
        //错开
        if (l == r) {
            l += 1;
            r -= 1;
        }
        if (left < r) {
            quickSort(arr, left, r);
        }

        if (right > l) {
            quickSort(arr, l, right);
        }
    }
}
