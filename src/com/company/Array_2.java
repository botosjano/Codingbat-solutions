package com.company;

public class Array_2 {
    public int countEvens(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public int bigDiff(int[] nums) {
        int max = nums[0];
        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {
            min = Math.min(nums[i], min);
            max = Math.max(nums[i], max);
        }

        return max - min;
    }

    public int centeredAverage(int[] nums) {
        int min = nums[0], max = nums[0], sum = 0;
        ;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(nums[i], max);
            min = Math.min(nums[i], min);
            sum += nums[i];
        }
        sum = sum - max - min;
        return sum / (nums.length - 2);
    }

    public int sum13(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i++;
            } else {
                sum += nums[i];
            }
        }
        return sum;
    }

    public int sum67(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        boolean flag = true;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 6 && flag) {
                sum += nums[i];
            }
            if (nums[i] == 6) flag = false;
            if (nums[i] == 7) flag = true;
        }
        return sum;
    }

    public boolean has22(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                return true;
            }
        }
        return false;
    }

    public boolean lucky13(int[] nums) {
        boolean flag1 = false, flag3 = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) flag1 = true;
            if (nums[i] == 3) flag3 = true;

            if (flag1 || flag3) {
                return false;
            }
        }
        return true;
    }

    public boolean sum28(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                sum += nums[i];
            }
        }
        return sum == 8;
    }

    public boolean more14(int[] nums) {
        int counter1 = 0, counter4 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) counter1++;
            if (nums[i] == 4) counter4++;
        }
        return counter1 > counter4;
    }

    public int[] fizzArray(int n) {
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public boolean only14(int[] nums) {
        boolean flag = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1 && nums[i] != 4) return false;

        }
        return true;
    }

    public String[] fizzArray2(int n) {
        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + "";
        }
        return arr;
    }

    public boolean no14(int[] nums) {
        boolean flag1 = false, flag4 = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) flag1 = true;
            if (nums[i] == 4) flag4 = true;
        }
        if (flag1 && flag4) {
            return false;
        }
        return true;
    }

    public boolean isEverywhere(int[] nums, int val) {
        boolean flag = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == val || nums[i + 1] == val) {
                flag = true;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean either24(int[] nums) {
        boolean twoFlag = false;
        boolean fourFlag = false;

        for (int i = 0; i < nums.length - 1; i++) {
            boolean two = nums[i] == 2 && nums[i + 1] == 2;
            boolean four = nums[i] == 4 && nums[i + 1] == 4;
            if (two && !four && !twoFlag) {
                twoFlag = true;
            }
            if (!two && four && !fourFlag) {
                fourFlag = true;
            }
            if (twoFlag && fourFlag) {
                return false;
            }
        }
        return twoFlag || fourFlag;
    }

    public int matchUp(int[] nums1, int[] nums2) {
        int counter = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] != nums2[i] && Math.abs(nums1[i] - nums2[i]) <= 2) {
                counter++;
            }
        }
        return counter;
    }

    public boolean has77(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums.length >= 2 && i < nums.length - 2) {
                if (nums[i] == 7 && nums[i + 1] == 7) return true;
                if (nums[i] == 7 && nums[i + 1] != 7 && nums[i + 2] == 7) return true;
            } else if (nums.length >= 2 && nums[nums.length - 2] == 7 && nums[nums.length - 1] == 7) return true;


        }
        return false;
    }

    public boolean has12(int[] nums) {
        boolean flag1 = false, flag2 = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) flag1 = true;
            if (nums[i] == 2 && flag1) flag2 = true;

            if (flag1 && flag2) {
                return true;
            }
        }
        return false;
    }

    public boolean modThree(int[] nums) {
        int len = nums.length;
        boolean evensFlag = false, oddsFlag = false;
        for (int i = 0; i < len; i++) {
            if (len >= 3) {
                if (i < len - 2) {
                    if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0) return true;
                    if (nums[i] % 2 != 0 && nums[i + 1] % 2 != 0 && nums[i + 2] % 2 != 0) return true;
                } else {
                    if (nums[len - 3] % 2 == 0 && nums[len - 2] % 2 == 0 && nums[len - 1] % 2 == 0) return true;
                    if (nums[len - 3] % 2 != 0 && nums[len - 2] % 2 != 0 && nums[len - 1] % 2 != 0) return true;
                }
            }
        }
        return false;
    }

    public boolean haveThree(int[] nums) {
        int len = nums.length;
        int counter = 0;

        if (len >= 3) {
            for (int i = 0; i < len - 1; i++) {
                if (nums[i] == 3 && nums[i + 1] != 3) {
                    counter++;
                }
            }

            if (nums[len - 2] != 3 && nums[len - 1] == 3) {
                counter++;
            }
            return counter == 3;
        }
        return false;
    }

    public boolean twoTwo(int[] nums) {
        boolean hasTwo = false;
        boolean flag = false;
        int len = nums.length;
        if (len == 2 && (nums[0] != 2 || nums[1] != 2)) return false;
        if (len == 1 && nums[0] == 2) return false;
        for (int i = 0; i < len - 1; i++) {
            if (nums[i] == 2) {
                hasTwo = true;
                if (i == 0) {
                    if (nums[i + 1] == 2) {
                        flag = true;
                    } else {
                        return false;
                    }
                }
                if (i > 0) {
                    if (nums[i - 1] == 2 || nums[i + 1] == 2) {
                        flag = true;
                    } else {
                        return false;
                    }
                }
            }
        }
        if (len >= 2 && nums[len - 1] == 2 && nums[len - 2] != 2) flag = false;
        if (!hasTwo) return true;
        return flag;
    }

    public boolean sameEnds(int[] nums, int len) {
        boolean foo = true;
        for (int i = 0; i < len; i++) {
            if (nums[i] == nums[nums.length - len + i])
                foo = true;
            else
                return false;
        }
        return true;
    }

    public boolean tripleUp(int[] nums) {
        int len = nums.length;
        for(int i = 0; i < len; i++){
            if(len >= 3){
                if(i < len - 2){
                    if( nums[i+1]-nums[i] == 1 && nums[i+2]-nums[i+1] == 1){
                        return true;
                    }
                }else{
                    if(nums[len-2]-nums[len-3] == 1 && nums[len-1]-nums[len-2] == 1){
                        return true;
                    }
                }
            }else{
                return false;
            }
        }
        return false;
    }

    public int[] fizzArray3(int start, int end) {
        int arr[] = new int[end-start];
        int j = 0;
        for(int i = start; i < end;i++, j++){
            arr[j] = i;
        }
        return arr;
    }

    public int[] shiftLeft(int[] nums) {
        int arr[] = new int[nums.length];
        int j = 0;
        for(int i = 1; i < nums.length; i++, j++){
            arr[j] = nums[i];
        }
        if(nums.length > 0){
            arr[j] = nums[0];
        }

        return arr;
    }

    public int[] tenRun(int[] nums) {
        boolean flag = false;
        if(nums.length == 0) return nums;

        int temp = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 10 == 0){
                temp = nums[i];
                flag = true;
            }
            else{
                if(flag)
                    nums[i] = temp;
            }
        }
        return nums;
    }

    public int[] pre4(int[] nums) {

        int arr[] = new int[0];
        boolean flag = false;

        for (int i = 0; i < nums.length; i++) {
            if (!flag && nums[i] == 4) {
                flag = true;
                arr = new int[i];
                i = 0;
            }
            if (flag && i < arr.length) {
                arr[i] = nums[i];
            }
        }
        return arr;
    }

    public int[] post4(int[] nums) {
        int arr[] = new int[0];
        boolean found = false;

        int j = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (!found && nums[i] == 4) {
                found = true;
                arr = new int[j];
                i = nums.length - 1;
            }
            if(!found)
                j++;
            if (found && j > 0) {
                j--;
                arr[j] = nums[i];
            }
        }
        return arr;
    }

    public int[] notAlone(int[] nums, int val) {
        for(int i = 0; i < nums.length-1; i++){
            if(i > 0 && nums[i] == val && nums[i-1] != val && nums[i+1] != val){
                int bigger = Math.max(nums[i-1], nums[i+1]);
                nums[i] = bigger;
            }
        }
        return nums;
    }

    public int[] zeroFront(int[] nums) {
        int pos = -1;
        //if(nums[0] == 0) pos = 1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) pos++;
            if (i > 0) {
                if (nums[i] == 0 && nums[i - 1] != 0) {
                    int temp = nums[i - 1];
                    nums[pos] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        return nums;
    }

    public int[] withoutTen(int[] nums) {
        int arr[] = new int[nums.length];
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 10){
                arr[j++] = nums[i];
            }
        }
        return arr;
    }

    public int[] zeroMax(int[] nums) {
        int maxOdd = Integer.MIN_VALUE;
        for(int i = nums.length-1; i >= 0; i--){
            if(nums[i] % 2 != 0 && maxOdd < nums[i]){
                maxOdd = nums[i];
            }
            if(nums[i] == 0 && maxOdd != Integer.MIN_VALUE){
                nums[i] = maxOdd;
            }
        }
        return nums;
    }

    public int[] evenOdd(int[] nums) {
        int pos = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                int temp = nums[pos];
                nums[pos] = nums[i];
                nums[i] = temp;
                pos++;
            }
        }
        return nums;
    }

    public String[] fizzBuzz(int start, int end) {
        String arr[] = new String[end-start];
        int j = 0;
        for(int i = start; i < end; i++){
            if(i % 3 != 0 && i % 5 != 0){
                arr[j++] = i+"";
            }
            else if(i % 3 == 0 && i % 5 != 0){
                arr[j++] = "Fizz";
            }
            else if(i % 3 != 0 && i % 5 == 0){
                arr[j++] = "Buzz";
            }
            else{
                arr[j++] = "FizzBuzz";
            }
        }
        return arr;
    }


}
