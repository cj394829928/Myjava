public class Student {// 学生类
	private int on;// 编号
	private String name;// 姓名
	private int age;// 年龄
	private int java;// java成绩
	private int c_shar;// c_shar成绩
	private int html;// html成绩
	private int sql;// sql成绩
	private int sum;// 总成绩
	private int avg;// 平均分

	public String toString() {
		String msg = "\t" + this.on + "\t" + this.name + "\t" + this.age + "\t" + this.java + "\t" + this.c_shar + "\t"
				+ this.html + "\t" + this.sql + "\t" + this.sum + "\t" + this.avg;
		return msg;
	}

	public int getOn() {
		return on;
	}

	public void setOn(int on) {
		this.on = on+1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 0 && age <= 30) {
			this.age = age;
		} else {
			System.err.println("你输入的年龄有误");
		}
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getC_shar() {
		return c_shar;
	}

	public void setC_shar(int c_shar) {
		this.c_shar = c_shar;
	}

	public int getHtml() {
		return html;
	}

	public void setHtml(int html) {
		this.html = html;
	}

	public int getSql() {
		return sql;
	}

	public void setSql(int sql) {
		this.sql = sql;
	}

	public int getSum() {
		return sum;
	}

	public void setSum() {
		this.sum = this.java + this.sql + this.html + this.c_shar;
	}

	public int getAvg() {
		return avg;
	}

	public void setAvg() {
		this.avg = this.sum / 4;
	}
}
