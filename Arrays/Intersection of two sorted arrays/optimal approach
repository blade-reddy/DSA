class Solution {
    public int[] intersectionArray(int[] nums1, int[] nums2) {
        List<Integer> arr=new ArrayList<>();
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }else if(nums1[i]>nums2[j]){
                j++;
            }else{
                arr.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] res=new int[arr.size()];
        int it=0;
        for(int ij:arr){
            res[it++]=ij;
        }
        return res;
    }
}
