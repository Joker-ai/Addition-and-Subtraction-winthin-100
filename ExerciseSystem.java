package SoftwareConstruction;

public class ExerciseSystem {

	public static void main(String[] Args) {

		//实例化习题类
		Exercise_1_1 EX = new Exercise_1_1();

		//打印50道加法题题目
		System.out.println("以下是50道100以内加法题：");
		for (int i = 0; i < EX.additionoperationList.length; i++) {
			System.out.print((i + 1) + ": " + EX.additionoperationList[i] + "\t");
			if ((i + 1) % 5 == 0)
				System.out.println();
		}
		//打印50道加法题答案
		System.out.println("以下是加法习题答案：");
		for (int i = 0; i < EX.additionoperationList.length; i++) {
			System.out.print((i + 1) + ": " + EX.additionoperationList[i].getValue() + "\t");
			if ((i + 1) % 5 == 0)
				System.out.println();
		}
		
		//打印50道减法题题目
		System.out.println("以下是50道结果大于0的减法题：");
		for (int i = 0; i < EX.substractoperationList.length; i++) {
			System.out.print((i + 1) + ": " + EX.substractoperationList[i] + "\t");
			if ((i + 1) % 5 == 0)
				System.out.println();
		}
		//打印50道减法题答案
		System.out.println("以下是减法习题答案：");
		for (int i = 0; i < EX.substractoperationList.length; i++) {
			System.out.print((i + 1) + ": " + EX.substractoperationList[i].getValue() + "\t");
			if ((i + 1) % 5 == 0)
				System.out.println();
		}
		
		//打印50道加减法混合题题题目
		System.out.println("以下是50道加减法混合题：");
		for (int i = 0; i < EX.binaryoperationList.length; i++) {
			System.out.print((i + 1) + ": " + EX.binaryoperationList[i] + "\t");
			if ((i + 1) % 5 == 0)
				System.out.println();
		}
		//打印50道加减法混合题题答案
		System.out.println("以下是混合题习题答案：");
		for (int i = 0; i < EX.binaryoperationList.length; i++) {
			System.out.print((i + 1) + ": " + EX.binaryoperationList[i].getValue() + "\t");
			if ((i + 1) % 5 == 0)
				System.out.println();
		}
	}
}