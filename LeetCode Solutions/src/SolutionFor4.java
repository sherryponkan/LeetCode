public class SolutionFor4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length==0&&nums2.length==0){
            return 0;
        }
        int[] newArr = new int[nums1.length+nums2.length];
        int i=0;
        int j=0;
        int index =0;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]<nums2[j]){
                newArr[index++]=nums1[i++];
            }else{
                newArr[index++]=nums2[j++];
            }
        }

        while(i<nums1.length){
            newArr[index++]=nums1[i++];
        }

        while(j<nums2.length){
            newArr[index++]=nums2[j++];
        }

        i=0;
        j=newArr.length-1;
        while(i<j){
            i++;
            j--;
        }
        return (newArr[i]+newArr[j])/2.0;
    }
}
