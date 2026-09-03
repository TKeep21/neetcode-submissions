class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String s:strs){
            sb.append(s.length());
            sb.append("#");
            sb.append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList();
        int i = 0;
        char[] str_arr = str.toCharArray();

        while (i<str.length()){
            int j=i;
            while (str_arr[j] != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            int word_start = j+1;
            int word_end = word_start+length;

            res.add(str.substring(word_start,word_end));

            i = word_end;
            
        }
        return res;
    }
}
