public class fizzbuzz {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if(i % 3 == 0){
                System.out.println("fizz");
            } else if (i % 5 == 0) {
		System.out.println("buzz");
	    } else if (i % 15 == 0) {
		System.out.pringln("fizzbuzz");
	    }else {
                System.out.println(i);
            }
        }
   }

