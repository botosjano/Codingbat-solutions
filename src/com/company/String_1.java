package com.company;

import java.util.Arrays;

public class String_1 {

    public static void main(String[] args) {

    }

    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2);
    }

    public String extraEnd(String str) {
        String end = str.substring(str.length() - 2);
        return end + end + end;
    }

    public String firstTwo(String str) {
        if (str.length() < 2) {
            return str;
        }
        return str.substring(0, 2);
    }

    public String firstHalf(String str) {
        return str.substring(0, (str.length() / 2));
    }

    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    public String comboString(String a, String b) {
        String shorter = "";
        String longer = "";
        if (a.length() < b.length()) {
            shorter = a;
            longer = b;
        } else {
            shorter = b;
            longer = a;
        }
        return shorter + longer + shorter;

    }

    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    public String left2(String str) {
        String end = str.substring(0, 2);
        String start = str.substring(2);
        return start + end;
    }

    public String right2(String str) {
        return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }

    public String theEnd(String str, boolean front) {
        if (front) {
            return str.substring(0, 1);
        } else {
            return str.substring(str.length() - 1);
        }
    }

    public String withouEnd2(String str) {
        if (str.length() < 3) {
            return "";
        } else {
            return str.substring(1, str.length() - 1);
        }
    }

    public String middleTwo(String str) {
        return str.substring((str.length() / 2 - 1), (str.length() / 2) + 1);
    }

    public boolean endsLy(String str) {
        if (str.length() >= 2) {
            return str.substring(str.length() - 2).equals("ly");
        }
        return false;

    }

    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }

    public String twoChar(String str, int index) {
        if (index + 2 > str.length() || index < 0) {
            return str.substring(0, 2);
        }
        return str.substring(index, index + 2);
    }

    public String middleThree(String str) {
        if (str.length() > 3) {
            return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
        }
        return str;
    }

    public boolean hasBad(String str) {
        if (str.length() > 2) {
            if (str.substring(0, 3).equals("bad")) {
                return true;
            } else if (str.length() > 3) {
                if (str.substring(1, 4).equals("bad")) {
                    return true;
                }
            }
        }
        return false;
    }

    public String atFirst(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        } else if (str.length() == 1) {
            return str.substring(0, 1) + "@";
        } else {
            return "@@";
        }
    }

    public String lastChars(String a, String b) {
        if (a.length() > 0 && b.length() > 0) {
            return a.substring(0, 1) + b.substring(b.length() - 1);
        } else if (a.length() > 0 && b.length() == 0) {
            return a.substring(0, 1) + "@";
        } else if (a.length() == 0 && b.length() > 0) {
            return "@" + b.substring(b.length() - 1);
        } else {
            return "@@";
        }

    }

    public String conCat(String a, String b) {
        if (a.length() > 0 && b.length() > 0) {
            if (a.charAt(a.length() - 1) == b.charAt(0)) {
                return a + b.substring(1);
            }
        }
        return a + b;
    }

    public String lastTwo(String str) {
        if (str.length() > 1) {
            return str.substring(0, str.length() - 2) +
                    str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
        }
        return str;
    }

    public String seeColor(String str) {
        if (str.length() >= 3) {
            if (str.substring(0, 3).equals("red")) {
                return "red";
            }
        }
        if (str.length() >= 4) {
            if (str.substring(0, 4).equals("blue")) {
                return "blue";
            }
        }
        return "";

    }

    public boolean frontAgain(String str) {
        if (str.length() > 1 && str.substring(0, 2).equals(str.substring(str.length() - 2))) {
            return true;
        }
        return false;
    }

    public String minCat(String a, String b) {
        if (a.length() < b.length()) {
            return a + b.substring(b.length() - a.length());
        } else if (b.length() < a.length()) {
            return a.substring(a.length() - b.length()) + b;
        }
        return "";
    }

    public String extraFront(String str) {
        String end = "";
        if (str.length() < 2) {
            end = str;
        } else {
            end = str.substring(0, 2);
        }

        return end + end + end;
    }

    public String without2(String str) {
        if (str.length() >= 2) {
            if (str.substring(0, 2).equals(str.substring(str.length() - 2))) {
                return str.substring(2);
            }
        }
        return str;

    }

    public String deFront(String str) {
        if (str.charAt(0) != 'a' && str.charAt(1) != 'b') {
            return str.substring(2);
        }
        if (str.charAt(0) == 'a' && str.charAt(1) != 'b') {
            return str.charAt(0) + str.substring(2);
        }
        if (str.charAt(0) != 'a' && str.charAt(1) == 'b') {
            return str.substring(1);
        }
        return str;
    }

    public String startWord(String str, String word) {
        if (str.length() >= word.length()) {
            if (str.substring(0, word.length()).equals(word) ||
                    str.substring(1, word.length()).equals(word.substring(1))) {
                return str.substring(0, word.length());
            }
        }

        return "";
    }

    public String withoutX(String str) {
        if (str.length() > 1) {
            if (str.charAt(0) == 'x' && str.charAt(str.length() - 1) == 'x') {
                return str.substring(1, str.length() - 1);
            } else if (str.charAt(0) == 'x' && str.charAt(str.length() - 1) != 'x') {
                return str.substring(1);
            } else if (str.charAt(0) != 'x' && str.charAt(str.length() - 1) == 'x') {
                return str.substring(0, str.length() - 1);
            }
        }
        if (str.length() == 1) {
            return "";
        }
        return str;
    }


    public String withoutX2(String str) {
        if (str.length() > 1) {
            if (str.charAt(0) == 'x' && str.charAt(1) == 'x') {
                return str.substring(2);
            } else if (str.charAt(0) == 'x' && str.charAt(1) != 'x') {
                return str.substring(1);
            } else if (str.charAt(0) != 'x' && str.charAt(1) == 'x') {
                return str.charAt(0) + str.substring(2);
            }
        }
        if (str.length() == 1) {
            return "";
        }

        return str;
    }

}
