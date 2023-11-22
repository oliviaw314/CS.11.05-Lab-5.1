public class ArrayUtility {

    public static void print(int[] array) {
        for (int num: array) {
            System.out.println(num+"");
        }
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int num: array) {
            sum+=num;
        }
        return sum;
    }

    public static double average(int[] array) {
        double total = 0;
        for (int num: array) {
            total+=num;
        }
        return Math.floor((total/array.length)*100.0)/100.0;
    }
    public static int minimum(int[] array) {
        int minimum = array[0];
        for (int i = 0; i<array.length; i++) {
            if (array[i]<minimum) {
                minimum = array[i];
            }
        }
        return minimum;
    }

    public static int maximum(int[] array) {
        int maximum = array[0];
        for (int i = 0; i<array.length; i++) {
            if (array[i]>maximum) {
                maximum = array[i];
            }
        }
        return maximum;
    }

    public static int evenCount(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num%2==0) {
                count++;
            }
        }
        return count;
    }

    public static int[] reverseOne(int[] array) {
        int[] secondArray = new int[array.length];
        for (int i=0; i<array.length; i++) {
            secondArray[i]=array[array.length-1-i];
        }
        return secondArray;
    }

    public static void reverseTwo(int[] array) {
        int replaceValue = array.length-1;
        for (int i=0; i<array.length/2; i++) {
            int temp = array[i];
            array[i]=array[replaceValue-i];
            array[replaceValue-i]=temp;
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for (int number : array) {
            if (number==num) return true;
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for (String word : array) {
            if (word.equals(str)) return true;
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for (int i=0; i<array.length; i++) {
            array[i]*=2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for (int i=0; i<array.length; i++) {
            array[i]*=n;
        }
    }

    public static String toString(int[] array) {
        String result = "";
        for (int i=0; i<array.length; i++) {
           result+=array[i];
            if (i!=array.length-1) result+=", ";
            }
        return result;
        }

    public static boolean twoSum(int[] array, int num) {
        for (int checkNumber=0; checkNumber<array.length; checkNumber++) {
            for (int i=checkNumber+1; i<array.length; i++) {
                if (array[checkNumber]+array[i]==num) return true;
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        int temp = array[array.length-1];
        for (int i=array.length-1; i>0; i--) {
              array[i]=array[i-1];
        }
        array[0]=temp;
    }

    public static void shiftLeft(int[] array) {
        int temp = array[0];
        for (int i=0; i<array.length-1; i++) {
            array[i]=array[i+1];
        }
        array[array.length-1]=temp;
    }

    public static void shiftRightNTimes(int[] array, int n) {
        for (int i=0; i<n; i++) {
            shiftRight(array);
        }
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        for (int i=0; i<n; i++) {
            shiftLeft(array);
        }
    }


}
