package SoftwareConstruction;

import java.util.Random;

public class Addition_and_Subtraction_winthin_100 {
	
	public static int random_produce() {	
		/* ��������� (0-100)*/
		Random random = new Random();	
		int random_for_equation;	
		random_for_equation = random.nextInt(101);	//����һ��0-100���������
		return random_for_equation;
	}
	
	public static int char_produce() {		
		/* �����ӻ�����ţ�0Ϊ�� ��1Ϊ��*/
		Random random = new Random();
		int char_for_equation;
		char_for_equation = random.nextInt(2);	//����0��1��
		return char_for_equation;
	}
	
	public static int judge_consequence(int m,int n,int l) {	
		/* �жϺ��Ƿ����100�����Ƿ�С��0*/
		int t = 0;
		if(l == 1) {	//1����ӷ�
			if((m+n) <= 100) t = 1;	//����Ҫ��
		}
		if(l == 0) {	//0�������
			if((m-n) >= 0) t = 1;	//����Ҫ��
		}
		return t;	//������Ҫ��
	}
	
	public static int judge_repetition(int m,int n,int l,int[][] etarr) {
		/* �ж���ʽ�Ƿ��ظ� */
		int t = 1;	//���ظ�
		for(int i = 0;i < etarr[0].length;i++) {
			if(l == etarr[1][i]) {	//�ж�������Ƿ�һ��
				if(((m == etarr[0][i])&&(n == etarr[2][i]))||((n == etarr[0][i])&&(m == etarr[2][i]))) //�жϲ������Ƿ���ͬ
				{
					t = 0;	//�ظ�
				}
			}	
		}
		return t;
	}
	
	public static void equation_print(int[][] etarr) {
		/* ���ϰ�� */
		System.out.println("������50��100���ڼӼ����⣺");
		for(int i = 0;i < etarr[0].length;i++) {
			if((i % 5) == 0) System.out.println();	//ÿ5����ʽһ�����
			if (etarr[1][i] == 0) //������ʽ���
				System.out.print((i+1)+":"+etarr[0][i]+"-"+etarr[2][i]+"= "+"\t");
			if(etarr[1][i] == 1)	//�ӷ���ʽ���
				System.out.print((i+1)+":"+etarr[0][i]+"+"+etarr[2][i]+"= "+"\t");
		}
	}
	
	public static void answer_calculate_and_print(int[][] etarr) {
		/* ����𰸲���� */
		System.out.println();
		System.out.println("������ϰ��Ĳο��𰸣�");
		for(int i = 0;i < etarr[0].length;i++) {
			if((i % 5) == 0) System.out.println();	//ÿ5����һ�����
			if (etarr[1][i] == 0) 	//������ʽ���㲢�����
				System.out.print((i+1)+": "+(etarr[0][i]-etarr[2][i])+"\t");
			if(etarr[1][i] == 1)	//�ӷ���ʽ���㲢�����
				System.out.print((i+1)+": "+(etarr[0][i]+etarr[2][i])+"\t");
		}
	}
	
	public static void equation_produce() {		
		/*������ʽ*/
		int[][] equationarray = new int[3][50];	/*���50��������*/
		int x,y;		/*�ݴ������*/
		int z;			/*�ݴ�Ӽ����ţ�0�������1�����*/
		int equation_count=0,judge_cq,judge_rt;
		while(equation_count < 50) {
			x = random_produce();	//������������ɺ���
			y = random_produce();	//������������ɺ���
			z = char_produce();	//��������������ɺ���
			if((judge_cq = judge_consequence(x,y,z)) == 0) continue;//�����ж���ʽ�����Χ�������ж���ʽ����Ƿ����Ҫ��������������������ʽ
			else if((judge_rt = judge_repetition(x,y,z,equationarray)) == 0) continue;//������ʽ�ظ��жϺ��������ظ�����������ʽ
			else {	//��������Ҫ�󣬽���ʽ��������
				equationarray[0][equation_count] = x;
				equationarray[1][equation_count] = z;
				equationarray[2][equation_count] = y;
				equation_count++;
			}
		}
		equation_print(equationarray);	//������ʽ�������
		answer_calculate_and_print(equationarray);	//���ô��������
	}
	
	public static void main(String[] args) {
		equation_produce();	//������ʽ���ɺ���
	}
}