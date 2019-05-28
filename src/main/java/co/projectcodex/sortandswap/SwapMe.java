package co.projectcodex.sortandswap;

public class SwapMe {

    public static String[] swapFirstWithLast(String[] values) {
        int index = values.length - 1;
        String first = values[0];
        String last = values[index];

        values[0] = last;
        values[index] = first;

        return values;
    }

    public static String[] swapFirstWithSecond(String[] values) {
        String first = values[0];
        String second = values[1];
        values[0] = second;
        values[1] = first;
        return values;
    }

    public static int[] swapNeighbours(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            if(i+1 < numbers.length) {
                int current = numbers[i];
                int nextCurrent = numbers[i+1];

                if(current > nextCurrent) {
                    numbers[i] = nextCurrent;
                    numbers[i+1] = current;

                }
            }
        }

        return numbers;
    }





}
