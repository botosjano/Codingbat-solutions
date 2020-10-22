package com.company;

public class Logic_2 {
    public boolean makeBricks(int small, int big, int goal) {
        if (goal / 5 <= big) {
            return small >= goal % 5;
        } else {
            return small >= goal - big * 5;
        }
    }

    public int loneSum(int a, int b, int c) {
        if (a != b && b != c && a != c) {
            return a + b + c;
        } else if (a == b && a == c) {
            return 0;
        } else if (a == c && a != b) {
            return b;
        } else if (b == c && b != a) {
            return a;
        } else if (b == a && b != c) {
            return c;
        }
        return 0;
    }

    public int luckySum(int a, int b, int c) {
        int sum = 0;
        if (a != 13 && b != 13 && c != 13) {
            sum = a + b + c;
        }
        if (a == 13) {
            sum = 0;
        }

        if (b == 13 && a != 13) {
            sum = a;
        }

        if (c == 13 && a != 13 && b != 13) {
            sum = a + b;
        }
        return sum;
    }

    public int noTeenSum(int a, int b, int c) {
        a = fixTeen(a);
        b = fixTeen(b);
        c = fixTeen(c);

        return a + b + c;
    }

    public int fixTeen(int n) {
        if (n >= 13 && n <= 19 && n != 15 && n != 16) {
            return 0;
        } else {
            return n;
        }
    }

    public int roundSum(int a, int b, int c) {
        a = round10(a);
        b = round10(b);
        c = round10(c);

        return a + b + c;
    }

    public int round10(int num) {
        int roundedValue = 0;
        if (num % 10 >= 5) {
            roundedValue = num + (10 - num % 10);
        } else {
            roundedValue = num - num % 10;
        }
        return roundedValue;
    }

    public boolean closeFar(int a, int b, int c) {
        return Math.abs(a - b) <= 1 && Math.abs(c - a) >= 2 && Math.abs(c - b) >= 2 ||
                Math.abs(a - c) <= 1 && Math.abs(b - a) >= 2 && Math.abs(b - c) >= 2;
    }

    public int blackjack(int a, int b) {
        if (a >= b && a <= 21) {
            return a;
        } else if (b >= a && b <= 21) {
            return b;
        } else if (a > 21 && b > 21) {
            return 0;
        } else if (b > 21 && a <= 21) {
            return a;
        }
        return b;
    }

    public boolean evenlySpaced(int a, int b, int c) {
        if (a != b && a != c && b != c) {
            return Math.abs(a - b) == Math.abs(b - c) || Math.abs(a - b) == Math.abs(a - c) ||
                    Math.abs(b - c) == Math.abs(a - c);
        }
        if (a == b && a == c) {
            return true;
        }
        return false;
    }

    public int makeChocolate(int small, int big, int goal) {
        int goalMinusBig = goal - big * 5;
        if (goalMinusBig >= 0 && small >= goalMinusBig) {
            return goalMinusBig;
        }
        if (goalMinusBig < 0 && small >= goal % 5) {
            return goal % 5;
        }

        return -1;
    }
}
