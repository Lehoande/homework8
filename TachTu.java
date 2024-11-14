public class TachTu {
    public static String[] tachTu(String chuoi) {
        return chuoi.split("\\s+");
    }

    public static void main(String[] args) {
        String chuoi = "Java is fun";
        String[] tu = tachTu(chuoi);
        
        System.out.println("Các từ trong chuỗi:");
        for (String motTu : tu) {
            System.out.println(motTu);
        }
    }
}
