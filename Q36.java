class Q36 {
    public static void main(String[] args) {
int n = 3;
int sum = 0;
int digit = 0;
for(int i = 1; i <= n; i++) {
    digit = digit * 10 + 1;
    sum = sum + digit;
}
System.out.println(sum);
    }
}
