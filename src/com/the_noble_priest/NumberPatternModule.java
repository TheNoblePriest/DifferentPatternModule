package com.the_noble_priest;

public class NumberPatternModule {
    /**
     * 1: OddNumberStepPrinting
     * Output
     * 1
     * 2  3  4
     * 5  6  7  8  9
     *
     * @param num
     */
    void OddNumberStepPrinting(int num) {
        int n = 0;
        for (int i = 0; i <= num; i += 2) {
            for (int j = 0; j <= i; j++) {
                n += 1;
                System.out.print(" " + n + " ");
            }
            System.out.println(" ");
        }
    }

    /**
     * 2: topToBottomTriangle
     * Output
     * 1
     * 1  2
     * 1  2  3
     * 1  2  3  4
     * 1  2  3  4  5
     *
     * @param n
     */
    void topToBottomTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j + " ");
            }
            System.out.println("");
        }
    }

    /**
     * 3:  bottomToTopTriangle
     * Output
     * 1  2  3  4  5
     * 1  2  3  4
     * 1  2  3
     * 1  2
     * 1
     *
     * @param n
     */

    void bottomToTopTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j + " ");
            }
            System.out.println("");
        }
    }


//    .............../\.............

    /**
     * 4: numberTriangleTop
     * Output
     * 1
     * 2   2
     * 3   3   3
     * 4   4   4   4
     * 5   5   5   5   5
     * 6   6   6   6   6   6
     *
     * @param n
     */

    void numberTriangleTop(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("  ");
            }
            for (int z = 1; z <= i; z++) {
                System.out.print("  " + i + " ");
            }
            System.out.println("");
        }
    }


//    ................/\...............

    /**
     * 5: numberTriangleBottom
     * Output
     * 7   7   7   7   7   7   7
     * 6   6   6   6   6   6
     * 5   5   5   5   5
     * 4   4   4   4
     * 3   3   3
     * 2   2
     * 1
     *
     * @param n
     */

    void numberTriangleBottom(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int z = 0; z < i; z++) {
                System.out.print("  " + i + " ");
            }
            System.out.println("");
        }
    }


//    ................/Pattern\...............

    /**
     * 6: numBottomTopSerial
     * 1     2     3     4     5
     * 6     7     8     9
     * 10     11     12
     * 13     14
     * 15
     */


    void numBottomTopSerial(int n) {
        int k = 0;
        for (int i = n; i >= 1; i--) {
            for (int j = i; j <= n; j++) {
                System.out.print("   ");
            }
            for (int z = 0; z < i; z++) {
                k++;
                System.out.print("   " + k + "  ");
            }
            System.out.println("");
        }
    }

//    ............../\.............

    /**
     * 7: numberTriangleTopSerial
     * Output
     * 1
     * 2   3
     * 4   5   6
     * 7   8   9   10
     * 11   12   13   14   15
     * 16   17   18   19   20   21
     *
     * @param n
     */

    void numberTriangleTopSerial(int n) {
        int k = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("  ");
            }
            for (int z = 1; z <= i; z++) {
                k++;
                System.out.print("  " + k + " ");
            }
            System.out.println("");
        }
    }

    /**
     * 8: rectangleNumberPattern
     * output->
     * 1  1  1  1  1  1
     * 2  2  2  2  2  2
     * 3  3  3  3  3  3
     * 4  4  4  4  4  4
     * 5  5  5  5  5  5
     * 6  6  6  6  6  6
     *
     * @param num
     */

    void rectangleNumberPattern(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(" " + i + " ");
            }
            System.out.println("");
        }
    }


    /**
     * 9: rectangleNumberPatternSerial
     * Output->
     * 1  2  3  4  5
     * 1  2  3  4  5
     * 1  2  3  4  5
     * 1  2  3  4  5
     * 1  2  3  4  5
     *
     * @param num
     */

    void rectangleNumberPatternSerial(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(" " + j + " ");
            }
            System.out.println("");
        }
    }

    /**
     * 10: hollowRectanglePattern
     * Output->
     * 0  0  0  0  0  0
     * 1              1
     * 2              2
     * 3              3
     * 4              4
     * 5  5  5  5  5  5
     *
     * @param n
     */

    void hollowRectanglePattern(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j == n || i == n || j == 0 || i == 0) {
                    System.out.print(" " + i + " ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("");

        }
    }

    /**
     * 11: hollowRectangleSerialNumber
     * Output->
     * 1  2   3   4   5   6   7
     * 8                     14
     * 15                    21
     * 22                    28
     * 29                    35
     * 36                    42
     * 43  44  45  46  47  48  49
     *
     * @param n
     */

    void hollowRectangleSerialNumber(int n) {
        int k = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                k++;
                if (j == n || i == n || j == 0 || i == 0) {

                    System.out.print(" " + k + " ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("");

        }
    }


    /**
     * 12: diagonalLeftNumberPattern
     * Output->
     * 1  1  1  1  1  1  1  1
     * 2  2              2  2
     * 3     3        3     3
     * 4        4  4        4
     * 5        5  5        5
     * 6     6        6     6
     * 7  7              7  7
     * 8  8  8  8  8  8  8  8
     *
     * @param num
     */

    void diagonalNumberPattern(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (j == num || i == num || j == 1 || i == 1 || i == j || j + i == num + 1) {
                    System.out.print(" " + i + " ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }

    /**
     * 13: BACK DOWN STAR PATTERN
     * // 6  5  4  3  2  1
     * //    5  4  3  2  1
     * //       4  3  2  1
     * //          3  2  1
     * //             2  1
     * //                1
     *
     * @param n
     */

    void backDownStarPattern(int n) {
        int k = n;
        int i, j, z;
        for (i = 0; i <= n; i++) {
            for (j = 0; j < i; j++) {
                if (j >= 0) {
                    System.out.print("   ");
                }
            }

            for (z = k; z >= 1; z--) {
                System.out.print(" " + z + " ");
            }
            k--;

            System.out.println(" ");
        }
    }

    /**
     * 14: ODD NUMBER PYRAMID Star Pattern
     * //Output->
     * // _  _  _  _  _  1
     * //
     * // _  _  _  _  1  3  1
     * //
     * // _  _  _  1  3  5  7  1
     * //
     * // _  _  1  3  5  7  9  11  1
     * //
     * // _  1  3  5  7  9  11  13  15  1
     *
     * @param n
     */
    void oddNumberPyramidStarPattern(int n) {
        int k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" _ ");
            }
            for (int z = 1; z <= k; z += 2) {
                if (z == 1 || z == k) {
                    System.out.print(" " + "1" + " ");
                } else {
                    System.out.print(" " + z + " ");
                }
            }
            k += 4;
            System.out.println("\n");
        }
    }


    /**
     * 15: Forward Down Star Pattern
     * //To Print No. Of Stars
     * //         6  5  4  3  2  1
     * //         6  5  4  3  2
     * //         6  5  4  3
     * //         6  5  4
     * //         6  5
     * //         6
     *
     * @param n
     */
    void forwardToDownStarPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" " + j + " ");
            }
            System.out.println("");
        }
    }


    /**
     * 16: Normal Serial number Star Pattern top to down
     * OUTPUT->
     * 1
     * 2  3
     * 4  5  6
     * 7  8  9  10
     * 11  12  13  14  15
     * 16  17  18  19  20  21
     *
     * @param n
     */

    void serialNumberStarPattern(int n) {
        int i, j, z = 1;
        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print(" " + z + " ");
                z += 1;
            }
            System.out.println(" ");
        }
    }

}









