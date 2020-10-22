package com.company;

public class Logic_1 {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (!isWeekend && cigars >= 40 && cigars <= 60) {
            return true;
        } else if (isWeekend && cigars >= 40) {
            return true;
        }
        return false;
    }

    public int dateFashion(int you, int date) {
        if (you >= 8 && date >= 3 || you >= 3 && date >= 8) {
            return 2;
        } else if (you <= 2 || date <= 2) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (!isSummer && temp >= 60 && temp <= 90) {
            return true;
        } else if (isSummer && temp >= 60 && temp <= 100) {
            return true;
        }
        return false;
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (!isBirthday) {
            if (speed <= 60) {
                return 0;
            } else if (speed >= 61 && speed <= 80) {
                return 1;
            } else if (speed >= 81) {
                return 2;
            }
        } else {
            if (speed <= 60 + 5) {
                return 0;
            } else if (speed >= 61 + 5 && speed <= 80 + 5) {
                return 1;
            } else if (speed >= 81 + 5) {
                return 2;
            }
        }
        return 0;
    }

    public int sortaSum(int a, int b) {
        return (a + b >= 10 && a + b <= 19) ? 20 : a + b;
    }

    public String alarmClock(int day, boolean vacation) {
        if (!vacation) {
            if (day > 0 && day <= 5) {
                return "7:00";
            } else {
                return "10:00";
            }
        } else {
            if (day > 0 && day <= 5) {
                return "10:00";
            } else {
                return "off";
            }
        }
    }

    public boolean love6(int a, int b) {
        return (a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6 || Math.abs(b - a) == 6);
    }

    public boolean in1To10(int n, boolean outsideMode) {
        if (!outsideMode) {
            if (n >= 1 && n <= 10) {
                return true;
            }
        } else {
            if (n <= 1 || n >= 10) {
                return true;
            }
        }
        return false;
    }

    public boolean specialEleven(int n) {
        return (n % 11 == 0 || n % 11 == 1);
    }

    public boolean more20(int n) {
        return (n % 20 == 1 || n % 20 == 2);
    }

    public boolean old35(int n) {
        return ((n % 3 == 0 || n % 5 == 0) && !(n % 3 == 0 && n % 5 == 0));
    }

    public boolean less20(int n) {
        return (n % 20 == 18 || n % 20 == 19);
    }

    public boolean nearTen(int num) {
        return (num % 10 == 2 || num % 10 == 1 || num % 10 == 8 || num % 10 == 9 || num % 10 == 0);
    }

    public int teenSum(int a, int b) {
        boolean teen = (a >= 13 && a <= 19) || (b >= 13 && b <= 19);

        if (teen) {
            return 19;
        } else {
            return a + b;
        }
    }

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) {
            return false;
        } else {
            if (isMorning) {
                if (isMom) {
                    return true;
                } else {
                    return false;
                }
            }
            return true;
        }
    }

    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;
        } else if (tea >= candy * 2 || candy >= tea * 2) {
            return 2;
        } else {
            return 1;
        }
    }

    public String fizzString(String str) {
        if (str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b') {
            return "FizzBuzz";
        } else if (str.charAt(0) == 'f') {
            return "Fizz";
        } else if (str.charAt(str.length() - 1) == 'b') {
            return "Buzz";
        } else {
            return str;
        }
    }

    public String fizzString2(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz!";
        } else if (n % 3 == 0) {
            return "Fizz!";
        } else if (n % 5 == 0) {
            return "Buzz!";
        } else {
            return n + "!";
        }
    }

    public boolean twoAsOne(int a, int b, int c) {
        if (a + b == c) {
            return true;
        } else if (a + c == b) {
            return true;
        } else if (b + c == a) {
            return true;
        } else {
            return false;
        }
    }

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (!bOk) {
            return (b > a && c > b);
        } else {
            return (c > b);
        }
    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (!equalOk) {
            return (b > a && c > b);
        } else {
            return (b >= a && c >= b);
        }
    }

    public boolean lastDigit(int a, int b, int c) {
        return (a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10);
    }

    public boolean lessBy10(int a, int b, int c) {
        return (Math.abs(a - b) >= 10 || Math.abs(a - c) >= 10 || Math.abs(b - c) >= 10);
    }

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if(!noDoubles){
            return die1+die2;
        }else{
            if(die1 == die2){
                if(die1 == 6){
                    die1 = 1;
                }else{
                    die1++;
                    return die1+die2;
                }
            }
            return die1+die2;
        }
    }

    public int maxMod5(int a, int b) {
        if(a == b){
            return 0;
        }else{
            if(a % 5 == b % 5){
                return Math.min(a,b);
            }
        }
        return Math.max(a,b);
    }

    public int redTicket(int a, int b, int c) {
        if(a == 2 && b == 2 && c == 2){
            return 10;
        }else if(a == b && b == c){
            return 5;
        }else if(a != c && a != b){
            return 1;
        }else{
            return 0;
        }
    }

    public int greenTicket(int a, int b, int c) {
        if(a != b && b != c && c != a){
            return 0;
        }else if(a == b && b == c){
            return 20;
        }else if(a == b || b == c || c == a){
            return 10;
        }
        return 0;
    }

    public int blueTicket(int a, int b, int c) {
        if(a + b == 10 || b + c == 10 || a + c == 10){
            return 10;
        }else if((a + b) - (b + c) == 10 || (a + b) - (a + c) == 10  ){
            return 5;
        }else{
            return 0;
        }
    }

    public boolean shareDigit(int a, int b) {
        return (a / 10 == b / 10 || a / 10 == b % 10 || a % 10 == b / 10 || a % 10 == b % 10);
    }

    public int sumLimit(int a, int b) {
        String aString = String.valueOf(a);
        int aLength = aString.length();
        int sum = a + b;
        String sumString = String.valueOf(sum);
        int sumLength = sumString.length();

        return aLength == sumLength ? sum : a;
    }

}
