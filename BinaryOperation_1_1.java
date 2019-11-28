package SoftwareConstruction;

public abstract class BinaryOperation_1_1 {
	// left_operand，左操作数
	public int left_operand;
	// operator，操作符
	public char operator;
	// right_operand右操作数
	public int right_operand;
	// 结果
	public int value;

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
}