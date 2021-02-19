package _02_type;

public class Hello {
    public static void main(String[] args) {
//        byte	1 byte	từ -128 đến 127
        byte myNum = 127;
        System.out.println(myNum);
//        short	2 bytes	từ -32.768 đến 32.676
        short myNum1 = 5000;
//        int	4 bytes	từ -2.147.483.648 đến 2.147.483.647
        int myNum2 = 1000;
//        long	8 bytes	từ -9.223.372.036.854.775.808 to 9.223.372.036.854.775.807
        long myNum3 = 100000;
//        float	4 bytes	6 đến 7 thập phân 1.000,1232321
        float myNum4 = 9.9f;
//        double	8 bytes	15 dấu thập phân
        double myNum5 = 9.9;
//        boolean	1 bit	chứa giá trị true hoặc false
        boolean isExist = true;
//        char	2 bytes	chứa các ký tự đơn
        char myGrade = 'B';
        char x = 65, y = 66, z = 67;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

//        kiểu đối tượng: String, Object
        String myString = "Hello world";
        System.out.println(myString);

        Object o = new Object();
    }
}
