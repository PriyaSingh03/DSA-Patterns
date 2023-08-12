package pattern;

import input.string;

public class pattern1 {
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern6(5);
        pattern7(5);
        pattern8(5);
        pattern9(6);
        pattern10(5);
        pattern11(5);
        pattern12(5);
        pattern13(5);
        pattern14(5);
        pattern15(5);
        pattern16(5);
        pattern17(5);
    }

    /*
    *****
    *****
    *****
    *****
    */

    static void pattern1(int n) {
        System.out.println("First Pattern: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
     *
     **
     ***
     ****
     *****
     */
    static void pattern2(int n) {
        System.out.println("Second Pattern: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
    *****
    ****
    ***
    **
    *
    */
    static void pattern3(int n) {
        System.out.println("Third Pattern: ");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
     * 1
     * 1 2
     * 1 2 3
     * 1 2 3 4
     * 1 2 3 4 5
     */
    static void pattern4(int n) {
        System.out.println("Fourth Pattern: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*
    *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
    */
    static void pattern5(int n) {
        System.out.println("Fifth Pattern: ");
        // Upper half of the pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // Lower half of the pattern
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
         *
        **
       ***
      ****
     *****
    */
    static void pattern6(int n) {
        System.out.println("Sixth pattern: ");
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    *****
     ****
      ***
       **
        *
    */
    static void pattern7(int n) {
        System.out.println("Seventh Pattern: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
        *
       ***
      *****
     *******
    *********
     */
    static void pattern8(int n) {
        System.out.println("Eighth pattern: ");
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    *********
     *******
      *****
       ***
        *
    */
    static void pattern9(int n) {
        System.out.println("Ninth pattern: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * (n - i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // *
    // **
    // ***
    // ****
    // *****

    static void pattern10(int n) {
        System.out.println("Tenth Pattern: ");
        for (int i = 1; i <= n; i++) {
            for (int k = n - i; k >= 1; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
     * * * * *
     * * * *
     * * *
     * *
     *
     */
    static void pattern11(int n) {
        System.out.println("Eleventh Pattern: ");
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= i - 1; k++) {
                System.out.print(" ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
     * * * * *
     * * * *
     * * *
     * *
     *
     *
     * *
     * * *
     * * * *
     * * * * *
     */
    static void pattern12(int n) {
        System.out.println("12th Pattern: ");
        // Upper triangle
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= i - 1; k++) {
                System.out.print(" ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // Lower Triangle
        for (int i = 1; i <= n; i++) {
            for (int k = n - i; k >= 1; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // *
    // * *
    // * *
    // * *
    // *********
    static void pattern13(int n) {
        System.out.println("13th Pattern: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + i; j++) {
                if (i == n - 1 || j == n + i - 1 || j == n - i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // *********
    // * *
    // * *
    // * *
    // *
    static void pattern14(int n) {
        System.out.println("14th Pattern: ");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // *
    // * *
    // * *
    // * *
    // * *
    // * *
    // * *
    // * *
    // *
    static void pattern15(int n) {
        System.out.println("15th Pattern: ");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 2 * i - 1; j >= 1; j--) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // 1
    // 1 1
    // 1 2 1
    // 1 3 3 1
    // 1 4 6 4 1
    static void pattern16(int n) {
        System.out.println("16th Pattern: ");
        for (int i = 0; i < n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(" " + num);
                num = num * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }

    // 1
    // 212
    // 32123
    // 4321234
    // 32123
    // 212
    // 1
    static void pattern17(int n) {
        System.out.println("17th Pattern: ");
        // Print upper half of the pyramid
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // Print increasing numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        // Print lower half of the pyramid
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // Print increasing numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // **********
    // **** ****
    // *** ***
    // ** **
    // * *
    // * *
    // ** **
    // *** ***
    // **** ****
    // **********

}
