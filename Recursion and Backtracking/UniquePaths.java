public class UniquePaths {
    static int countPaths(int m, int n) {
        if (m == 1 || n == 1) return 1;
        return countPaths(m - 1, n) + countPaths(m, n - 1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        System.out.println(countPaths(m, n));
    }
}
