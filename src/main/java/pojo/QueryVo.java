package pojo;

import java.io.Serializable;

public class QueryVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Stu stu;

	public Stu getStu() {
		return stu;
	}

	public void setStu(Stu stu) {
		this.stu = stu;
	}

	@Override
	public String toString() {
		return "QueryVo [stu=" + stu + "]";
	}
}
