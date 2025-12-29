/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int top = -1;
        for (char c : s.toCharArray()){
            if (c == '('){
                stack[++top] = ')';
            }
            else if (c == '{'){
                stack[++top] = '}';
            }
            else if (c == '['){
                stack[++top] =']';
            }
            else{
                if (top==-1 || stack[top--]!=c){
                    return false;
                }
            }
        }
        return top == -1;
    }
}

// class Solution {
//     public boolean isValid(String s) {
//         Stack<Character> stack = new Stack<>();

//         for (int i = 0; i < s.length(); i++) {
//             char temp = s.charAt(i);

//             // 1. Nếu là dấu mở -> Push vào stack
//             if (temp == '{' || temp == '(' || temp == '[') {
//                 stack.push(temp);
//             } 
//             // 2. Nếu là dấu đóng
//             else {
//                 // Kiểm tra: Nếu gặp dấu đóng mà stack rỗng -> Không có dấu mở tương ứng -> Sai
//                 if (stack.isEmpty()) {
//                     return false;
//                 }

//                 // Lấy dấu mở mới nhất ra để so sánh
//                 char top = stack.pop();
//                 if (temp == '}' && top != '{') return false;
//                 if (temp == ']' && top != '[') return false;
//                 if (temp == ')' && top != '(') return false;
//             }
//         }

//         // 3. Sau khi duyệt xong, stack phải rỗng mới là hợp lệ (tránh trường hợp thừa dấu mở như "((")
//         return stack.isEmpty();
//     }
// }
// @lc code=end

