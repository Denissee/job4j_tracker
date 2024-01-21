package ru.job4j.ex;

public class FindEL {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i] == key) {
                result = i;
                break;
            }
        }
        if (result == -1) {
                throw new ElementNotFoundException("Could not find");
            }
        return result;
    }

    public static void main(String[] args) {
        String[] value = {"name", "word", "sofa"};
        try {
            int index = FindEL.indexOf(value, "Den");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
