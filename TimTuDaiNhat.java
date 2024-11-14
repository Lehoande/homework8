public class TimTuDaiNhat {
    public static String timTuDaiNhat(String chuoi) {
        String[] tu = chuoi.split("\\s+");
        String tuDaiNhat = "";
        
        for (String motTu : tu) {
            if (motTu.length() > tuDaiNhat.length()) {
                tuDaiNhat = motTu;
            }
        }
        
        return tuDaiNhat;
    }

    public static void main(String[] args) {
        String chuoi = "I love programming";
        String tuDaiNhat = timTuDaiNhat(chuoi);
        
        System.out.println("Từ dài nhất trong chuỗi: " + tuDaiNhat);
    }
}
