package javaapp0428;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

public class StoreMain {

	public static void main(String[] args) {

		ArrayList<Store1> list = new ArrayList<>();

		// 가게 코드 (문자열),가게이름(문자열),평점(실수),최소주문금액(정수),메뉴(문자열)
		list.add(new Store1("1", "김밥천국", 2.5, 15000, "라면"));
		list.add(new Store1("2", "은행골", 4.7, 15000, "초밥"));
		list.add(new Store1("3", "스타벅스", 3.2, 10000, "커피"));

		// 데이터 출력
		System.out.println("코드\t가게이름\t평점\t최소주문금액\t메뉴\t");
		for (Store1 store : list) {
			System.out.println(

					store.getCode() + "\t" + store.getName() + "\t" + store.getGrade() + "\t" + store.getMinOrder()
							+ "\t" + "\t" + store.getMenu());
		}

		System.out.println("=======================================");

		ArrayList<LinkedHashMap<String, Object>> stores = new ArrayList<>();
		LinkedHashMap<String, Object> store2 = new LinkedHashMap<>();
		store2.put("code", "1");
		store2.put("name", "김밥천국");
		store2.put("grade", 2.5);
		store2.put("minOrder", 15000);
		store2.put("menu", "라면");
		stores.add(store2);

		for (LinkedHashMap<String, Object> map : stores) {
			Set<String> keys = map.keySet();
			for (String key : keys) {
				System.out.print(map.get(key) + "\t");
			}

		}

	}
}
