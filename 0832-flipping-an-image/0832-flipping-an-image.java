class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0;i < image.length;i++){
                int p1 = 0,p2 = image[i].length - 1;
                while(p1 < p2){
                    int temp = image[i][p1];
                    image[i][p1] = image[i][p2];
                    image[i][p2] = temp;

                    p1++;
                    p2--;
                }

                for(int j = 0;j < image[i].length;j++){
                    image[i][j] ^= 1;
                }
        }
        return image;
    }
}