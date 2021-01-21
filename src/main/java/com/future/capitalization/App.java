package com.future.capitalization;

import java.util.*;
import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string: ");  
				String str= sc.nextLine();
				System.out.println("You have entered: "+str);
				String lowered = str.toLowerCase();
				String[] array2 = lowered.split(" ");
				for (int i = 0; i < array2.length; i++) {
						array2[i] = array2[i].length() > 0 ? array2[i].substring(0, 1).toUpperCase() + array2[i].substring(1) : "";
					}
					System.out.println(Arrays.toString(array2));
					System.out.println(String.join(" ", Arrays.asList(array2)));
					String[] array = str.split(" ");
					for (int i = 0; i < array.length; i++) {
						array[i] = StringUtils.capitalize(array[i]);
					}
					System.out.println(Arrays.toString(array));
					System.out.println(String.join(" ", Arrays.asList(array)));
    }
}
