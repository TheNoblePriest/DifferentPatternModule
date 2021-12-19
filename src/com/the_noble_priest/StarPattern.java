package com.the_noble_priest;

public class StarPattern {

    /**
     * 1: RECTANGLE STAR Pattern
     * these are the value to pass
     *
     * @param col
     * @param row //OUTPUT col = 4 , row = 5
     *            // *  *  *  *  *
     *            // *  *  *  *  *
     *            // *  *  *  *  *
     *            // *  *  *  *  *
     */
    public void starRectangle(int col, int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }


    /**
     * 2:  SQUARE STAR Pattern
     * row = n
     * col = n
     *
     * @param n OUTPUT->
     *          // *  *  *  *  *
     *          // *  *  *  *  *
     *          // *  *  *  *  *
     *          // *  *  *  *  *
     *          // *  *  *  *  *
     *          sample examples
     */
    public void starSquare(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }


    }


    /**
     * 3:  HollowRectangleStarPattern
     *
     * @param row
     * @param col OUTPUT
     *            row 5 ,col 6
     *            // *  *  *  *  *  *
     *            // *              *
     *            // *              *
     *            // *              *
     *            // *  *  *  *  *  *
     *            sample Example
     */
    public void HollowRectangleStarPattern(int row, int col) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row) {
                    System.out.print(" * ");
                } else if (j == 1 || j == col) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }

            }
            System.out.println("");
        }

    }


    /**
     * 4: HollowSquareStarPattern
     *
     * @param n OUTPUT
     *          // *  *  *  *  *
     *          // *           *
     *          // *           *
     *          // *           *
     *          // *  *  *  *  *
     *          sample Example
     */
    public void HollowSquareStarPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n) {
                    System.out.print(" * ");
                } else if (j == 1 || j == n) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }

            }
            System.out.println("");
        }

    }


    /**
     * 5: LeftDecrementStarPattern
     * this will print one star less then previous iteration
     *
     * @param maxStar //OUTPUT -> maxStar -> 5
     *                //    *  *  *  *  *
     *                //    *  *  *  *
     *                //    *  *  *
     *                //    *  *
     *                //    *
     *                sample example
     */
    public void LeftDecrementStarPattern(int maxStar) {
        for (int i = 1; i <= maxStar; i++) {
            for (int j = maxStar; j >= i; j--) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }


    }


    /**
     * 6: RightIncrementStarPattern
     * In this we are incrementing each row by one star
     *
     * @param maxStar // output -> maxStar = 5
     *                // *
     *                // *  *
     *                // *  *  *
     *                // *  *  *  *
     *                // *  *  *  *  *
     *                sample Example
     */

    public void RightIncrementStarPattern(int maxStar) {
        for (int i = 0; i < maxStar; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }


    }


    /**
     * 7: SpaceRightIncrementStarPattern
     *
     * @param numMax OUTPUT
     *               //             *
     *               //          *  *
     *               //       *  *  *
     *               //    *  *  *  *
     *               // *  *  *  *  *
     *               sample example
     */
    public void SpaceRightIncrementStarPattern(int numMax) {
        for (int i = 0; i < numMax; i++) {
            for (int j = numMax - 1; j > i; j--) {
                System.out.print("   ");
            }
            for (int z = 0; z < i + 1; z++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }

    }


    /**
     * 8: SpaceLeftIncrementStarPattern
     *
     * @param num OUTPUT->
     *            // *  *  *  *  *  *
     *            //    *  *  *  *  *
     *            //       *  *  *  *
     *            //          *  *  *
     *            //             *  *
     *            //                *
     *            sample example
     */

    public void SpaceLeftIncrementStarPattern(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print(" * ");
            }
            System.out.println(" ");
            for (int z = 0; z <= i; z++) {
                System.out.print("   ");
            }
        }

    }


    /**
     * 9: LeftToRightDiagonalStarPattern
     * OUTPUT-> 6
     * // *  *  *  *  *  *
     * // *  *           *
     * // *     *        *
     * // *        *     *
     * // *           *  *
     * // *  *  *  *  *  *
     *
     * @param n sample example
     */
    public void LeftToRightDiagonalStarPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n) {
                    System.out.print(" * ");
                } else if (j == 1 || j == n) {
                    System.out.print(" * ");
                } else if (j == i) {
                    System.out.print(" * ");

                } else {
                    System.out.print("   ");
                }

            }
            System.out.println(" ");
        }

    }

    /**
     * 10: RightToLeftDiagonalStarPattern
     *
     * @param n OUTPUT->
     *          // *  *  *  *  *  *  *  *
     *          // *                 *  *
     *          // *              *     *
     *          // *           *        *
     *          // *        *           *
     *          // *     *              *
     *          // *  *                 *
     *          // *  *  *  *  *  *  *  *
     *          sample example
     */

    public void RightToLeftDiagonalStarPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n) {
                    System.out.print(" * ");
                } else if (j == 1 || j == n) {
                    System.out.print(" * ");
                } else if (i + j == n + 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println(" ");

        }
    }

    /**
     * 11: BothDiagonalStarPatternRectangle
     * This is the diagonal of rectangle Star pattern
     *
     * @param n OUTPUT->
     *          <p>
     *          // *  *  *  *  *  *  *  *  *  *
     *          // *  *                    *  *
     *          // *     *              *     *
     *          // *        *        *        *
     *          // *           *  *           *
     *          // *           *  *           *
     *          // *        *        *        *
     *          // *     *              *     *
     *          // *  *                    *  *
     *          // *  *  *  *  *  *  *  *  *  *
     *          sample Example
     */

    public void BothDiagonalStarPatternRectangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n) {
                    System.out.print(" * ");
                } else if (j == 1 || j == n) {
                    System.out.print(" * ");
                } else if (i + j == n + 1) {
                    System.out.print(" * ");
                } else if (j == i) {
                    System.out.print(" * ");

                } else {
                    System.out.print("   ");
                }
            }
            System.out.println(" ");
        }

    }

    /**
     * 12: Pyramid Star Pattern
     * Top to Down
     * //    OutPut ->
     * //                *
     * //             *  *  *
     * //          *  *  *  *  *
     * //       *  *  *  *  *  *  *
     * //    *  *  *  *  *  *  *  *  *
     * // *  *  *  *  *  *  *  *  *  *  *
     *
     * @param n
     */

    public void PyramidStarPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("   ");
            }
            for (int z = 1; z < 2 * i; z++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }

    /**
     * 13: Reverse Pyramid Star Pattern
     * Top to Down
     * //    Output
     * //     *  *  *  *  *  *  *  *  *  *  *  *  *
     * //       *  *  *  *  *  *  *  *  *  *  *
     * //          *  *  *  *  *  *  *  *  *
     * //             *  *  *  *  *  *  *
     * //                *  *  *  *  *
     * //                   *  *  *
     * //                      *
     *
     * @param n
     */

    public void ReversePyramidStarPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("   ");
            }
            for (int z = n; z >= i; z--) {
                System.out.print(" * ");
            }
            for (int k = n - 1; k >= i; k--) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }


    /**
     * 14: DIAMOND STAR PATTERN
     * //    OUTPUT->
     * //                      *
     * //                   *  *  *
     * //                *  *  *  *  *
     * //             *  *  *  *  *  *  *
     * //          *  *  *  *  *  *  *  *  *
     * //       *  *  *  *  *  *  *  *  *  *  *
     * //    *  *  *  *  *  *  *  *  *  *  *  *  *
     * //       *  *  *  *  *  *  *  *  *  *  *
     * //          *  *  *  *  *  *  *  *  *
     * //             *  *  *  *  *  *  *
     * //                *  *  *  *  *
     * //                   *  *  *
     * //                      *
     *
     * @param n
     */

    void diamondShapeStarPattern(int n) {
//        top to bottom first
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("   ");
            }
            for (int z = 1; z < 2 * i; z++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
//        bottom to top second
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print("   ");
            }
            for (int z = n - 2; z >= i; z--) {
                System.out.print(" * ");
            }
            for (int k = n - 1; k >= i; k--) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }

    /**
     * 15: KITE STAR PATTERN
     * OUTPUT->
     * *
     * *  *  *
     * *  *  *  *  *
     * *  *  *  *  *  *  *
     * *  *  *  *  *  *  *  *  *
     * *  *  *  *  *  *  *  *  *  *  *
     * *  *  *  *  *  *  *  *  *  *  *  *  *
     * *  *  *  *  *  *  *  *  *  *  *
     * *  *  *  *  *  *  *  *  *
     * *  *  *  *  *  *  *
     * *  *  *  *  *
     * *  *  *
     * *  *  *  *  *
     *
     * @param n
     */
    void kiteStarPattern(int n) {
//        top to bottom first
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("   ");
            }
            for (int z = 1; z < 2 * i; z++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
//        bottom to top second
        for (int i = 1; i <= n - 2; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print("   ");
            }
            for (int z = n - 2; z >= i; z--) {
                System.out.print(" * ");
            }
            for (int k = n - 1; k >= i; k--) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
        for (int i = 1; i < n; i++) {
            for (int j = n; j > i + 1; j--) {
                System.out.print("   ");
            }
            if (i == 1) {
                for (int z = 1; z <= 5; z++) {
                    System.out.print(" * ");
                }
            }

            System.out.println("");
        }
    }

    /**
     * 16: Butterfly Star Pattern
     * Output->
     * // *                    *
     * // *  *              *  *
     * // *  *  *        *  *  *
     * // *  *  *  *  *  *  *  *
     * // *  *  *  *  *  *  *  *
     * // *  *  *        *  *  *
     * // *  *              *  *
     * // *                    *
     *
     * @param n
     */

    void butterflyStarPattern(int n) {
        int i, j, z;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            int space = 2 * n - 2 * i;
            for (j = 1; j <= space; j++) {
                System.out.print("   ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        for (i = n; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            int space = 2 * n - 2 * i;
            for (j = 1; j <= space; j++) {
                System.out.print("   ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}


