public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i)
                    row.add(1);
                else {
                    int left = res.get(i - 1).get(j - 1);
                    int right = res.get(i - 1).get(j);
                    row.add(right + left);
                }
            }
            res.add(row);

        }
        return res;
    }

}
