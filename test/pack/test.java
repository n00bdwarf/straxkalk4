package pack;

import static org.junit.Assert.*;
import org.junit.Test;

import kalk.klient;

public class test {
	
        @Test
	public void test4() {
		// Àâòîáóñ (÷èñëî ìåñò >=20)
		// >150 ë.ñ.
		// Äî 22 ëåò, ñòàæ äî 3 ëåò
		// Îãðàíè÷åííûé ñïèñîê âîäèòåëåé
		float k1=(float)1.6,k2=(float)1.8,k3=2025,k4=1;
		int s;
		//s - çíà÷åíèå èç ôóíêöèè sums, ðàñïîëîæåííîé â êëàññå klient
		s=klient.sums(k1,k2,k3,k4);
		// tests - èòîãîâîå çíà÷åíèå
		int tests=10498;
		// èòîãîâàÿ ñâåðêà
		assertEquals((int)tests,s);
	}
}
