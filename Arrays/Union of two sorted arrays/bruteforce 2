class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        Set<Integer> arr=new TreeSet<>();
        for(int i : nums1) arr.add(i++);
        for(int i : nums2)arr.add(i++); 
        int[] res=new int[arr.size()];
        int x=0;
        for(int i : arr) res[x++]=i;
        return res;
    }
