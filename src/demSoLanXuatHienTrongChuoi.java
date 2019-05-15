public class demSoLanXuatHienTrongChuoi {
    public static void main(String[] args) {
        String inputString = " to day I am happy";
        char  checkCharacter = 'p';
        System.out.println("So lan xuat hien "+checkCharacter+" la: "+countChar(inputString,checkCharacter));
    }

    public static int countChar(String inputString, char checkCharacter) {
        int count = 0;
        int stringLength = inputString.length();
        for (int i = 0; i < stringLength; i++) {
            char check = inputString.charAt(i);
            boolean isChar = check==checkCharacter;
            if (isChar) {
                count++;
            }
        }
        return count;
    }
}
