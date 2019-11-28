package SoftwareConstruction;

import java.util.*;

public class BinaryOperation_1_0 {
	// left_operand，左操作数
	private int left_operand;
	// operator，操作符
	private char operator;
	// right_operand右操作数
	private int right_operand;
	// 结果
	private int value;
	Random random = new Random();

	// 无参构造方法,调用混合算式生成方法
	public BinaryOperation_1_0() {
		generateBinaryOperation_1_0();
	}

	// getLeft_num()方法，获取左操作数
	public int getLeft_num() {
		return this.left_operand;
	}

	// getRight_num()，获取右操作数
	public int getRight_num() {
		return this.right_operand;
	}

	// getOperator()，获取操作符
	public char getOperator() {
		return this.operator;
	}

	// getValue()，获取结果
	public int getValue() {
		return this.value;
	}

	// 记录操作数;转换操作符;计算结果
	public void construct(int left, int right, int op) {
		left_operand = left;
		right_operand = right;
		// op=0,操作符为‘-’
		if (op == 0)
			operator = '-';
		// op=1,操作符为‘+’
		else
			operator = '+';
		// 根据操作符计算结果
		if (operator == '-') {
			value = left_operand - right_operand;
		} else {
			value = left_operand + right_operand;
		}
	}

	// 混合算式生成方法
	public void generateBinaryOperation_1_0() {
		Random random = new Random();
		// Left左操作数，Right右操作数，op记录符号，result记录结果
		int left, right, op, result;
		left = random.nextInt(101);
		op = random.nextInt(2);
		// op=0,减法
		if (op == 0) {
			// 结果小于0，重新生成右操作数
			do {
				right = random.nextInt(101);
				result = left - right;
			} while (result < 0);
		}
		// op=1加法
		else {
			// 结果大于100，重新生成右操作数
			do {
				right = random.nextInt(101);
				result = left + right;
			} while (result > 100);
		}
		construct(left, right, op);
	}

	// 重写同String()方法
	@Override
	public String toString() {
		return (this.left_operand + " " + this.operator + " " + this.right_operand + " = ");
	}
}