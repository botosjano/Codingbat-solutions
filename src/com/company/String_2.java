package com.company;

public class String_2 {
    public String doubleChar(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            String actualElement = str.charAt(i) + "";
            res += actualElement + actualElement;
        }
        return res;
    }

    public int countHi(String str) {
        int counter = 0;
        if (str.length() >= 2) {
            for (int i = 0; i < str.length() - 1; i++) {
                String examined = str.substring(i, i + 2);
                if (examined.equals("hi")) {
                    counter++;
                }
            }
            return counter;
        }
        return counter;
    }

    public boolean catDog(String str) {
        int dogCounter = 0, catCounter = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            String catOrDog = str.substring(i, i + 3);
            if (catOrDog.equals("cat")) {
                catCounter++;
            }
            if (catOrDog.equals("dog")) {
                dogCounter++;
            }
        }
        return catCounter == dogCounter;
    }

    public int countCode(String str) {
        int counter = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            String start = str.substring(i, i + 2);
            String end = str.substring(i + 3, i + 4);

            if (start.equals("co") && end.equals("e"))
                counter++;
        }
        return counter;
    }

    public boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        String big = "";
        String small = "";

        if (a.length() >= b.length()) {
            big = a;
            small = b;
        } else {
            big = b;
            small = a;
        }

        for (int i = 0; i < big.length(); i++) {
            if (big.substring(big.length() - small.length()).equals(small)) {
                return true;
            }
        }
        return false;
    }

    public boolean xyzThere(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("xyz")) {
            return true;
        }
        for (int i = 1; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("xyz") && str.charAt(i - 1) != '.') {
                return true;
            }
        }
        return false;
    }

    public boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 1).equals("b") && str.substring(i + 2, i + 3).equals("b")) {
                return true;
            }
        }
        return false;
    }

    public boolean xyBalance(String str) {
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                counter++;
            } else if (str.charAt(i) == 'y') {
                counter = 0;
            }
        }

        return counter == 0;
    }

    public String mixString(String a, String b) {
        String bigger = "";
        String smaller = "";
        String res = "";

        if (a.length() >= b.length()) {
            bigger = a;
            smaller = b;
        } else {
            bigger = b;
            smaller = a;
        }

        int i = 0;

        for (; i < smaller.length(); i++) {
            res += a.charAt(i);
            res += b.charAt(i);
        }
        res += bigger.substring(i);

        return res;
    }

    public String repeatEnd(String str, int n) {
        String res = "";
        for (int i = 0; i < n; i++) {
            res += str.substring(str.length() - n);
        }
        return res;
    }

    public String repeatFront(String str, int n) {
        String res = "";
        int size = n;
        for (int i = 0; i < size; i++, n--) {
            res += str.substring(0, n);
        }
        return res;
    }

    public String repeatSeparator(String word, String sep, int count) {
        String res = "";
        for (int i = 0; i < count; i++) {
            res += word;
            if (i == count - 1) {
                break;
            }
            res += sep;
        }
        return res;
    }

    public boolean prefixAgain(String str, int n) {
        if (str.length() > n) {
            String prefix = str.substring(0, n);
            for (int i = n; i < str.length() - n; i++) {
                if (str.substring(i, i + n).equals(prefix)) {
                    return true;
                }
            }
            return (str.substring(n, n + n).equals(prefix));
        }
        return false;
    }

    public boolean xyzMiddle(String str) {
        if (str.contains("xyz")) {
            int i = 0;
            while (i < str.length()) {
                int xPoz = str.indexOf("xyz");
                int zPoz = xPoz + 2;
                boolean flag = Math.abs((str.length() - 1 - zPoz) - xPoz) <= 1;
                if (flag) {
                    return true;
                } else {
                    str = str.replaceFirst("xyz", "   ");
                }
                i++;
            }
        }
        return false;
    }

    public String getSandwich(String str) {
        if (str.contains("bread")) {
            int firstIdx = str.indexOf("bread");
            String myString = str;
            myString = myString.replaceFirst("bread", "");
            if (myString.contains("bread")) {
                int lastIdx = str.lastIndexOf("bread");
                return str.substring(firstIdx + 5, lastIdx);
            }
        }
        return "";
    }

    public boolean sameStarChar(String str) {
        if (str.length() == 0 || !str.contains("*") || str.length() < 3) {
            return true;
        }

        if (str.length() >= 3) {
            boolean flag = false;
            for (int i = 1; i < str.length() - 1; i++) {
                if (str.charAt(i) == '*') {
                    if (str.charAt(i - 1) == str.charAt(i + 1)) {
                        flag = true;
                    } else {
                        flag = false;
                    }
                }
            }
            return flag;
        }

        return false;
    }

    public String oneTwo(String str) {
        String res = "";
        for (int i = 0; i < str.length() - 2; i += 3) {
            res += str.substring(i + 1, i + 3) + str.charAt(i);
        }
        return res;
    }

    public String zipZap(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'z') {
                if (str.charAt(i + 2) == 'p') {
                    str = str.substring(0, i + 1) + str.substring(i + 2);
                }
            }
        }
        return str;

    }

    public String starOut(String str) {
        if (str.length() >= 3) {
            for (int i = 1; i < str.length() - 1; i++) {
                if (str.charAt(i) == '*' && str.charAt(i + 1) != '*') {
                    str = str.substring(0, i - 1) + str.substring(i + 2);
                    if (str.length() == 0) {
                        return str;
                    }
                    i = i - 1;
                } else if (str.charAt(i) == '*' && str.charAt(i + 1) == '*') {
                    str = str.substring(0, i - 1) + str.substring(i);
                    i = i - 1;
                }
            }
            if (str.charAt(0) == '*') {
                str = str.substring(2);
            }
            if (str.charAt(str.length() - 1) == '*') {
                str = str.substring(0, str.length() - 2);
            }
        }
        if (str.length() == 1) {
            if (str.charAt(0) == '*') {
                str = "";
            }
        } else if (str.length() == 2 && str.charAt(0) == '*' ||
                str.length() == 2 && str.charAt(1) == '*') {
            str = "";
        }
        return str;
    }

    public String plusOut(String str, String word) {
        String result = "";
        int sl = str.length();
        int wl = word.length();

        int pos = 0;

        for (int i = pos; i <= sl - wl; i++) {
            if (str.substring(i, i + wl).equals(word)) {
                result += word;
                pos += wl;
                i = pos - 1;
            } else {
                result += "+";
                pos++;
            }
        }

        for (int i = pos; i < str.length(); i++) {
            result += "+";
        }

        return result;
    }

    public String wordEnds(String str, String word) {
        int sl = str.length(), wl = word.length();
        String res = "";

        if (str.contains(word)) {
            if (sl > wl) {

                if (str.substring(0, wl).equals(word)) {
                    res += str.charAt(wl) + "";
                }
                for (int i = 1; i < sl - wl; i++) {
                    if (str.substring(i, i + wl).equals(word)) {
                        String s = str.charAt(i - 1) + "";
                        String s2 = str.charAt(i + wl) + "";
                        res += s + s2;
                    }
                }
                if (str.substring(sl - wl).equals(word)) {
                    res += str.charAt(sl - wl - 1) + "";
                }
            }
        }
        return res;
    }
}
