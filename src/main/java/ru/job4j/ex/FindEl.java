package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key)  throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                rsl = i;
                System.out.println(rsl);
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Элемент не найден");
        }
        return rsl;
    }

    public static void main(String[] args)  throws ElementNotFoundException {
        try {
            indexOf(new String[]{"dog", "cat", "hamster", "bird", "fish"}, "cat");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
