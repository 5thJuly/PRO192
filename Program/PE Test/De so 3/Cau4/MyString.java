public class MyString /* implements IString */ {

    // @Override
    // Đếm và trả về số chữ số nguyên tố trong chuỗi
    private boolean isPrime(int currentNumber) {
        if (currentNumber == 1) {
            return false;
        }
        if (currentNumber == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(currentNumber); i++) {
            if (currentNumber % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int f1(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (Character.isDigit(currentChar)) {
                int currentNumber = Integer.parseInt("" + currentChar);
                if (isPrime(currentNumber)) {
                    count++;
                }
            }
        }
        return count;
        // Enter TC (1 or 2) :1
        // Enter a string : a32b 95cd b67 // dq349 2jc fd2429
        // OUTPUT : 4 (2 3 5 7) // OUTPUT : 3 (3 2 2)
    }

    // @Override
    // Đảo ngược thứ tự của tất cả các từ trong str
    // (word = một chuỗi không có khoảng trắng)

    public String f2(String str) {
        String[] words = str.split("\\s");
        String result = "";
        for (int i = words.length - 1; i >= 0; i--) { // Có 6 phần tử nên words.length - 1
            result += " " + words[i];
        }
        return result.trim(); // không được có khoảng trắng -- Nếu có khoảng trắng = mất điểm
    }
    // Enter TC (1 or 2) :1
    // Enter a string : a9 b1 a8 a7 a6 a5
    // OUTPUT : a5 a6 a7 a8 b1 a9 (không có khoảng trắng)

}