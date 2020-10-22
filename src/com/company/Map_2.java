package com.company;

import java.util.HashMap;
import java.util.Map;

public class Map_2 {
    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> resMap = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            resMap.put(strings[i], 0);
        }
        return resMap;
    }

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            map.put(s, s.length());
        }
        return map;
    }

    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String s : strings) {
            map.put(s.charAt(0) + "", s.charAt(s.length() - 1) + "");
        }
        return map;
    }

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            map.putIfAbsent(s, 0);
            Integer actWordCounter = map.get(s);
            map.put(s, actWordCounter + 1);
        }
        return map;
    }

    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            String key = String.valueOf(strings[i].charAt(0));
            if (map.containsKey(key)) {
                String value = map.get(key);
                value += strings[i];
                map.put(key, value);
            } else {
                map.put(key, strings[i]);
            }
        }
        return map;
    }

    public String wordAppend(String[] strings) {
        String result = "";
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            String key = strings[i];
            if (map.containsKey(key)) {
                int value = map.get(key);
                value++;
                if (value % 2 == 0) {
                    result += key;
                }
                map.put(key, value);
            } else {
                map.put(key, 1);
            }
        }
        return result;
    }


    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> resMap = new HashMap<>();
        Map<String, Integer> countMap = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            countMap.putIfAbsent(strings[i], 0);
            int counter = countMap.get(strings[i]);
            countMap.put(strings[i], counter + 1);
        }

        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() >= 2) {
                resMap.put(entry.getKey(), true);
            } else {
                resMap.put(entry.getKey(), false);
            }
        }
        return resMap;
    }

    public String[] allSwap(String[] strings) {
        String res = "";
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String key = String.valueOf(strings[i].charAt(0));
            if (map.containsKey(key)) {
                int pos = map.get(key);
                String temp = strings[pos];
                strings[pos] = strings[i];
                strings[i] = temp;

                map.remove(key);
            } else {
                map.put(key, i);
            }
        }
        return strings;
    }

    public String[] firstSwap(String[] strings) {
        String res = "";
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            String key = String.valueOf(strings[i].charAt(0));
            if (map.containsKey(key)) {
                int value = map.get(key);

                if (value == -1) {
                    continue;
                }
                String temp = strings[value];
                strings[value] = strings[i];
                strings[i] = temp;

                map.put(key, -1);

            } else {
                map.put(key, i);
            }
        }

        return strings;
    }

}
