public class Practice {

    public int max(int x, int y) {
        if (x > y)
            return x;
        else
            return y;
    }

    public int max3(int x, int y, int z) {
        return max(max(x, y), z);
    }

    public int factorial(int n) {
        int fact = 1;
        if(n>0)
        {
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            return fact;
        }
        return 0;
    }

    public int findIndex(int a[], int x) {
        for (int i = 0; i < a.length; i++) {
            if (x == a[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Practice test = new Practice();
        System.out.println("Max of 2 is"+test.max(-1, -8));
        System.out.println("Max of 3 numbers is"+test.max3(10,-5,70));
        System.out.println("Factorial is"+test.factorial(0));
        int[] p = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Index of given number in array is"+test.findIndex(p,10) );

    }
}

