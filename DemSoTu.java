public class DemSoTu {
    public static int demSoTu(String chuoi) {
        String[] tu = chuoi.trim().split("\\s+");
        return tu.length;
    }

    public static void main(String[] args) {
        String chuoi = "Java is fun";
        int soTu = demSoTu(chuoi);
        
        System.out.println("Số từ trong chuỗi: " + soTu);
    }
}
