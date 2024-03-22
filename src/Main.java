public class Main {
    public static void main(String[] args) {

    }
//    throws: thong bao rang phuong thuc nay co kha nang xay ra loi thoi
    public static void m1() throws Exception{
//        viet phuong co khoa nang xay ra loi
//        khong try catch: thong bao cho cac phuong thuc khac su dung phuong thuc nay biet la co the xay ra loi
    }

    public static void m2 (){
//        khi su dung phuong thuc m1
//        thong bao la m1 ban ra loi day, m xu ly di
        try {
            m1();
        } catch (Exception e) {
//            tao instance moi ban ra loi
            throw new RuntimeException(e);
        }
    }
//    kgong lam gi -> thong bao voi pht khac la t kha nang xay ra loi
    public static void m3() throws Exception{
//   su dung phuong thuc m1 co kha nang xay ra loi
        m1();
    }
}
