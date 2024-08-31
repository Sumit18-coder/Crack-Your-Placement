class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        int m=image.length,n=image[0].length;
        int oldColor=image[sr][sc];

        changeColor(image,sr,sc,oldColor,newColor,m,n);
        return image;
        
    }

    void changeColor(int[][] image,int r,int c,int oldColor,int newColor,int m,int n){
        image[r][c]=newColor;
        int arr1[]={-1,0,1,0};
        int arr2[]={0,-1,0,1};

        for(int i=0;i<4;i++){
            int nr=arr1[i]+r;
            int nc=arr2[i]+c;
            if(nr>=0 && nr<m && nc>=0 && nc<n && image[nr][nc]==oldColor && image[nr][nc]!=newColor)
                changeColor(image,nr,nc,oldColor,newColor,m,n);
        }
    }
}