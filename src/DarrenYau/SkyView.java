package DarrenYau;

public class SkyView {
    public SkyView(int numRows, int numCols, double[] scanned) {
        double view[][] = new double[numRows][numCols];
        int i = 0;
        for (int j = 0; i < numRows; i++) {
            if (j % 2 == 0) {
                for (int k = 0; k < numCols; k++) {
                    view[j][k] = scanned[i];
                    i++;
                }
            }
            else {
                for (int k = numCols - 1; k >= 0; k--) {
                    view[j][k] = scanned[i];
                    i++
                }
            }
        }
    }
    public double getAverage(int startRow, int endRow, int startCol, int endCol) {
        double sum = 0.0;
        int count = 0;
        for (int row = startRow; row <= endRow; row++) {
            for (int col = startCol; col <= endCol; col++) {
                sum += view[row][col];
                count++;
            }
        }
        return sum/count;
    }
}