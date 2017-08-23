package poker;

import java.util.ArrayList;
import java.util.Collections;

public class Poker {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		// 花色
		String[] colors = {"♥","♠","♦","♣"};
		// 点数
		String[] numbers = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
		// 模拟扑克牌
		for (String color : colors) {
			for (String number : numbers) {
				list.add(color.concat(number));
			}
		}
		// 添加大小王
		list.add("♥G");
		list.add("♠G");
		// 生成扑克牌
		System.out.println("新牌：" + list);
		// 洗牌
		Collections.shuffle(list);
		System.out.println("洗牌：" + list);
		
		// 玩家
		ArrayList<String> playerA = new ArrayList<String>();
		ArrayList<String> playerB = new ArrayList<String>();
		ArrayList<String> playerC = new ArrayList<String>();
		// 发牌
		for (int i = 0; i < list.size()-3; i++) {
			if (i % 3 == 0) {
				playerA.add(list.get(i));
			} else if (i % 3 == 1) {
				playerB.add(list.get(i));
			} else if (i % 3 == 2) {
				playerC.add(list.get(i));
			}
		}
		System.out.println("playerA：" + playerA);
		System.out.println("playerB：" + playerB);
		System.out.println("playerC：" + playerC);
		
		// 底牌
		for (int i = list.size()-3; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

	}

}
