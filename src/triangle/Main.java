package triangle;

public class Main {
    public static void main(String[] args) {
        try {
//            khi su dung phuong thuc khoi tao => bat ngoai le
            Triangle t = new Triangle(2, 3, 1);
        } catch (IllegalTriangleException e) {
            System.out.println(e);
        }
        System.out.println("Xin chao C01");
    }
}
