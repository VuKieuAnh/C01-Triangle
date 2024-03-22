package triangle;
//tao ra nhung ngoai le phu hop voi nghiep vu rieng
public class IllegalTriangleException extends Exception {
    private String mess;
    public IllegalTriangleException(String message) {
        super(message);
        this.mess = message;
    }

    @Override
    public String toString() {
        return "IllegalTriangleException{" +
                "mess='" + mess + '\'' +
                "} " + super.toString();
    }
}
