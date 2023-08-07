public class Searchingarray {
    public static int search(int nums[] , int target){
        int left = 0 ;
        int right = nums.length - 1;
        
        while(left <= right){
            int mid = left + (right - left) / 2;

            if(nums[mid] == target ){
                return mid;
            }

            if(nums[left] <= nums[mid]){
                if(nums[left] <= target && target < nums[mid]){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
            else{
                if(nums[mid] < target && target <= nums[right]){
                    left = mid+1;
                }
                else{
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[] = {4,5,6,7,0,1,2};
        int target = 3;
        System.out.println(search(num, target));
    }
}

// explanation with dry run.
// Example: nums = [4, 5, 6, 7, 0, 1, 2], target = 0

// Initialize left to 0 and right to nums.length - 1, which is 6.

// left = 0, right = 6.
// First iteration of the while loop:

// Calculate mid as left + (right - left) / 2, which is 0 + (6 - 0) / 2 = 3.
// Compare nums[mid] (which is 7) with target (which is 0).
// Since 7 is not equal to 0, we proceed to check if the left or right half is sorted.
// The left half [4, 5, 6, 7] is sorted since nums[left] (which is 4) is less than or equal to nums[mid] (which is 7).
// Check if target is within the sorted left half [4, 5, 6, 7]:

// target = 0, nums[left] = 4, and nums[mid] = 7.
// Since target is less than nums[mid] and greater than or equal to nums[left], we narrow the search range to the left half.
// Update right to mid - 1, so right = 3 - 1 = 2.
// Second iteration of the while loop:

// Calculate mid as left + (right - left) / 2, which is 0 + (2 - 0) / 2 = 1.
// Compare nums[mid] (which is 5) with target (which is 0).
// Since 5 is not equal to 0, we again check if the left or right half is sorted.
// The left half [4, 5] is sorted since nums[left] (which is 4) is less than or equal to nums[mid] (which is 5).
// Check if target is within the sorted left half [4, 5]:

// target = 0, nums[left] = 4, and nums[mid] = 5.
// Since target is less than nums[mid] and greater than or equal to nums[left], we narrow the search range to the left half.
// Update right to mid - 1, so right = 1 - 1 = 0.
// Third iteration of the while loop:

// Calculate mid as left + (right - left) / 2, which is 0 + (0 - 0) / 2 = 0.
// Compare nums[mid] (which is 4) with target (which is 0).
// Since 4 is not equal to 0, we check if the left or right half is sorted.
// The left half contains only one element [4], which is not sorted since nums[left] (which is 4) is equal to nums[mid] (which is 4).
// Check if target is within the sorted right half [0, 1, 2]:

// target = 0, nums[mid] = 4, and nums[right] = 2.
// Since target is not greater than nums[mid] and less than or equal to nums[right], we narrow the search range to the right half.
// Update left to mid + 1, so left = 0 + 1 = 1.
// Fourth iteration of the while loop:

// Calculate mid as left + (right - left) / 2, which is 1 + (0 - 1) / 2 = 0.
// Compare nums[mid] (which is 0) with target (which is 0).
// Since 0 is equal to 0, we have found the target.
// Return the index mid, which is 0.

// The target value 0 is found at index 0 in the nums array.
