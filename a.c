#include <bits/stdc++.h>
class Solution {
public:
    vector<vector<int>> indexPairs(string text, vector<string>& words) {
        vector<vector<int>>v;
        for(int i = 0; i < words.size(); i++){
            int length = words[i].size();
            for(int j = 0; j < text.size() - length; j++){
                if(text.substring(j， j + length).compare(word[i])==0){
                    vector<int>a(2);
                    a[0] = j;
                    a[1] = j + length - 1;
                    v[i] = a;
                }
            }
        }
        return v;
    }
};
