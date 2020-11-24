package ChungKhoan.Service;

public class TransferStringToInt {
    public static int[] transferStringToInt(String[] arr) {
        int[] digits = new int[arr.length];
        for (int i=0;i<arr.length;i++) {
            int digit = transfer(arr[i]);
            digits[i]=digit;
        }
        return digits;
    }

    private static int transfer(String item) {
        if (isScale(item)) {
            return 2;
        } else if (isDate(item)) {
            return 3;
        } else if (isNumber(item)) {
            return 4;
        } else {
            return 1;
        }
    }

    private static boolean isNumber(String item) {
        try {
            Double.parseDouble(item);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isScale(String item) {
        if (item.indexOf("%") != -1) {
            return true;
        }
        return false;
    }

    private static boolean isDate(String item) {
        if (item.indexOf("/") != -1) {
            return true;
        }
        return false;
    }
}
