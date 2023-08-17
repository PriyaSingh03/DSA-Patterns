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
        pattern18(5);
        pattern19(5);
        pattern20(5);
        pattern21(5);
        pattern22(5);
        pattern23(5);
        pattern24(5);
    }

    // Question 1
    static void pattern1(int n) {
        System.out.println("First Pattern: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Question 2
    static void pattern2(int n) {
        System.out.println("Second Pattern: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Question 3
    static void pattern3(int n) {
        System.out.println("Third Pattern: ");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Question 4
    static void pattern4(int n) {
        System.out.println("Fourth Pattern: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Question 5
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

    // Question 6
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

    // Question 7
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

    // Question 8
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

    // Question 9
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

    // Question 10
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

    // Question 11
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

    // Question 12
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

    // Question 13
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

    // Question 14
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

    // Question 15
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

    // Question 16
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

    // Question 17
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

    // Question 18
    static void pattern18(int n) {
        System.out.println("18th pattern: ");
        // Upper half of the pattern
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {

                System.out.print("*");
            }
            for (int k = 1; k <= 2 * i - 2; k++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
        // Lower half of the pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 2 * i - 2; j < 2 * n - 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Question 19
    static void pattern19(int n) {
        System.out.println("19th Pattern: ");
        // Upper half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 2 * i - 2; k <= 2 * n - 2; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {

                System.out.print("*");
            }
            for (int k = 1; k <= 2 * i - 2; k++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Question 20
    static void pattern20(int n) {
        System.out.println("20th pattern: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - 1; j++) {
                if (i == 1 || j == n - 1 || i == n || j == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Question 21
    static void pattern21(int n) {
        System.out.println("21st pattern: ");
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    // Question 22
    static void pattern22(int n) {
        System.out.println("22nd pattern: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print("1");
                else
                    System.out.print("0");
            }
            System.out.println();
        }
    }

    // Question 23
    static void pattern23(int n) {
        System.out.println("23rd Pattern: ");
        // Upper half of the pattern
        for (int i = 0; i < n; i++) {
            // Print left asterisk
            System.out.print("*");

            // Print left spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print middle asterisk
            System.out.print("*");

            // Print middle spaces
            for (int j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print(" ");
            }

            // Print right asterisk
            System.out.print("*");

            // Print right spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print right asterisk
            System.out.print("*");

            System.out.println();
        }

        // Lower half of the pattern
        for (int i = n - 1; i >= 0; i--) {
            // Print left asterisk
            System.out.print("*");

            // Print left spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print middle asterisk
            System.out.print("*");

            // Print middle spaces
            for (int j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print(" ");
            }

            // Print right asterisk
            System.out.print("*");

            // Print right spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print right asterisk
            System.out.print("*");

            System.out.println();
        }
    }

    // Question 24
    static void pattern24(int n) {
        System.out.println("24th Pattern: ");
        for (int i = 1; i <= n; i++) {
            /* Print trailing spaces */
            for (int j = 1; j <= n - i; j++) {
                System.out.println(" ");
            }
            /* Print stars and center spaces */
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n)
                    System.out.print("*");
                else
                    System.out.println(" ");
            }
            System.out.println();
        }
    }
}
