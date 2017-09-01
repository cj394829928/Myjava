import java.util.Scanner;

//System.out.println("编号\t姓名\t年龄\tJAVA\tC#\thtml\tsql\t总分\t平均分");
public class Test {// 测试类
	public static void main(String[] args) {
		String num;
		Scanner in = new Scanner(System.in);
		int n;
		while (true) {
			System.out.println("***定义学生的人数***");
			if (in.hasNextInt()) {
				n = in.nextInt();
				break;
			} else {
				System.err.println("输入错误，人数必须为正整数，程序结束");
			}
			return;
		}

		Student[] stuArr = new Student[n];
		Admin adminStu = new Admin();
		while (true) {
			System.err.println("***请选择你要执行的功能***");
			System.out.println("10:添加一个学生");
			System.out.println("11:查找一个学生");
			System.out.println("12:根据编号更新学生的基本信息");
			System.out.println("13:根据编号删除学生");
			System.out.println("14:根据编号输入学生的各科成绩");
			System.out.println("15:根据某门成绩进行排序");
			System.out.println("16:根据总分进行排序");
			System.out.println("99:退出系统");
			num = in.next();
			if (num.equals("10")) {
				System.out.println("请输入学生的姓名：");
				String name = in.next();
				System.out.println("请输入学生的年龄：");
				int age = in.nextInt();
				adminStu.create(name, age, stuArr);// 添加学生
			} else if (num.equals("11")) {
				System.out.println("执行查找学生的基本信息操作");
				System.out.println("请输入学生的编号进行查找");
				int on = in.nextInt();
				adminStu.select(on, stuArr);
			} else if (num.equals("12")) {
				System.out.println("执行更新学生的基本信息");
				System.out.println("请输入学生的编号：");
				int on = in.nextInt();
				System.out.println("请输入学生的姓名：");
				String name = in.next();
				System.out.println("请输入学生的年龄：");
				int age = in.nextInt();
				adminStu.update(on, name, age, stuArr);
			} else if (num.equals("13")) {
				System.out.println("执行删除学生的操作");
				System.out.println("请输入学生的编号：");
				int on = in.nextInt();
				adminStu.delete(on, stuArr);
			} else if (num.equals("14")) {
				System.out.println("执行输入成绩的操作");
				System.out.println("请输入学生的编号：");
				int on = in.nextInt();
				adminStu.input(on, stuArr);
			} else if (num.equals("15")) {
				System.out.println("执行成绩排序");
				System.out.println("选择用什么成绩排序(1.Java 2.c# 3.html 4.Sql)");
				int number = in.nextInt();
				adminStu.courseSort(number, stuArr);
			} else if (num.equals("16")) {
				System.err.println("*******执行总分成绩排序成功*******");
				adminStu.sumSort(stuArr);
			} else if (num.equals("99")) {
				System.err.println("退出系统成功！");
				System.exit(0);
			}
		}
	}
}
