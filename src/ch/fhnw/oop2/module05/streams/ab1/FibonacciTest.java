package ch.fhnw.oop2.module05.streams.ab1;

import java.util.stream.Stream;

public class FibonacciTest {

	public static void main(String[] args) {
		//Ansatz mit Tuple-Klasse
		//Stream.iterate(new Tuple<Integer>(0,1), n -> new Tuple<Integer>(t2, t1+t2))
		//.limit(30)
		//.forEach(n -> System.out.println(n));
		
		
		//Ansatz ohne Tuple-Klasse
		Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
		.limit(30)
		.forEach(x -> System.out.println("{" + x[0] + "," + x[1] + "}"));

	}

}
