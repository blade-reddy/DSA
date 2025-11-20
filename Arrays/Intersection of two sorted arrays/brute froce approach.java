class Solution {
    public int[] intersectionArray(int[] nums1, int[] nums2) {
        List<Integer> arr=new ArrayList<>();
        int[]vis=new int[nums2.length];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]&&vis[j]==0){
                    arr.add(nums2[j]);
                    vis[j]=1;
                    break;
                }
                else if(nums1[i]<nums2[j]) break;
            }
        }
        int[] res=new int[arr.size()];
        int it=0;
        for(int i:arr){
            res[it++]=i;
        }
        return res;
    }
}
