package SoftwareConstruction;

import java.util.Random;

public class Addition_and_Subtraction_winthin_100 {
	
	public static int random_produce() {	
		/* 产生随机数 (0-100)*/
		Random random = new Random();	
		int random_for_equation;	
		random_for_equation = random.nextInt(101);	//生成一个0-100的随机整数
		return random_for_equation;
	}
	
	public static int char_produce() {		
		/* 产生加或减符号；0为减 ；1为加*/
		Random random = new Random();
		int char_for_equation;
		char_for_equation = random.nextInt(2);	//生成0或1；
		return char_for_equation;
	}
	
	public static int judge_consequence(int m,int n,int l) {	
		/* 判断和是否大于100；差是否小于0*/
		int t = 0;
		if(l == 1) {	//1代表加法
			if((m+n) <= 100) t = 1;	//符合要求
		}
		if(l == 0) {	//0代表减法
			if((m-n) >= 0) t = 1;	//符合要求
		}
		return t;	//不符合要求
	}
	
	public static int judge_repetition(int m,int n,int l,int[][] etarr) {
		/* 判断算式是否重复 */
		int t = 1;	//不重复
		for(int i = 0;i < etarr[0].length;i++) {
			if(l == etarr[1][i]) {	//判断运算符是否一致
				if(((m == etarr[0][i])&&(n == etarr[2][i]))||((n == etarr[0][i])&&(m == etarr[2][i]))) //判断操作数是否相同
				{
					t = 0;	//重复
				}
			}	
		}
		return t;
	}
	
	public static void equation_print(int[][] etarr) {
		/* 输出习题 */
		System.out.println("以下是50到100以内加减法题：");
		for(int i = 0;i < etarr[0].length;i++) {
			if((i % 5) == 0) System.out.println();	//每5个算式一行输出
			if (etarr[1][i] == 0) //减法算式输出
				System.out.print((i+1)+":"+etarr[0][i]+"-"+etarr[2][i]+"= "+"\t");
			if(etarr[1][i] == 1)	//加法算式输出
				System.out.print((i+1)+":"+etarr[0][i]+"+"+etarr[2][i]+"= "+"\t");
		}
	}
	
	public static void answer_calculate_and_print(int[][] etarr) {
		/* 计算答案并输出 */
		System.out.println();
		System.out.println("以下是习题的参考答案：");
		for(int i = 0;i < etarr[0].length;i++) {
			if((i % 5) == 0) System.out.println();	//每5个答案一行输出
			if (etarr[1][i] == 0) 	//减法算式计算并输出答案
				System.out.print((i+1)+": "+(etarr[0][i]-etarr[2][i])+"\t");
			if(etarr[1][i] == 1)	//加法算式计算并输出答案
				System.out.print((i+1)+": "+(etarr[0][i]+etarr[2][i])+"\t");
		}
	}
	
	public static void equation_produce() {		
		/*生成算式*/
		int[][] equationarray = new int[3][50];	/*存放50道计算题*/
		int x,y;		/*暂存操作数*/
		int z;			/*暂存加减符号；0代表减；1代表加*/
		int equation_count=0,judge_cq,judge_rt;
		while(equation_count < 50) {
			x = random_produce();	//调用随机数生成函数
			y = random_produce();	//调用随机数生成函数
			z = char_produce();	//调用随机符号生成函数
			if((judge_cq = judge_consequence(x,y,z)) == 0) continue;//调用判断算式结果范围函数，判断算式结果是否符合要求，若不符合重新生成算式
			else if((judge_rt = judge_repetition(x,y,z,equationarray)) == 0) continue;//调用算式重复判断函数，若重复重新生成算式
			else {	//满足所有要求，将算式存入数组
				equationarray[0][equation_count] = x;
				equationarray[1][equation_count] = z;
				equationarray[2][equation_count] = y;
				equation_count++;
			}
		}
		equation_print(equationarray);	//调用算式输出函数
		answer_calculate_and_print(equationarray);	//调用答案输出函数
	}
	
	public static void main(String[] args) {
		equation_produce();	//调用算式生成函数
	}
}