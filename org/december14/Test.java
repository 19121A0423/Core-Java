package org.december14;

import java.util.Arrays;
import java.util.List;


public class Test {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//        // Sequential stream
//        System.out.println("Sequential Stream:");
//        numbers.stream()
//                .map(n -> n * n)
//                .forEach(value -> System.out.print(value+" "));
//        System.out.println();
//        
//        // Parallel stream
//        System.out.println("\nParallel Stream:");
//        numbers.stream().parallel()
//                .map(n -> n * n)
//                .forEach(value -> System.out.print(value+" "));
//        
//	}
//}

        // Accumulate integers using opeartion class with parallel stream
		Operation collector = numbers.stream()
                .parallel() // Convert to parallel stream
                .collect(Operation::new, Operation::add, Operation::combine);

        System.out.println("Sum: " + collector.getSum());
		
	}

}
