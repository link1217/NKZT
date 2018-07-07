package TongYiMoNiBiShi1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 如果一个单词通过循环右移获得的单词，我们称这些单词都为一种循环单词。 例如：picture 和 turepic 就是属于同一种循环单词。 现在给出n个单词，需要统计这个n个单词中有多少种循环单词。 
输入描述:
输入包括n+1行：

第一行为单词个数n(1 ≤ n ≤ 50)

接下来的n行，每行一个单词word[i]，长度length(1 ≤ length ≤ 50)。由小写字母构成


输出描述:
输出循环单词的种数

输入例子1:
5
picture
turepic
icturep
word
ordw

输出例子1:
2
 * @author kafka
 *
 */
public class Main2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n =scanner.nextInt();
		String[] data = new String[n];
		for(int i=0;i<n;i++){
			data[i] = scanner.next();
		}
		
		
		List<String> list = new ArrayList<String>();
		list.add(data[0]+data[0]);
		for(int i=1;i<n;i++){
			boolean flag = false;		//list中的字符串是否包含data[i]
			for(int j=0;j<list.size();j++){
				if(list.get(j).length()/2==data[i].length()&&list.get(j).contains(data[i])){
					flag = true;
				}
			}
			if(!flag)
				list.add(data[i]+data[i]);
		}
		System.out.println(list.size());
		scanner.close();
	}
}









