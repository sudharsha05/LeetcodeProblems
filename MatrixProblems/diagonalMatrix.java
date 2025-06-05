class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) {
            return new int[0];
        }

        int rows = mat.length;
        int cols = mat[0].length;
        int[] result = new int[rows * cols];

        int r = 0, c = 0;
        int dir = 1;
        int index = 0;

        while (index < rows * cols) {
            result[index++] = mat[r][c];

            if (dir == 1) {
                if (c == cols - 1) {
                    r++;
                    dir = -1;
                } else if (r == 0) {
                    c++;
                    dir = -1;
                } else {
                    r--;
                    c++;
                }

            } else {
                if (r == rows - 1) {
                    c++;
                    dir = 1;
                } else if (c == 0) {
                    r++;
                    dir = 1;
                } else {
                    r++;
                    c--;
                }
            }
        }
        return result;
    }
}
