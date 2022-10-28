package exception;

public class ExceptionOne {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5};
        int x = 5;
        int y = 1;

        try {
            int result = x/y + list[10];
            System.out.println("Kết quả: " + result);
        } catch (ArithmeticException e){
            System.out.print("Lỗi toán học: ");
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.print("Gặp phải lỗi ko mong muốn: ");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Cảm ơn bạn đã sử dụng chương trình");
        }

    }
}
