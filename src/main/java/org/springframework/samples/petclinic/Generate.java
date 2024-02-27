package org.springframework.samples.petclinic;

class Generate {
	static int xxx = 5;

	public Generate() {
		this.xxx = xxx;
	}

	public static void main(String[] args) {
		Generate test = new Generate();
		System.out.println(test.xxx);//test
		System.out.println("test");
		xxx = 2;
	}
}
