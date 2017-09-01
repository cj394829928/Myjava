import java.util.Scanner;

public class Admin {// 用来管理学生的类
	Scanner in = new Scanner(System.in);
	String msg = "\t编号\t姓名\t年龄\tJAVA\tC#\thtml\tsql\t总分\t平均分";

	public void print(Student[] arr) {// 更新学生的信息
		System.out.println(msg);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				arr[i].setSum();
				arr[i].setAvg();
				System.out.println(arr[i]);
			}
		}
	}

	public boolean exist(int on, Student stu) {// 判断学生是否存在
		if (stu != null) {
			if (stu.getOn() == on) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public void create(String name, int age, Student[] arr) {// 添加学生的方法
		Student stu = new Student();
		stu.setName(name);
		stu.setAge(age);
		int i = this.setIndex(arr);
		stu.setOn(i);
		if (this.setIndex(arr) == 99999) {
			System.err.println("添加完成");
		} else {
			arr[this.setIndex(arr)] = stu;
			System.err.println("添加成功");
		}
		this.print(arr);
	}

	public int setIndex(Student[] arr) {// 返回数组里为空的下标
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				return i;
			}
		}
		return 99999;
	}

	public void select(int on, Student[] arr) {// 查找学生的方法
		System.out.println(msg);
		for (int i = 0; i < arr.length; i++) {
			if (this.exist(on, arr[i]) == true) {
				System.out.println(arr[i]);
				return;
			}
		}
		System.err.println("没有这个编号的学生存在");
	}

	public void update(int on, String name, int age, Student[] arr) {// 更新学生信息
		for (int i = 0; i < arr.length; i++) {
			if (this.exist(on, arr[i]) == true) {
				arr[i].setName(name);
				arr[i].setAge(age);
				System.out.println("**********更新学生信息成功**********");
				this.print(arr);
				return;
			}
		}
		System.err.println("你要更新信息的学生编号不存在");
	}

	public void delete(int on, Student[] arr) {// 删除学生的方法
		for (int i = 0; i < arr.length; i++) {
			if (this.exist(on, arr[i])) {
				arr[i] = null;
				this.print(arr);
				return;
			}
		}
		System.err.println("你所指定编号的学生不存在");
	}

	public void input(int on, Student[] arr) {// 添加学生成绩的方法
		for (int i = 0; i < arr.length; i++) {
			if (this.exist(on, arr[i])) {
				System.out.println("请输入" + arr[i].getName() + "的JAVA成绩");
				if (in.hasNextInt()) {
					int java = in.nextInt();
					arr[i].setJava(java);

				}
				System.out.println("请输入" + arr[i].getName() + "的C#成绩");
				if (in.hasNextInt()) {
					int c_shar = in.nextInt();
					arr[i].setC_shar(c_shar);

				}
				System.out.println("请输入" + arr[i].getName() + "的html成绩");
				if (in.hasNextInt()) {
					int html = in.nextInt();
					arr[i].setHtml(html);
				}
				System.out.println("请输入" + arr[i].getName() + "的SQL成绩");
				if (in.hasNextInt()) {
					int sql = in.nextInt();
					arr[i].setSql(sql);
				}
				this.print(arr);
				return;
			}
		}
		System.err.println("你所指定的学生编号不存在");
	}

	public void courseSort(int number, Student[] arr) {// 根据指定科目的成绩排序的方法
		if (number == 1) {
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] != null && arr[j] != null) {
						if (arr[i].getJava() < arr[j].getJava()) {
							Student temp = arr[i];
							arr[i] = arr[j];
							arr[j] = temp;
						}
					}
				}
			}
		} else if (number == 2) {
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] != null && arr[j] != null) {
						if (arr[i].getC_shar() < arr[j].getC_shar()) {
							Student temp = arr[i];
							arr[i] = arr[j];
							arr[j] = temp;
						}
					}
				}
			}
		} else if (number == 3) {
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] != null && arr[j] != null) {
						if (arr[i].getHtml() < arr[j].getHtml()) {
							Student temp = arr[i];
							arr[i] = arr[j];
							arr[j] = temp;
						}
					}
				}
			}
		} else if (number == 4) {
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] != null && arr[j] != null) {
						if (arr[i].getSql() < arr[j].getSql()) {
							Student temp = arr[i];
							arr[i] = arr[j];
							arr[j] = temp;
						}
					}
				}
			}
		} else {
			System.err.println("输入错误");
		}
		this.print(arr);
	}

	public void sumSort(Student[] arr) {// 根据总分进行排序
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] != null && arr[j] != null) {
					if (arr[i].getSum() < arr[j].getSum()) {
						Student temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
		}
		this.print(arr);
	}
}
