package com.company;

public class Array_1 {
    public boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        }
        return false;
    }

    public boolean sameFirstLast(int[] nums) {
        if (nums.length >= 1) {
            if (nums[0] == nums[nums.length - 1]) {
                return true;
            }
        }
        return false;
    }

    public int[] makePi() {
        int[] res = {3, 1, 4};
        return res;
    }

    public boolean commonEnd(int[] a, int[] b) {
        return (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]);
    }

    public int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }

    public int[] rotateLeft3(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[1];
        nums[1] = nums[2];
        nums[2] = temp;
        return nums;
    }

    public int[] reverse3(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[2];
        nums[2] = temp;

        return nums;
    }

    public int[] maxEnd3(int[] nums) {
        int max = 0;
        if (nums[0] >= nums[2]) {
            nums[2] = nums[0];
            nums[1] = nums[0];
        }
        if (nums[2] >= nums[0]) {
            nums[0] = nums[2];
            nums[1] = nums[2];
        }

        return nums;

    }

    public int sum2(int[] nums) {
        if (nums.length >= 2) {
            return nums[0] + nums[1];
        } else {
            if (nums.length == 1) {
                return nums[0];
            } else {
                return 0;
            }
        }
    }

    public int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};
    }

    public int[] makeEnds(int[] nums) {
        return new int[]{nums[0], nums[nums.length - 1]};
    }

    public boolean has23(int[] nums) {
        return nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3;
    }

    public boolean no23(int[] nums) {
        return nums[0] != 2 && nums[0] != 3 && nums[1] != 2 && nums[1] != 3;
    }

    public int[] makeLast(int[] nums) {
        int[] res = new int[nums.length * 2];
        res[res.length - 1] = nums[nums.length - 1];
        return res;
    }

    public boolean double23(int[] nums) {
        if (nums.length == 2) {
            return nums[0] == 2 && nums[1] == 2 || nums[0] == 3 && nums[1] == 3;
        }
        return false;
    }

    public int[] fix23(int[] nums) {
        if (nums[0] == 2 && nums[1] == 3) {
            nums[1] = 0;
        }
        if (nums[1] == 2 && nums[2] == 3) {
            nums[2] = 0;
        }
        return nums;
    }

    public int start1(int[] a, int[] b) {
        int counter = 0;
        if (a.length >= 1 || b.length >= 1) {
            if (a.length >= 1 && a[0] == 1) {
                counter++;
            }
            if (b.length >= 1 && b[0] == 1) {
                counter++;
            }
            return counter;
        }


        return 0;

    }

    public int[] biggerTwo(int[] a, int[] b) {
        if (a[0] + a[1] > b[0] + b[1]) {
            return a;
        }
        if (b[0] + b[1] > a[0] + a[1]) {
            return b;
        } else {
            return a;
        }
    }

    public int[] makeMiddle(int[] nums) {
        return new int[]{nums[nums.length / 2 - 1], (nums[nums.length / 2])};
    }

    public int[] plusTwo(int[] a, int[] b) {
        return new int[]{a[0], a[1], b[0], b[1]};
    }

    public int[] swapEnds(int[] nums) {
        int temp = 0;
        if (nums.length > 1) {
            temp = nums[0];
            nums[0] = nums[nums.length - 1];
            nums[nums.length - 1] = temp;
        }
        return nums;
    }

    public int[] midThree(int[] nums) {
        return new int[]{nums[nums.length / 2 - 1], nums[nums.length / 2], nums[nums.length / 2 + 1]};
    }

    public int maxTriple(int[] nums) {
        int max = 0;
        if (nums[0] > nums[nums.length / 2]) {
            max = Math.max(nums[0], nums[nums.length - 1]);
        } else {
            max = Math.max(nums[nums.length / 2], nums[nums.length - 1]);
        }
        return max;
    }

    public int[] frontPiece(int[] nums) {
        if (nums.length >= 2) {
            return new int[]{nums[0], nums[1]};
        }
        if (nums.length == 1) {
            return new int[]{nums[0]};
        } else {
            return new int[0];
        }
    }

    public boolean unlucky1(int[] nums) {
        if (nums.length > 1) {
            return nums[0] == 1 && nums[1] == 3 || nums[1] == 1 && nums[2] == 3 || nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3;
        }
        return false;

    }

    public int[] make2(int[] a, int[] b) {
        if (a.length >= 2) {
            return new int[]{a[0], a[1]};
        } else if (a.length == 0) {
            return b;
        }

        return new int[]{a[0], b[0]};

    }

    public int[] front11(int[] a, int[] b) {
        if (a.length >= 1 && b.length >= 1) {
            return new int[]{a[0], b[0]};
        } else if (a.length > 0 && b.length < 1) {
            return new int[]{a[0]};
        } else if (a.length < 1 && b.length > 0) {
            return new int[]{b[0]};
        }
        return new int[0];
    }

}
