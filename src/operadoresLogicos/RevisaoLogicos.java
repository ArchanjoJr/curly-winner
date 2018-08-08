package operadoresLogicos;

public class RevisaoLogicos {
    public void and(boolean[] col1, boolean[] col2, boolean[] res) {
        for (int i = 0; i < 4; i++) {
            res[i] = col1[i] && col2[i];
            System.out.printf("%s and %s = %s \n", col1[i], col2[i], res[i]);
        }
    }
    public void or(boolean[] col1, boolean[] col2, boolean[] res) {
        for (int i = 0; i < 4; i++) {
            res[i] = col1[i] || col2[i];
            System.out.printf("%s or %s = %s \n", col1[i], col2[i], res[i]);
        }
    }
    public void not(boolean[] col1, boolean[] col2, boolean[] res) {
        for (int i = 0; i < 4; i++) {
            res[i] = (col1[i] && col2[i]);
            System.out.printf("%s not %s = %s \n", col1[i], col2[i], res[i]);
        }
    }
    public static void main(string[] args) {
        boolean[] coluna1 = { true, true, false, false };
        boolean[] coluna2 = { true, false, true, false };
        boolean[] resultado =  new boolean[4];
        RevisaoLogicos rl = new RevisaoLogicos();
        rl.and(coluna1, coluna2, resultado);
        rl.or(coluna1, coluna2, resultado);
        rl.not(coluna1, coluna2, resultado);
    }

}
