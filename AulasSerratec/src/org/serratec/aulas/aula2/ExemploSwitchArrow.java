package org.serratec.aulas.aula2;

public class ExemploSwitchArrow {

	public static void main(String[] args) {
		String day = "Monday";
		String result = switch(day) {
		case "Monday" -> "week day";
		case "Tuesday" -> "week day";
		case "Wednesday" -> "week day";
		case "Thursday" -> "week day";
		case "Friday" -> "week day";
		case "Saturday", "Sunday" -> "weekend";
		default -> "Invalid day";
		};
		
		String result2 = switch(day) {
		case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "week day";
		case "Saturday", "Sunday" -> "weekend";
		default -> "Invalid day";
		};
		
		System.out.println(result);
		System.out.println(result2);

	}

}
