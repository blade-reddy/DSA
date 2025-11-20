class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            if(!arr.contains(nums1[i]))arr.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(!arr.contains(nums2[i]))arr.add(nums2[i]);
        }
        int[] res=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            res[i]=arr.get(i);
        }
        Arrays.sort(res);
        return res;
    }
}
