package pack;

import static org.junit.Assert.*;

import kalk.klient;

public class test {

	public void test4() {
		// ������� (����� ���� >=20)
		// >150 �.�.
		// �� 22 ���, ���� �� 3 ���
		// ������������ ������ ���������
		float k1=(float)1.6,k2=(float)1.8,k3=2025,k4=1;
		int s;
		//s - �������� �� ������� sums, ������������� � ������ klient
		s=klient.sums(k1,k2,k3,k4);
		// tests - �������� ��������
		int tests=10498;
		// �������� ������
		assertEquals((int)tests,s);
	}
}
