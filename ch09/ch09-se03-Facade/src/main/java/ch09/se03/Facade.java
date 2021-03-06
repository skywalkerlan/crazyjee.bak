package ch09.se03;

public class Facade {
	// 定义被Facade封装的三个部门
	Payment pay;
	Cook cook;
	Waiter waiter;

	// 构造器
	public Facade() {
		this.pay = new PaymentImpl();
		this.cook = new CookImpl();
		this.waiter = new WaiterImpl();
	}

	public void serveFood() {
		// 依次调用三个部门的方法，封装成一个serveFood()方法
		String food = pay.pay();
		food = cook.cook(food);
		waiter.serve(food);
	}
}