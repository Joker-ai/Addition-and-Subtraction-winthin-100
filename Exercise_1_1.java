package SoftwareConstruction;

import java.util.Random;

public class Exercise_1_1 {

	// 声明混合习题类数组对象
	public BinaryOperation_1_1 binaryoperationList[] = new BinaryOperation_1_1[50];
	// 声明加法习题类数组对象
	public AdditionOperation additionoperationList[] = new AdditionOperation[50];
	// 声明减法习题类数组对象
	public SubstractOperation substractoperationList[] = new SubstractOperation[50];

	Random random = new Random();

	// 无参构造方法,调用三种习题生成方法
	public Exercise_1_1() {
		generateAdditionExercise();
		generateSubstractExercise();
		generateBinaryExercise();
	}

	// 混合习题生成方法
	public void generateBinaryExercise() {
		// i控制习题数目，op记录符号
		int i = 0, op;
		while (i < 50) {
			// t=0代表重复，t=1代表无重复
			int t = 1;
			op = random.nextInt(2);
			if (op == 1) {// op=1生成加法算式
				// 实例化一个加法算式对象
				binaryoperationList[i] = new AdditionOperation();
			} else {// op=0生成减法算式
				// 实例化一个减法算式对象
				binaryoperationList[i] = new SubstractOperation();
			}
			// 判重
			for (int j = 0; j < i; j++) {
				if (binaryoperationList[i].equals(binaryoperationList[j])) {
					t = 0;
					break;
				} else
					continue;
			}
			if (t == 1) {
				i++;
			} else
				continue;
		}
	}

	// 加法习题生成方法
	public void generateAdditionExercise() {
		// i控制习题数目
		int i = 0;
		while (i < 50) {
			// t=0代表重复，t=1代表无重复
			int t = 1;
			// 实例化一个加法算式对象
			additionoperationList[i] = new AdditionOperation();
			// 判重
			for (int j = 0; j < i; j++) {
				if (additionoperationList[i].equals(additionoperationList[j])) {
					t = 0;
					break;
				}
			}
			if (t == 1) {
				i++;
			}
		}
	}

	public void generateSubstractExercise() {
		// i控制习题数目
		int i = 0;
		while (i < 50) {
			// t=0代表重复，t=1代表无重复
			int t = 1;
			// 实例化一个减法算式对象
			substractoperationList[i] = new SubstractOperation();
			// 判重
			for (int j = 0; j < i; j++) {
				if (substractoperationList[i].equals(substractoperationList[j])) {
					t = 0;
					break;
				} else
					continue;
			}
			if (t == 1) {
				i++;
			} else
				continue;
		}
	}
}