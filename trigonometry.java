class trigonometry extends Operation {
	
	static String angle;
	static String type;
	static String invType;
	
	trigonometry() {
		super();
		angle="radian";
		type="";
		invType="";
	}
	
	void doOperation(String operator) {                     //Method Overriding
		
		super.doOperation(operator);                        //Using super keyword to access overridden method "doOperation" 
		
		switch(operator) {
		case "sin":
			if (invType.equals("inv"))
				result=Math.asin(firstNum);
			else
				result=Math.sin(firstNum);
			break;
		case "cos":
			if (invType.equals("inv"))
				result=Math.acos(firstNum);
			else
				result=Math.cos(firstNum);
			break;
		case "tan":
			if (invType.equals("inv"))
				result=Math.atan(firstNum);
			else
				result=Math.tan(firstNum);
			break;
		case "sind":
			if (invType.equals("inv"))
				result=Math.toDegrees(Math.asin(firstNum));
			else
				result=Math.toDegrees(Math.sin(firstNum));
			break;
		case "cosd":
			if (invType.equals("inv"))
				result=Math.toDegrees(Math.acos(firstNum));
			else
				result=Math.toDegrees(Math.cos(firstNum));
			break;
		case "tand":
			if (invType.equals("inv"))
				result=Math.toDegrees(Math.atan(firstNum));
			else
				result=Math.toDegrees(Math.tan(firstNum));
			break;
		case "sinh":
			if (invType.equals("inv"))
				result=Math.log(firstNum + Math.sqrt(firstNum*firstNum + 1.0));
			else
				result=Math.sinh(firstNum);
			break;
		case "cosh":
			if (invType.equals("inv"))
				 result=Math.log(firstNum + Math.sqrt(firstNum*firstNum - 1.0));
			else
				result=Math.cosh(firstNum);
			break;
		case "tanh":
			if (invType.equals("inv"))
				result=0.5*Math.log((1.0+firstNum)/(1.0-firstNum));
			else
				result=Math.tanh(firstNum);
			break;
		case "sindh":
			if (invType.equals("inv"))
				result=Math.log(firstNum + Math.sqrt(firstNum*firstNum + 1.0));
			else
				result=Math.toDegrees(Math.sinh(firstNum));
			break;
		case "cosdh":
			if (invType.equals("inv"))
				 result=Math.log(firstNum + Math.sqrt(firstNum*firstNum - 1.0));
			else
				result=Math.toDegrees(Math.cosh(firstNum));
			break;
		case "tandh":
			if (invType.equals("inv"))
				result=0.5*Math.log((1.0+firstNum)/(1.0-firstNum));
			else
				result=Math.toDegrees(Math.tanh(firstNum));
			break;
		}	
		textField.setText(String.valueOf(result));
	}
}