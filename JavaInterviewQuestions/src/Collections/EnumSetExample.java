package Collections;

import java.util.EnumSet;

public class EnumSetExample {

	public static void main(String[] args) {
		EnumSet<COLORS>set1,set2 = null,set3,set4;
		
		set1=EnumSet.of(COLORS.RED,COLORS.GREEN,COLORS.YELLOW);
		set1=EnumSet.complementOf(set1);
		set3=EnumSet.range(COLORS.RED,COLORS.BLUE);
		set4=EnumSet.allOf(COLORS.class);
		
		System.out.println("Set 1 : " + set1 );
		System.out.println("Set 2 : " + set2 );
		System.out.println("Set 3 : " + set3 );
		System.out.println("Set 4 : " + set4 );
	}

}
