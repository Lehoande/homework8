public class ChuyenDoiChu {
    public static String chuyenDoiChu(String chuoi) {
        StringBuilder ketQua = new StringBuilder();
        
        for (char kyTu : chuoi.toCharArray()) {
            if (Character.isUpperCase(kyTu)) {
                ketQua.append(Character.toLowerCase(kyTu));
            } else if (Character.isLowerCase(kyTu)) {
                ketQua.append(Character.toUpperCase(kyTu));
            } else {
                ketQua.append(kyTu);
            }
        }
        
        return ketQua.toString();
    }

    public static void main(String[] args) {
        String chuoi = "Hello World";
        String ketQua = chuyenDoiChu(chuoi);
        System.out.println("Chuỗi sau khi chuyển đổi: " + ketQua);
    }
}
