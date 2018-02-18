package pack;

import static org.junit.Assert.*;

import kalk.klient;

public class test {

	public void test4() {
		// Автобус (число мест >=20)
		// >150 л.с.
		// До 22 лет, стаж до 3 лет
		// Ограниченный список водителей
		float k1=(float)1.6,k2=(float)1.8,k3=2025,k4=1;
		int s;
		//s - значение из функции sums, расположенной в классе klient
		s=klient.sums(k1,k2,k3,k4);
		// tests - итоговое значение
		int tests=10498;
		// итоговая сверка
		assertEquals((int)tests,s);
	}
}
