package com.hammer.jdkchange.jdk8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaMain {
	public static void main(String[] args) {
		TestLambdaInterface1 f1 = () -> {
			return 1;
		};

		/// 单返回值可以不写return
		TestLambdaInterface1 f11 = () -> 1;
		// 方法引用 方法持有者(static方法为类,实例方法为实例)
		TestLambdaInterface1 f111 = LambdaMain::testMethod1;

		TestLambdaInterface2 f2 = (a) -> 1;

		// 单参数可以省略()
		TestLambdaInterface2 f22 = a -> 1;

		// 方法引用 方法持有者(static方法为类,实例方法为实例)
		TestLambdaInterface2 f222 = LambdaMain::testMethod2;
		// 接口为对象的生成器,通过类名::new的方式实例化对象,然后调用方法返回对象
		TestLambdaInterface3 f3 = () -> new Object();
		Object obj1 = f3.getObject();

		TestLambdaInterface3 f33 = Object::new;
		Object obj2 = f33.getObject(/* 有参数就加参数 */);

		// 线程创建简化,runable接口可通过lambda表达式
		new Thread(() -> {
			System.err.println("runable的run方法");
		}).start();
		;

		List<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 1, 2, 3, 4);
		list.forEach(System.out::println);
		list.forEach((Integer i) -> System.err.println(i));

		list.removeIf((Integer i) -> {
			return i == 3;
		});
		list.removeIf((Integer i) -> i == 2);
		System.err.println("finish" + list);

		// 比较器简化
		list.sort((i1, i2) -> i1 - i2);
	}

	public static int testMethod1() {
		return 1;
	}

	public static int testMethod2(int a) {
		return a;
	}

}
