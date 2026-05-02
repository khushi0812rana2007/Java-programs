class Palindrome {
    public static void main(String[] args) {
        int num = 121, temp = num, rev = 0;
        while(temp != 0){
            rev = rev*10 + temp%10;
            temp /= 10;
        }
        System.out.println(num + " is palindrome? " + (num==rev));
    }
}
