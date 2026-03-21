public class trappingwater {
    public static int trapped_water(int height[]){
        
        int n = height.length;

        //calculate leftmax array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i=1; i<n ; i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }

        // calculate Right Array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for (int i=n-2; i>=0 ; i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }

        // trapped water 
        int trapped_water = 0;
        for(int i = 0; i<n; i++){
            int waterlevel = Math.min(leftMax[i],rightMax[i] );

            trapped_water += waterlevel - height[i];
        }

        return trapped_water ;
    }


    
    public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trapped_water(height)); 
    }
}
