class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color)
        return image;
        fill(image,sr,sc,color,image[sr][sc]);
        return image;
    }
    public void fill(int[][] image,int sr,int sc,int color,int cur)
    {
        if(sr < 0|| sr >= image.length || sc<0|| sc >= image[0].length)
        return;
            // if image[sr][sc] is not equal to previous color
        if(cur != image[sr][sc])
        return;

        //update the image[sr][sc] as a color
        image[sr][sc] = color;
        fill(image,sr-1,sc,color,cur);
        fill(image,sr+1,sc,color,cur);
        fill(image,sr,sc-1,color,cur);
        fill(image,sr,sc+1,color,cur);
    }
}