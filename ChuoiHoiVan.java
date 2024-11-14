public class ChuoiHoiVan {
    public static boolean laChuoiHoiVan(String chuoi) {
        chuoi = chuoi.replaceAll("\\s+", "").toLowerCase();
        
        int left = 0;
        int right = chuoi.length() - 1;

        while (left < right) {
            if (chuoi.charAt(left) != chuoi.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String chuoi1 = "madam";
        String chuoi2 = "hello";
        
        System.out.println(chuoi1 + " có phải là chuỗi hồi văn? " + laChuoiHoiVan(chuoi1));
        System.out.println(chuoi2 + " có phải là chuỗi hồi văn? " + laChuoiHoiVan(chuoi2));
    }
}
