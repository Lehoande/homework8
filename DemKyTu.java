public class DemKyTu {
    public static int countOccurrences(String chuoi, char kyTu) {
        int dem = 0;       
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kyTu) {
                dem++;
            }
        }       
        return dem;
    }
    public static void main(String[] args) {
        String chuoi = "hello world";
        char kyTu = 'o';     
        int soLanXuatHien = countOccurrences(chuoi, kyTu);
        System.out.println("Ky tu '" + kyTu + "' xuat hien " + soLanXuatHien + " lan trong chuoi.");
    }
}
