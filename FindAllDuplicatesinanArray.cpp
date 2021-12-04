#include<bits/stdc++.h>
#include<iostream.h>
using namespace std;

class Solution {
public:
    vector<int> findDuplicates(vector<int>nums) {

        vector<int> ans;
        for(int i = 0; i < nums.size(); ++i){
            int idx = abs(nums[i]) - 1;
            if(nums[idx] < 0)
                ans.push_back(idx + 1);
            else
                nums[idx] = -nums[idx];
        }
        // restore the array if the array cannot be changed when the function returns
        /*
        for(int &num : nums){
            if(num < 0)
                num = -num;
        }
        */
        return ans;
    }
};    
