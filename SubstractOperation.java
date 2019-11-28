package SoftwareConstruction;

import java.util.Random;

public class SubstractOperation extends BinaryOperation_1_1 {
	// 重写toString()方法
	@Override
	public String toString() {
		return (this.left_operand + " " + this.operator + " " + this.right_operand + " = ");
	}

	// 无参构造方法,调用减法习题生成方法
	public SubstractOperation() {
		generateSubstractOperation();
	}

	// 减法习题生成方法
	private void generateSubstractOperation() {
		// left记录左操作数
		// right记录右操作数
		// result记录计算结果
		int left, right, result;
		Random random = new Random();
		left = random.nextInt(101);
		// 结果小于0，重新生成右操作数
		do {
			right = random.nextInt(101);
			result = left - right;
		} while (result < 0);
		// 调用父类construct方法，转换操作数和操作符，并计算结果
		construct(left, right, 0);
	}
}