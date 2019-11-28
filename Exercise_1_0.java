package SoftwareConstruction;

public class Exercise_1_0 {
	// 声明混合习题类数组对象
	private BinaryOperation_1_0 operationList[] = new BinaryOperation_1_0[50];

	// 无参构造方法,调用混合习题生成方法
	public Exercise_1_0() {
		generateBinaryExercise();
	}

	// 混合习题生成方法
	public void generateBinaryExercise() {
		int t = 1, i = 0;
		while (i < 50) {
			// 实例化一个混合算式对象
			operationList[i] = new BinaryOperation_1_0();
			// 判重
			for (int j = 0; j < i; j++) {
				if (operationList[i].equals(operationList[j])) {
					t = 0;
					break;
				}
			}
			if (t == 1) {
				i++;
			} else
				continue;
		}
	}

	// 主方法,输出习题及答案
	public static void main(String[] args) {
		// 实例化习题对象
		Exercise_1_0 EX = new Exercise_1_0();
		// 打印50道加减法混合题题题目
		System.out.println("以下是50到100以内加减法题：");
		for (int i = 0; i < EX.operationList.length; i++) {
			System.out.print((i + 1) + ": " + EX.operationList[i] + "\t");
			if ((i + 1) % 5 == 0)
				System.out.println();
		}
		// 打印50道加减法混合题题答案
		System.out.println("以下是习题答案：");
		for (int i = 0; i < EX.operationList.length; i++) {
			System.out.print((i + 1) + ": " + EX.operationList[i].getValue() + "\t");
			if ((i + 1) % 5 == 0)
				System.out.println();
		}
	}
}