class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(String s: details){
            String subStr = s.substring(11,13);
            if(Integer.parseInt(subStr)>60){
                count++;
            }
        }
        return count;
        
    }
}