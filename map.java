class Solution {
  public String[] solution(int n, int[] arr1, int[] arr2) {
       String[] answer = new String[n];
      
          for(int i=0;i<n;i++) {
              int num = arr1[i]|arr2[i];
              //합친 2진수 지도값 넣기
              String b = Integer.toBinaryString(num);
              //문자열 합치기
              b=String.format("%" + n + "s",b);
              // 공백과 #으로 변경
              answer[a]=b.replace("0"," ").replace("1", "#");
              
          }
          return answer;
  }
}
        
