class Solution {
    public int compareVersion(String version1, String version2) {
        String[] parts1 = version1.split("\\.");
        String[] parts2 = version2.split("\\.");
        int maxLength = Math.max(parts1.length,parts2.length);
        for(int i = 0;i < maxLength;i++){
            int num1 = i < parts1.length ? Integer.parseInt(parts1[i]) : 0;
            int num2 = i < parts2.length ? Integer.parseInt(parts2[i]) : 0;

            if(num1 > num2){
                return 1;
            }else if(num1 < num2){
                return -1;
            }
        }
        return 0;
    }
}