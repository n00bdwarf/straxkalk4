/**
 * ���������� ������
 */
package kalk;
/**
 * ������ ��������� �������, ����������� ��� ������.
 */
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * ���������� ���������� ������, ������������ ����� ������ JFrame, ��� �������� ���� �������, ��� �������������� ���������� ������ 
 */
public class klient extends JFrame {
	/**
	 * ��������� ���������� k1,k2,k3,k4, ������� ������������ ��� ������� ��������� �����, 
	 * k1 - �������� ���������, k2 - ������� � ���� ���������,k3 - ��� ������������� ��������,
	 * k4 - ���������� � ���������� ��������
	 * ���������� s ������������ ��� ��������� ��������� �����.
	 */
	private static final long serialVersionUID = 1L;
	float k1,k2,k3,k4;
	int s;
	/**
	 * �����, ���������� �� ������ ������
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					klient frame = new klient();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * ���������� ������, � ������� ����������� �������� �������� �����, �� �������, � ����� ���������� ���������� ������ �����
	 */
	public klient() {
		/**
		 * ������ ����������� ��������� ��� ���������� ������ ����� � ���������� item, item1, item2, item3.
		 */
		String[] items = {
				"<=50 �.�",
			    "�� 50 �� 70 �.�.",
			    "�� 70 �� 100 �.�.",
			    "�� 100 �� 120 �.�.",
			    "�� 120 �� 150 �.�.",
			    ">150 �.�."
			};
		
		String[] items1 = {
			    "�� 22 ���, ���� �� 3 ���",
			    "�� 22 ���, ���� ����� 3 ���",
			    "����� 22 ���, ���� �� 3 ���",
			    "����� 22 ���, ���� ����� 3 ���"
			};
		String[] items2 = {
			    "�������� ����������",
			    "��������",
			    "�������� ���������� (>=16 �.)",
			    "�������� ���������� (<16 �.)",
			    "������� (����� ���� >=20)",
			    "������� (����� ���� <20)"
			};
		String[] items3 = {
			    "������������ ������ ���������",
			    "��� �����������"
			};
		/**
		 * �������� ������� ������
		 */
		JPanel contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(BorderFactory.createTitledBorder("������"));
		/**
		 * �������� ������� ���: 
		 * ���������� ������� � �����
		 * ������
		 */
		JPanel Panel1 = new JPanel(new GridLayout(8, 1));
		Panel1.setBounds(10,15,280,200);
		JPanel Panel2 = new JPanel();
		Panel2.setLayout(null);
		Panel2.setBounds(300,15,350,200);
		/**
		 * ������� ������ � ������� �������� ��� ������, �����, ��������������
		 */
		Font font = new Font("Verdana", Font.PLAIN, 14);
		
		/**
		 * �������� ����� 
		 */
		JLabel label_1 = new JLabel("�������� ���������");
		label_1.setFont(font);
		JLabel label_2 = new JLabel("�������� � ���� ���������");
		label_2.setFont(font);
		JLabel label_3 = new JLabel("��� ������������� ��������");
		label_3.setFont(font);
		JLabel label_4 = new JLabel("����, ���������� � ����������");
		label_4.setFont(font);
		JLabel label_5 = new JLabel("0 ���.");
		label_5.setBounds(80, 120, 350, 20);
		label_5.setFont(font);
		/**
		 * �������� ���������� �������
		 */
		JComboBox<String> comboBox = new JComboBox<>(items);
		comboBox.setFont(font);
		JComboBox<String> comboBox_1 = new JComboBox<>(items1);
		comboBox_1.setFont(font);
		JComboBox<String> comboBox_2 = new JComboBox<>(items2);
		comboBox_2.setFont(font);
		JComboBox<String> comboBox_3 = new JComboBox<>(items3);
		comboBox_3.setFont(font);
		
		/**
		 * �������� ������
		 */
		JButton btnNewButton = new JButton("����������");
		btnNewButton.setFont(font);
		btnNewButton.setBounds(50, 80, 140, 40);
		
		/**
		 * ���������� ��������� �� ������ ��� ���������� �������
		 */
		Panel1.add(label_1);
		Panel1.add(comboBox);
		Panel1.add(label_2);
		Panel1.add(comboBox_1);
		Panel1.add(label_3);
		Panel1.add(comboBox_2);
		Panel1.add(label_4);
		Panel1.add(comboBox_3);
		/**
		 * ���������� ��������� �� ������ ��� ������
		 */
		Panel2.add(btnNewButton);
		Panel2.add(label_5);
		/**
		 * ���������� ��������� �� ������� ������
		 */
		contentPane.add(Panel1);
		contentPane.add(Panel2);
		/**
		 * �������� �������, ������������, �������� �������� �����, ���������� �� ��� ������� ������
		 */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("����������� �����");
		setContentPane(contentPane);
		setBounds(100, 100, 570, 280);
		/**
		 * ������� ��� ������ "����������". ���������� ��������� ������ �����
		 */
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**
				 * ������ ��������, � ����������� �� ��������� �������� ���������, ������������ ����������� k1.
				 */
				switch (comboBox.getSelectedIndex())
				{
				case 0: k1=(float)(0.6);
				break;
				
				case 1: k1=(float)(1);
				break;
				
				case 2: k1=(float)(1.1);
				break;
				
				case 3: k1=(float)(1.2);
				break;
				
				case 4: k1=(float)(1.4);
				break;
				
				case 5: k1=(float)(1.6);
				break;
				}
				/**
				 * ������ ��������, � ����������� �� ���������� ����� � �������� ��������, ������������ ����������� k2.
				 */
				switch (comboBox_1.getSelectedIndex())
				{
				case 0: k2=(float)(1.8);
				break;
				
				case 1: k2=(float)(1.6);
				break;
				
				case 2: k2=(float)(1.7);
				break;
				
				case 3: k2=(float)(1);
				break;
				}
				/**
				 * ������ ��������, � ����������� �� ���������� ���� ������������� ��������, ������������ ����������� k3.
				 */
				switch (comboBox_2.getSelectedIndex())
				{
				case 0: k3=(float)(1980);
				break;
				
				case 1: k3=(float)(1215);
				break;
				
				case 2: k3=(float)(3240);
				break;
				
				case 3: k3=(float)(2025);
				break;
				
				case 5: k3=(float)(1620);
				break;
				
				case 4: k3=(float)(2025);
				break;
				}
				/**
				 * ������ ��������, � ����������� �� ���������� ���������� ���������� � ���������� ���������, ������������ ����������� k4.
				 */
				if (comboBox_3.getSelectedIndex()== 0) k4=1;
				else k4=(float)(1.8);
				/**
				 * ��������� ��������� �����
				 */
				s=sums(k1,k2,k3,k4);
				/**
				 * ������� ���������� ��������� � ����� "0 ���."
				 */
				label_5.setText(Integer.toString(s) + " ���.");
			}
		});
	}
	
	public static int sums(float k1,float k2,float k3,float k4)
	{
	float sum;
	int s;
	sum = k1*k2*k3*k4*(float)(1.8);
	s = Math.round(sum);
	return s;
	}
	
}
