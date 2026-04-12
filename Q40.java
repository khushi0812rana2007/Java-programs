class Q40 {
public static void main(String[] args) {
int n = 112311;
int count = 0;
while(n > 0) {
int digit = n % 10;
if(digit == 1)
count++;
n = n / 10;
}
System.out.println(count);
    }
}
