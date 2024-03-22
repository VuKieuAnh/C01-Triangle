import java.util.Scanner;

public class User {
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        User user[] = new User[3];


        try {
//            de khoi lenh co kha nang bi loi trong try
//            khong giup chung ta sua loi
//            Gap loi -> van thuc thi dc cac lenh phia sau
//            System.out.println(user[9]);
            System.out.println(user[9].getName());

        }
//        dat ten class bat loi doi vao trong catch
        catch (ArrayIndexOutOfBoundsException x){
            System.out.println(x);
            System.out.println("qua phan tu cua mang r");
        }
        catch (NullPointerException n){
            System.out.println(n);
        }
        catch (RuntimeException e){

        }
        finally {
            System.out.println("I love y");
        }
        System.out.println("Xin chao ");
    }
}
