class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> l = new ArrayList<>();

        int i = 0;
        int j = 0;

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            i = top;
            for (j = left; j <= right; j++) {
                l.add(matrix[i][j]);
            }
            top++;
            j = right;
            for (int k = top; k <= bottom; k++) {
                l.add(matrix[k][j]);
            }
            right--;
            if (top <= bottom) {
                i = bottom;
                for (j = right; j >= left; j--) {
                    l.add(matrix[i][j]);
                }
                bottom--;
            }
            if (left <= right) {
                j = left;
                for (int k = bottom; k >= top; k--) {
                    l.add(matrix[k][j]);
                }
                left++;
            }
        }

        return l;
    }
}
