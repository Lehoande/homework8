public class XoaKhoangTrang {
    public static String xoaKhoangTrangThuad(String chuoi) {
        // Loại bỏ khoảng trắng thừa ở đầu, cuối và giữa các từ
        return chuoi.trim().replaceAll("\\s+", " ");
    }

    public static void main(String[] args) {
        String chuoi = "   Hello    World   ";
        String ketQua = xoaKhoangTrangThuad(chuoi);
        
        System.out.println("Chuỗi sau khi xóa khoảng trắng thừa: \"" + ketQua + "\"");
    }
}
