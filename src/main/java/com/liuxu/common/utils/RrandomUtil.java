package com.liuxu.common.utils;

import java.util.HashSet;
import java.util.Random;

public class RrandomUtil {
	//方法1：返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)
	public static int random(int min, int max){		
		// 实例化随机数工具类
		Random r = new Random();
		// 根据公式来获取能包含最小值和最大值的随机数
		int i = r.nextInt(max - min +1) + min;
		// 返回
		return i;
	}
	//方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)
	public static int[] subRandom (int min, int max, int subs){
		// 存放随机数字.用来过滤重复数据
				HashSet<Integer> set = new HashSet<Integer>();

				// 声明目标数组.用来存放随机数
				int[] dest = new int[subs];
				
				//向set集合中添加随机数据,
				while (set.size() != subs) {
					int x = random(min, max);
					set.add(x);
				}
				//遍历set集合,存入目标数组
				int y = 0;
				for (int value : set) {
					dest[y] = value;
					y++;
				}

				return dest;
	}
	//方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
	public static char randomCharacter (){
		// 创建一个有1~9，a~z，A~Z的字符传
		String str = "1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		// 通过字符串的剪切，来达到返回一个随机的字符
		return str.charAt(random(0, str.length() -1));
	}
	//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	public static String randomString(int length){
		
		String str = "";
		for(int i = 0;i < length;i++) {
			str += randomCharacter();
		}
		
		return str;
	}
}
