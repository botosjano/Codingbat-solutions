package com.company;

public class String_3 {
    public int countYZ(String str) {
        str = str.toLowerCase();
        int counter = 0;
        for (int i = 1; i < str.length(); i++) {
            if (!Character.isLetter(str.charAt(i))) {
                if (str.charAt(i - 1) == 'z' || str.charAt(i - 1) == 'y') {
                    counter++;
                }
            }
        }

        if (str.charAt(str.length() - 1) == 'z' || str.charAt(str.length() - 1) == 'y')
            counter++;

        return counter;
    }

    public String withoutString(String base, String remove) {
        int bL = base.length(), rL = remove.length();
        String res = base;
        for (int i = 0; i < bL - rL; i++) {
            String substring = res.substring(i, i + rL);
            if (substring.equalsIgnoreCase(remove)) {
                res = res.substring(0, i) + res.substring(i + rL);
                bL -= rL;
                i--;
            }
        }

        if (res.length() >= rL && res.substring(res.length() - rL).equalsIgnoreCase(remove)) {
            res = res.substring(0, res.length() - rL);
        }
        return res;
    }

    public boolean equalIsNot(String str) {
        int isCounter = 0, notCounter = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("is")) {
                isCounter++;
            }
            if (str.substring(i, i + 3).equals("not")) {
                notCounter++;
            }
        }
        if (str.length() >= 3) {
            if (str.substring(str.length() - 3, str.length() - 1).equals("is"))
                isCounter++;

            if (str.substring(str.length() - 2).equals("is"))
                isCounter++;

            if (str.substring(str.length() - 3).equals("not"))
                notCounter++;
        }
        return isCounter == notCounter;
    }

    public boolean gHappy(String str) {
        int flag = -1;
        if (str.contains("g") && str.length() >= 2) {
            for (int i = 1; i < str.length() - 1; i++) {
                if (str.charAt(i) == 'g') {
                    if (str.charAt(i - 1) == 'g' || str.charAt(i + 1) == 'g') {
                        flag = 0;
                    } else {
                        flag = -1;
                    }
                }
            }
            char penult = str.charAt(str.length() - 2);
            char last = str.charAt(str.length() - 1);

            if (last == 'g' && penult == 'g') flag = 0;
            if (last == 'g' && penult != 'g') flag = -1;
        }
        return flag == 0 || str.length() == 0;
    }

    public int countTriple(String str) {
        int triples = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 2) {
                if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
                    triples++;
                }
            }
        }
        return triples;
    }

    public int sumDigits(String str) {
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                res += Integer.parseInt(str.charAt(i) + "");
            }
        }
        return res;
    }

    public String sameEnds(String string) {
        int len = string.length();
        String fin = "";
        String tmp = "";

        for (int i = 0; i < len; i++) {
            tmp += string.charAt(i);
            int tmplen = tmp.length();
            if (i < len / 2 && tmp.equals(string.substring(len - tmplen)))
                fin = tmp;
        }
        return fin;
    }

    public String mirrorEnds(String string) {
        String result = "";
        int len = string.length();

        for (int i = 0; i < len; i++) {
            if (string.charAt(i) == string.charAt(len - 1 - i))
                result += string.charAt(i);
            else
                return result;
        }
        return result;
    }

    public int maxBlock(String str) {
        int max = 0, counter = 0;
        if (str.length() > 0) {
            max = 1;
            counter = 1;
            for (int i = 0; i < str.length() - 1; i++) {
                char c = str.charAt(i);
                char next = str.charAt(i + 1);
                if (c == next) {
                    counter++;
                } else {
                    if (counter > max) {
                        max = counter;
                    }
                    counter = 1;
                }
            }
            if (counter > max) {
                max = counter;
            }
        }
        return max;
    }

    public int sumNumbers(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                int j = i;
                String temp = "";
                while (j < str.length() && Character.isDigit(str.charAt(j))) {
                    temp += str.charAt(j);
                    j++;
                }
                sum += Integer.parseInt(temp);
                i = j - 1;
            }
        }
        return sum;
    }

    public String notReplace(String str) {
        if (str.equals("is")) {
            return "is not";
        }
        if (str.length() >= 2) {
            for (int i = 0; i < str.length() - 1; i++) {
                String actual = str.substring(i, i + 2);
                if (i < str.length() - 2 && actual.equals("is") && !Character.isLetter(str.charAt(i + 2))) {
                    if (i > 0 && str.charAt(i - 1) == ' ' || i == 0) {
                        str = str.substring(0, i) + "is not" + str.substring(i + 2);
                        i = i + 5;
                    }
                }
            }
            if (str.endsWith("is") && !Character.isLetter(str.charAt(str.length() - 3))) {
                str += " not";
            }
        }
        return str;
    }


}
