import java.util.Scanner;

//System.out.println("���\t����\t����\tJAVA\tC#\thtml\tsql\t�ܷ�\tƽ����");
public class Test {// ������
	public static void main(String[] args) {
		String num;
		Scanner in = new Scanner(System.in);
		int n;
		while (true) {
			System.out.println("***����ѧ��������***");
			if (in.hasNextInt()) {
				n = in.nextInt();
				break;
			} else {
				System.err.println("���������������Ϊ���������������");
			}
			return;
		}

		Student[] stuArr = new Student[n];
		Admin adminStu = new Admin();
		while (true) {
			System.err.println("***��ѡ����Ҫִ�еĹ���***");
			System.out.println("10:���һ��ѧ��");
			System.out.println("11:����һ��ѧ��");
			System.out.println("12:���ݱ�Ÿ���ѧ���Ļ�����Ϣ");
			System.out.println("13:���ݱ��ɾ��ѧ��");
			System.out.println("14:���ݱ������ѧ���ĸ��Ƴɼ�");
			System.out.println("15:����ĳ�ųɼ���������");
			System.out.println("16:�����ֽܷ�������");
			System.out.println("99:�˳�ϵͳ");
			num = in.next();
			if (num.equals("10")) {
				System.out.println("������ѧ����������");
				String name = in.next();
				System.out.println("������ѧ�������䣺");
				int age = in.nextInt();
				adminStu.create(name, age, stuArr);// ���ѧ��
			} else if (num.equals("11")) {
				System.out.println("ִ�в���ѧ���Ļ�����Ϣ����");
				System.out.println("������ѧ���ı�Ž��в���");
				int on = in.nextInt();
				adminStu.select(on, stuArr);
			} else if (num.equals("12")) {
				System.out.println("ִ�и���ѧ���Ļ�����Ϣ");
				System.out.println("������ѧ���ı�ţ�");
				int on = in.nextInt();
				System.out.println("������ѧ����������");
				String name = in.next();
				System.out.println("������ѧ�������䣺");
				int age = in.nextInt();
				adminStu.update(on, name, age, stuArr);
			} else if (num.equals("13")) {
				System.out.println("ִ��ɾ��ѧ���Ĳ���");
				System.out.println("������ѧ���ı�ţ�");
				int on = in.nextInt();
				adminStu.delete(on, stuArr);
			} else if (num.equals("14")) {
				System.out.println("ִ������ɼ��Ĳ���");
				System.out.println("������ѧ���ı�ţ�");
				int on = in.nextInt();
				adminStu.input(on, stuArr);
			} else if (num.equals("15")) {
				System.out.println("ִ�гɼ�����");
				System.out.println("ѡ����ʲô�ɼ�����(1.Java 2.c# 3.html 4.Sql)");
				int number = in.nextInt();
				adminStu.courseSort(number, stuArr);
			} else if (num.equals("16")) {
				System.err.println("*******ִ���ֳܷɼ�����ɹ�*******");
				adminStu.sumSort(stuArr);
			} else if (num.equals("99")) {
				System.err.println("�˳�ϵͳ�ɹ���");
				System.exit(0);
			}
		}
	}
}
