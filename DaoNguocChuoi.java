public class DaoNguocChuoi {
    public static String daoNguoc(String chuoi) {
        StringBuilder daoNguoc = new StringBuilder(chuoi);
        return daoNguoc.reverse().toString();
    }

    public static void main(String[] args) {
        String chuoi = "hello";
        String ketQua = daoNguoc(chuoi);
        System.out.println("Chuỗi đảo ngược: " + ketQua);
    }
}
