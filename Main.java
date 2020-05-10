public class Main {

    static class tuple {
         int x;
         int y;

        public tuple(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            if (x > -1) return "(" + x + "," + y + ")";
            else return "";
        }
    }

    public static void main(String[] args) {
        tuple[][] solution = new tuple[4][4];
        for (int i = 0; i < solution.length; i++) {
            for (int j = 0; j < (i + 1); j++) {
                if ((j + 1) == (i + 1))
                    solution[i][j] = new tuple(j, 0);
                else if (j == 0)
                    solution[i][j] = new tuple(0, i);
                else
                    solution[i][j] = new tuple(j, solution[i - 1][j].y + 1);
            }
        }
        for(int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                if(solution[i][j] != null)System.out.print(solution[i][j].toString() + " ");
            }
            System.out.println();
        }
    }
}
