import java.util.Scanner;

public class Admin {// ��������ѧ������
	Scanner in = new Scanner(System.in);
	String msg = "\t���\t����\t����\tJAVA\tC#\thtml\tsql\t�ܷ�\tƽ����";

	public void print(Student[] arr) {// ����ѧ������Ϣ
		System.out.println(msg);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				arr[i].setSum();
				arr[i].setAvg();
				System.out.println(arr[i]);
			}
		}
	}

	public boolean exist(int on, Student stu) {// �ж�ѧ���Ƿ����
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

	public void create(String name, int age, Student[] arr) {// ���ѧ���ķ���
		Student stu = new Student();
		stu.setName(name);
		stu.setAge(age);
		int i = this.setIndex(arr);
		stu.setOn(i);
		if (this.setIndex(arr) == 99999) {
			System.err.println("������");
		} else {
			arr[this.setIndex(arr)] = stu;
			System.err.println("��ӳɹ�");
		}
		this.print(arr);
	}

	public int setIndex(Student[] arr) {// ����������Ϊ�յ��±�
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				return i;
			}
		}
		return 99999;
	}

	public void select(int on, Student[] arr) {// ����ѧ���ķ���
		System.out.println(msg);
		for (int i = 0; i < arr.length; i++) {
			if (this.exist(on, arr[i]) == true) {
				System.out.println(arr[i]);
				return;
			}
		}
		System.err.println("û�������ŵ�ѧ������");
	}

	public void update(int on, String name, int age, Student[] arr) {// ����ѧ����Ϣ
		for (int i = 0; i < arr.length; i++) {
			if (this.exist(on, arr[i]) == true) {
				arr[i].setName(name);
				arr[i].setAge(age);
				System.out.println("**********����ѧ����Ϣ�ɹ�**********");
				this.print(arr);
				return;
			}
		}
		System.err.println("��Ҫ������Ϣ��ѧ����Ų�����");
	}

	public void delete(int on, Student[] arr) {// ɾ��ѧ���ķ���
		for (int i = 0; i < arr.length; i++) {
			if (this.exist(on, arr[i])) {
				arr[i] = null;
				this.print(arr);
				return;
			}
		}
		System.err.println("����ָ����ŵ�ѧ��������");
	}

	public void input(int on, Student[] arr) {// ���ѧ���ɼ��ķ���
		for (int i = 0; i < arr.length; i++) {
			if (this.exist(on, arr[i])) {
				System.out.println("������" + arr[i].getName() + "��JAVA�ɼ�");
				if (in.hasNextInt()) {
					int java = in.nextInt();
					arr[i].setJava(java);

				}
				System.out.println("������" + arr[i].getName() + "��C#�ɼ�");
				if (in.hasNextInt()) {
					int c_shar = in.nextInt();
					arr[i].setC_shar(c_shar);

				}
				System.out.println("������" + arr[i].getName() + "��html�ɼ�");
				if (in.hasNextInt()) {
					int html = in.nextInt();
					arr[i].setHtml(html);
				}
				System.out.println("������" + arr[i].getName() + "��SQL�ɼ�");
				if (in.hasNextInt()) {
					int sql = in.nextInt();
					arr[i].setSql(sql);
				}
				this.print(arr);
				return;
			}
		}
		System.err.println("����ָ����ѧ����Ų�����");
	}

	public void courseSort(int number, Student[] arr) {// ����ָ����Ŀ�ĳɼ�����ķ���
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
			System.err.println("�������");
		}
		this.print(arr);
	}

	public void sumSort(Student[] arr) {// �����ֽܷ�������
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
